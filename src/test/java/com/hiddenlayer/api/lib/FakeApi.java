package com.hiddenlayer.api.lib;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/** A local HTTP server that answers requests from a script and records what it received. */
public final class FakeApi implements AutoCloseable {
    private final HttpServer server;

    private final Map<String, Deque<Reply>> replies = new ConcurrentHashMap<>();

    private final List<Received> received = Collections.synchronizedList(new ArrayList<Received>());

    public FakeApi() throws IOException {
        this.server = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
        this.server.createContext("/", this::handle);
        this.server.start();
    }

    public String url() {
        return "http://127.0.0.1:" + server.getAddress().getPort();
    }

    /** Queues a JSON reply for a method and path. Replies are sent in order, and the last one repeats. */
    public FakeApi reply(String method, String path, int status, String body) {
        replies.computeIfAbsent(method + " " + path, key -> new ArrayDeque<>()).add(new Reply(status, body));
        return this;
    }

    public List<Received> received() {
        synchronized (received) {
            return new ArrayList<>(received);
        }
    }

    public List<Received> received(String method, String path) {
        List<Received> matching = new ArrayList<>();
        for (Received request : received()) {
            if (request.method.equals(method) && request.path.equals(path)) {
                matching.add(request);
            }
        }
        return matching;
    }

    @Override
    public void close() {
        server.stop(0);
    }

    private void handle(HttpExchange exchange) throws IOException {
        String method = exchange.getRequestMethod();
        String path = exchange.getRequestURI().getPath();
        received.add(new Received(
                method,
                path,
                exchange.getRequestURI().getQuery(),
                exchange.getRequestHeaders(),
                readAll(exchange.getRequestBody())));
        Reply reply = nextReply(method + " " + path);
        byte[] body = reply.body.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().add("Content-Type", "application/json");
        exchange.sendResponseHeaders(reply.status, body.length);
        try (OutputStream response = exchange.getResponseBody()) {
            response.write(body);
        }
    }

    private Reply nextReply(String key) {
        Deque<Reply> queued = replies.get(key);
        if (queued == null) {
            return new Reply(501, "{\"detail\":\"FakeApi has no reply for " + key + "\"}");
        }
        synchronized (queued) {
            return queued.size() > 1 ? queued.poll() : queued.peek();
        }
    }

    private static byte[] readAll(InputStream stream) throws IOException {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        byte[] buffer = new byte[8192];
        int read;
        while ((read = stream.read(buffer)) != -1) {
            bytes.write(buffer, 0, read);
        }
        return bytes.toByteArray();
    }

    private static final class Reply {
        private final int status;

        private final String body;

        private Reply(int status, String body) {
            this.status = status;
            this.body = body;
        }
    }

    /** One request as the server received it. */
    public static final class Received {
        public final String method;

        public final String path;

        public final String query;

        public final byte[] body;

        private final Map<String, List<String>> headers;

        private Received(String method, String path, String query, Map<String, List<String>> headers, byte[] body) {
            this.method = method;
            this.path = path;
            this.query = query;
            this.headers = headers;
            this.body = body;
        }

        /** The header's first value, or null. Header names match in any case. */
        public String header(String name) {
            for (Map.Entry<String, List<String>> header : headers.entrySet()) {
                if (header.getKey().equalsIgnoreCase(name) && !header.getValue().isEmpty()) {
                    return header.getValue().get(0);
                }
            }
            return null;
        }

        public String bodyText() {
            return new String(body, StandardCharsets.UTF_8);
        }

        @Override
        public String toString() {
            return method + " " + path + (query == null ? "" : "?" + query);
        }
    }
}
