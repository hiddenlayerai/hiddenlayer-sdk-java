package com.hiddenlayer.scan;

import com.fasterxml.jackson.databind.ObjectMapper; 
import com.fasterxml.jackson.databind.ObjectWriter;
import com.hiddenlayer.sdk.Configuration;
import com.hiddenlayer.sdk.ModelScanService;
import com.hiddenlayer.sdk.rest.models.ScanReportV3;
import org.apache.commons.cli.*;

public class ScanModel {
    public static void main(String[] args) throws Exception {
        Options options = new Options();
        Option file = new Option("f", "file", true, "file to scan");
        file.setRequired(true);
        options.addOption(file);

        Option model = new Option("m", "model", true, "model name");
        model.setRequired(true);
        options.addOption(model);

        Option clientId = new Option("c", "client-id", true, "client id");
        clientId.setRequired(true);
        options.addOption(clientId);

        Option clientSecret = new Option("s", "client-secret", true, "client secret");
        clientSecret.setRequired(true);
        options.addOption(clientSecret);

        Option hlAuthUrl = new Option("a", "auth-url", true, "HiddenLayer auth URL");
        hlAuthUrl.setRequired(false);
        options.addOption(hlAuthUrl);

        Option hlApiUrl = new Option("u", "api-url", true, "HiddenLayer API URL");
        hlApiUrl.setRequired(false);
        options.addOption(hlApiUrl);

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd = null;//not a good practice, it serves it purpose 

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("utility-name", options);

            System.exit(1);
        }

        String filePath = cmd.getOptionValue("file");
        String modelName = cmd.getOptionValue("model");
        String apiId = cmd.getOptionValue("client-id");
        String apiSecret = cmd.getOptionValue("client-secret");

        Configuration configuration;

        if (cmd.hasOption("auth-url")) {
            String authUrl = cmd.getOptionValue("auth-url");
            String apiUrl = cmd.getOptionValue("api-url");
            configuration = new Configuration(apiId, apiSecret, authUrl, apiUrl);
        } else {
            configuration = new Configuration(apiId, apiSecret);
        }

        ModelScanService modelScanService = new ModelScanService(configuration);
        ScanReportV3 report = modelScanService.scanFile(filePath, modelName, true);

        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(report);

        System.out.println(json);
    }
}
