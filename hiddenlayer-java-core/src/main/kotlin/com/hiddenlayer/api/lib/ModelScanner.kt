/**
 * Model scanning functionality for Hidden Layer SDK.
 *
 * This module provides the model scanning methods that were available in the old SDK, including
 * scanFile and scanFolder methods with multipart upload functionality.
 */
package com.hiddenlayer.api.lib

import com.hiddenlayer.api.client.HiddenLayerClient
import com.hiddenlayer.api.client.HiddenLayerClientAsync
import com.hiddenlayer.api.models.scans.results.ScanReport
import com.hiddenlayer.api.models.scans.upload.UploadStartParams
import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executors
import java.util.logging.Logger
import kotlin.streams.toList

// Exclude patterns matching the old SDK
private val EXCLUDE_FILE_TYPES =
    listOf("*.txt", "*.md", "*.lock", ".gitattributes", ".git", ".git/*", "*/.git", "**/.git/**")

private val logger = Logger.getLogger("ModelScanner")

/** Options for scanning a single file. */
data class ScanFileOptions(
    val modelName: String,
    val modelPath: String,
    val modelVersion: String = "1",
    val waitForResults: Boolean = true,
    val requestSource: String = "API Upload",
    val origin: String = "",
)

/** Options for scanning a folder. */
data class ScanFolderOptions(
    val modelName: String,
    val path: String,
    val modelVersion: String = "1",
    val allowFilePatterns: List<String> = emptyList(),
    val ignoreFilePatterns: List<String> = EXCLUDE_FILE_TYPES,
    val waitForResults: Boolean = true,
    val requestSource: String = "API Upload",
    val origin: String = "",
)

/**
 * Model scanner that provides file and folder scanning functionality.
 *
 * This class extends the generated SDK to provide the same functionality as the old SDK's
 * ModelScanAPI, including multipart upload functionality for files and folders.
 */
class ModelScanner(private val client: HiddenLayerClient) {

    /**
     * Scan a single local file.
     *
     * @param options The scan options
     * @return Scan Results
     * @throws RuntimeException if the scan fails
     */
    fun scanFile(options: ScanFileOptions): ScanReport {
        val file = File(options.modelPath)
        if (!file.exists()) {
            throw RuntimeException("File does not exist: ${options.modelPath}")
        }
        if (!file.isFile) {
            throw RuntimeException("Path is not a file: ${options.modelPath}")
        }

        logger.info("Starting file scan for: ${options.modelPath}")

        // Start upload session
        val uploadStartParams =
            UploadStartParams.builder()
                .modelName(options.modelName)
                .modelVersion(options.modelVersion)
                .requestingEntity("hiddenlayer-java-sdk")
                .requestSource(
                    when (options.requestSource) {
                        "Hybrid Upload" -> UploadStartParams.RequestSource.HYBRID_UPLOAD
                        "API Upload" -> UploadStartParams.RequestSource.API_UPLOAD
                        "Integration" -> UploadStartParams.RequestSource.INTEGRATION
                        "UI Upload" -> UploadStartParams.RequestSource.UI_UPLOAD
                        else -> UploadStartParams.RequestSource.of(options.requestSource)
                    }
                )
                .origin(options.origin)
                .build()

        val uploadStart = client.scans().upload().start(uploadStartParams)
        val scanId: String =
            uploadStart.scanId().orElseThrow {
                RuntimeException("Upload start did not return scan ID")
            }

        try {
            // Upload the file
            uploadFile(scanId, file.toPath())

            // Complete the upload
            client
                .scans()
                .upload()
                .completeAll(
                    com.hiddenlayer.api.models.scans.upload.UploadCompleteAllParams.builder()
                        .scanId(scanId)
                        .build()
                )

            // Return results based on waitForResults flag
            return if (options.waitForResults) {
                waitForScanResults(client, scanId)
            } else {
                getScanResults(client, scanId)
            }
        } catch (e: Exception) {
            logger.severe("Failed to upload file: ${e.message}")
            throw RuntimeException("File scan failed: ${e.message}", e)
        }
    }

    /** Convenience method with individual parameters. */
    @JvmOverloads
    fun scanFile(
        modelName: String,
        modelPath: String,
        modelVersion: String = "1",
        waitForResults: Boolean = true,
        requestSource: String = "API Upload",
        origin: String = "",
    ): ScanReport {
        return scanFile(
            ScanFileOptions(
                modelName = modelName,
                modelPath = modelPath,
                modelVersion = modelVersion,
                waitForResults = waitForResults,
                requestSource = requestSource,
                origin = origin,
            )
        )
    }

    /**
     * Scan all files in a directory recursively.
     *
     * @param options The scan options
     * @return Scan Results
     * @throws RuntimeException if the scan fails
     */
    fun scanFolder(options: ScanFolderOptions): ScanReport {
        val path = Paths.get(options.path)
        if (!Files.exists(path)) {
            throw RuntimeException("Directory does not exist: ${options.path}")
        }
        if (!Files.isDirectory(path)) {
            throw RuntimeException("Path is not a directory: ${options.path}")
        }

        logger.info("Starting folder scan for: ${options.path}")

        // Get filtered list of files
        val files = getFilteredFiles(path, options.allowFilePatterns, options.ignoreFilePatterns)
        if (files.isEmpty()) {
            throw RuntimeException("No files found to scan in directory: ${options.path}")
        }

        logger.info("Found ${files.size} files to scan")

        // Start upload session
        val uploadStartParams =
            UploadStartParams.builder()
                .modelName(options.modelName)
                .modelVersion(options.modelVersion)
                .requestingEntity("hiddenlayer-java-sdk")
                .requestSource(
                    when (options.requestSource) {
                        "Hybrid Upload" -> UploadStartParams.RequestSource.HYBRID_UPLOAD
                        "API Upload" -> UploadStartParams.RequestSource.API_UPLOAD
                        "Integration" -> UploadStartParams.RequestSource.INTEGRATION
                        "UI Upload" -> UploadStartParams.RequestSource.UI_UPLOAD
                        else -> UploadStartParams.RequestSource.of(options.requestSource)
                    }
                )
                .origin(options.origin)
                .build()

        val uploadStart = client.scans().upload().start(uploadStartParams)
        val scanId: String =
            uploadStart.scanId().orElseThrow {
                RuntimeException("Upload start did not return scan ID")
            }

        try {
            // Upload each file
            for (file in files) {
                uploadFile(scanId, file)
            }

            // Complete the upload
            client
                .scans()
                .upload()
                .completeAll(
                    com.hiddenlayer.api.models.scans.upload.UploadCompleteAllParams.builder()
                        .scanId(scanId)
                        .build()
                )

            // Return results based on waitForResults flag
            return if (options.waitForResults) {
                waitForScanResults(client, scanId)
            } else {
                getScanResults(client, scanId)
            }
        } catch (e: Exception) {
            logger.severe("Failed to upload folder: ${e.message}")
            throw RuntimeException("Folder scan failed: ${e.message}", e)
        }
    }

    /** Convenience method with individual parameters. */
    @JvmOverloads
    fun scanFolder(
        modelName: String,
        path: String,
        modelVersion: String = "1",
        allowFilePatterns: List<String> = emptyList(),
        ignoreFilePatterns: List<String> = EXCLUDE_FILE_TYPES,
        waitForResults: Boolean = true,
        requestSource: String = "API Upload",
        origin: String = "",
    ): ScanReport {
        return scanFolder(
            ScanFolderOptions(
                modelName = modelName,
                path = path,
                modelVersion = modelVersion,
                allowFilePatterns = allowFilePatterns,
                ignoreFilePatterns = ignoreFilePatterns,
                waitForResults = waitForResults,
                requestSource = requestSource,
                origin = origin,
            )
        )
    }

    /** Upload a single file using multipart upload. */
    private fun uploadFile(scanId: String, filePath: Path) {
        val fileSize = Files.size(filePath)
        val fileName = filePath.fileName.toString()
        val file = filePath.toFile()

        // Initiate multipart upload for this file
        val upload =
            client
                .scans()
                .upload()
                .file()
                .add(
                    com.hiddenlayer.api.models.scans.upload.file.FileAddParams.builder()
                        .scanId(scanId)
                        .fileName(fileName)
                        .fileContentLength(fileSize)
                        .build()
                )

        // Upload each part
        for (part in upload.parts()) {
            val startOffset = part.startOffset().orElse(0L)
            val endOffset = part.endOffset().orElse(fileSize)
            val uploadUrl =
                part.uploadUrl().orElseThrow {
                    RuntimeException("Part upload URL must not be null")
                }

            // Use RandomAccessFile for proper seeking
            java.io.RandomAccessFile(file, "r").use { randomAccessFile ->
                // Seek to the absolute start offset
                randomAccessFile.seek(startOffset)

                // Read the part data
                val readAmount = (endOffset - startOffset).toInt()
                val partData = ByteArray(readAmount)
                var totalRead = 0
                while (totalRead < readAmount) {
                    val read = randomAccessFile.read(partData, totalRead, readAmount - totalRead)
                    if (read == -1) break
                    totalRead += read
                }

                // Upload this part directly to the presigned URL using HTTP PUT
                uploadPartToUrl(uploadUrl, partData)
            }
        }

        // Complete the file upload
        client
            .scans()
            .upload()
            .file()
            .complete(
                com.hiddenlayer.api.models.scans.upload.file.FileCompleteParams.builder()
                    .fileId(upload.uploadId())
                    .scanId(scanId)
                    .build()
            )
    }

    /** Upload a part to the presigned URL using HTTP PUT. */
    private fun uploadPartToUrl(uploadUrl: String, partData: ByteArray) {
        val url = java.net.URL(uploadUrl)
        val connection = url.openConnection() as java.net.HttpURLConnection

        try {
            connection.requestMethod = "PUT"
            connection.setRequestProperty("Content-Type", "application/octet-stream")
            connection.setRequestProperty("Content-Length", partData.size.toString())
            connection.doOutput = true

            connection.outputStream.use { outputStream ->
                outputStream.write(partData)
                outputStream.flush()
            }

            val responseCode = connection.responseCode
            if (responseCode < 200 || responseCode >= 300) {
                throw RuntimeException("Failed to upload part: HTTP $responseCode")
            }
        } catch (e: Exception) {
            throw RuntimeException("Failed to upload part to URL: $uploadUrl", e)
        } finally {
            connection.disconnect()
        }
    }

    /** Filter files based on allow and ignore patterns. */
    private fun getFilteredFiles(
        path: Path,
        allowPatterns: List<String>,
        ignorePatterns: List<String>,
    ): List<Path> {
        return Files.walk(path)
            .filter { Files.isRegularFile(it) }
            .filter { file ->
                val fileName = file.toString()

                // Apply allow patterns if specified
                if (allowPatterns.isNotEmpty()) {
                    val allowed = allowPatterns.any { pattern -> matchesPattern(fileName, pattern) }
                    if (!allowed) return@filter false
                }

                // Apply ignore patterns
                val ignored = ignorePatterns.any { pattern -> matchesPattern(fileName, pattern) }
                !ignored
            }
            .toList()
    }

    /** Simple pattern matching for file filtering. */
    private fun matchesPattern(fileName: String, pattern: String): Boolean {
        val regex =
            pattern
                .replace("\\", "\\\\") // Escape backslashes first
                .replace(".", "\\.") // Escape dots
                .replace("**", "DOUBLE_STAR_PLACEHOLDER") // Handle ** first
                .replace("*", "[^/]*") // * matches anything except path separator
                .replace("DOUBLE_STAR_PLACEHOLDER", ".*") // ** matches anything including /
                .replace("?", ".") // ? matches single character
        return fileName.matches(Regex(regex))
    }
}

/**
 * Async version of ModelScanner for use with HiddenLayerClientAsync.
 *
 * This class provides async versions of all model scanning functionality, including file and folder
 * scanning with multipart upload functionality.
 *
 * **Important**: This class implements `AutoCloseable` and manages a thread pool internally. Always
 * use it in a try-with-resources block or explicitly call `close()` when done to ensure proper
 * resource cleanup.
 *
 * Example usage:
 * ```kotlin
 * AsyncModelScanner(client).use { scanner ->
 *     val result = scanner.scanFile(options).get()
 * }
 * ```
 */
class AsyncModelScanner(private val client: HiddenLayerClientAsync) : AutoCloseable {

    /** Thread pool for async file operations and scheduling */
    private val executor = Executors.newScheduledThreadPool(10)

    /**
     * Async version of scanFile.
     *
     * @param options The scan options
     * @return CompletableFuture containing the scan results
     */
    fun scanFile(options: ScanFileOptions): CompletableFuture<ScanReport> {
        return CompletableFuture.supplyAsync(
                {
                    val file = File(options.modelPath)
                    if (!file.exists()) {
                        throw RuntimeException("File does not exist: ${options.modelPath}")
                    }
                    if (!file.isFile) {
                        throw RuntimeException("Path is not a file: ${options.modelPath}")
                    }

                    logger.info("Starting async file scan for: ${options.modelPath}")
                    file
                },
                executor,
            )
            .thenCompose { file ->
                // Start upload session
                val uploadStartParams =
                    UploadStartParams.builder()
                        .modelName(options.modelName)
                        .modelVersion(options.modelVersion)
                        .requestingEntity("hiddenlayer-java-sdk")
                        .requestSource(
                            when (options.requestSource) {
                                "Hybrid Upload" -> UploadStartParams.RequestSource.HYBRID_UPLOAD
                                "API Upload" -> UploadStartParams.RequestSource.API_UPLOAD
                                "Integration" -> UploadStartParams.RequestSource.INTEGRATION
                                "UI Upload" -> UploadStartParams.RequestSource.UI_UPLOAD
                                else -> UploadStartParams.RequestSource.of(options.requestSource)
                            }
                        )
                        .origin(options.origin)
                        .build()

                client.scans().upload().start(uploadStartParams).thenCompose { uploadStart ->
                    val scanId: String =
                        uploadStart.scanId().orElseThrow {
                            RuntimeException("Upload start did not return scan ID")
                        }

                    // Upload the file async
                    uploadFileAsync(scanId, file.toPath()).thenCompose {
                        // Complete the upload
                        client
                            .scans()
                            .upload()
                            .completeAll(
                                com.hiddenlayer.api.models.scans.upload.UploadCompleteAllParams
                                    .builder()
                                    .scanId(scanId)
                                    .build()
                            )
                            .thenCompose {
                                // Return results based on waitForResults flag
                                if (options.waitForResults) {
                                    waitForScanResultsAsync(client, scanId, executor)
                                } else {
                                    getScanResultsAsync(client, scanId, executor)
                                }
                            }
                    }
                }
            }
            .whenComplete { result, exception ->
                if (exception != null) {
                    logger.severe("Failed to upload file: ${exception.message}")
                }
            }
    }

    /** Convenience method with individual parameters. */
    @JvmOverloads
    fun scanFile(
        modelName: String,
        modelPath: String,
        modelVersion: String = "1",
        waitForResults: Boolean = true,
        requestSource: String = "API Upload",
        origin: String = "",
    ): CompletableFuture<ScanReport> {
        return scanFile(
            ScanFileOptions(
                modelName = modelName,
                modelPath = modelPath,
                modelVersion = modelVersion,
                waitForResults = waitForResults,
                requestSource = requestSource,
                origin = origin,
            )
        )
    }

    /**
     * Async version of scanFolder.
     *
     * @param options The scan options
     * @return CompletableFuture containing the scan results
     */
    fun scanFolder(options: ScanFolderOptions): CompletableFuture<ScanReport> {
        return CompletableFuture.supplyAsync(
                {
                    val path = Paths.get(options.path)
                    if (!Files.exists(path)) {
                        throw RuntimeException("Directory does not exist: ${options.path}")
                    }
                    if (!Files.isDirectory(path)) {
                        throw RuntimeException("Path is not a directory: ${options.path}")
                    }

                    logger.info("Starting async folder scan for: ${options.path}")

                    // Get filtered list of files
                    val files =
                        getFilteredFiles(
                            path,
                            options.allowFilePatterns,
                            options.ignoreFilePatterns,
                        )
                    if (files.isEmpty()) {
                        throw RuntimeException(
                            "No files found to scan in directory: ${options.path}"
                        )
                    }

                    logger.info("Found ${files.size} files to scan")
                    files
                },
                executor,
            )
            .thenCompose { files ->
                // Start upload session
                val uploadStartParams =
                    UploadStartParams.builder()
                        .modelName(options.modelName)
                        .modelVersion(options.modelVersion)
                        .requestingEntity("hiddenlayer-java-sdk")
                        .requestSource(
                            when (options.requestSource) {
                                "Hybrid Upload" -> UploadStartParams.RequestSource.HYBRID_UPLOAD
                                "API Upload" -> UploadStartParams.RequestSource.API_UPLOAD
                                "Integration" -> UploadStartParams.RequestSource.INTEGRATION
                                "UI Upload" -> UploadStartParams.RequestSource.UI_UPLOAD
                                else -> UploadStartParams.RequestSource.of(options.requestSource)
                            }
                        )
                        .origin(options.origin)
                        .build()

                client.scans().upload().start(uploadStartParams).thenCompose { uploadStart ->
                    val scanId: String =
                        uploadStart.scanId().orElseThrow {
                            RuntimeException("Upload start did not return scan ID")
                        }

                    // Upload each file async
                    val uploadFutures = files.map { file -> uploadFileAsync(scanId, file) }
                    CompletableFuture.allOf(*uploadFutures.toTypedArray()).thenCompose {
                        // Complete the upload
                        client
                            .scans()
                            .upload()
                            .completeAll(
                                com.hiddenlayer.api.models.scans.upload.UploadCompleteAllParams
                                    .builder()
                                    .scanId(scanId)
                                    .build()
                            )
                            .thenCompose {
                                // Return results based on waitForResults flag
                                if (options.waitForResults) {
                                    waitForScanResultsAsync(client, scanId, executor)
                                } else {
                                    getScanResultsAsync(client, scanId, executor)
                                }
                            }
                    }
                }
            }
            .whenComplete { result, exception ->
                if (exception != null) {
                    logger.severe("Failed to upload folder: ${exception.message}")
                }
            }
    }

    /** Convenience method with individual parameters. */
    @JvmOverloads
    fun scanFolder(
        modelName: String,
        path: String,
        modelVersion: String = "1",
        allowFilePatterns: List<String> = emptyList(),
        ignoreFilePatterns: List<String> = EXCLUDE_FILE_TYPES,
        waitForResults: Boolean = true,
        requestSource: String = "API Upload",
        origin: String = "",
    ): CompletableFuture<ScanReport> {
        return scanFolder(
            ScanFolderOptions(
                modelName = modelName,
                path = path,
                modelVersion = modelVersion,
                allowFilePatterns = allowFilePatterns,
                ignoreFilePatterns = ignoreFilePatterns,
                waitForResults = waitForResults,
                requestSource = requestSource,
                origin = origin,
            )
        )
    }

    /** Async version of uploadFile using multipart upload. */
    private fun uploadFileAsync(scanId: String, filePath: Path): CompletableFuture<Void> {
        return CompletableFuture.supplyAsync(
                {
                    val fileSize = Files.size(filePath)
                    val fileName = filePath.fileName.toString()

                    Triple(fileSize, fileName, filePath.toFile())
                },
                executor,
            )
            .thenCompose { (fileSize, fileName, file) ->
                // Initiate multipart upload for this file
                client
                    .scans()
                    .upload()
                    .file()
                    .add(
                        com.hiddenlayer.api.models.scans.upload.file.FileAddParams.builder()
                            .scanId(scanId)
                            .fileName(fileName)
                            .fileContentLength(fileSize)
                            .build()
                    )
                    .thenCompose { upload ->
                        // Upload each part async
                        val partFutures =
                            upload.parts().map { part ->
                                CompletableFuture.supplyAsync(
                                        {
                                            val startOffset = part.startOffset().orElse(0L)
                                            val endOffset = part.endOffset().orElse(fileSize)
                                            val uploadUrl =
                                                part.uploadUrl().orElseThrow {
                                                    RuntimeException(
                                                        "Part upload URL must not be null"
                                                    )
                                                }

                                            // Use RandomAccessFile for proper seeking
                                            java.io.RandomAccessFile(file, "r").use {
                                                randomAccessFile ->
                                                // Seek to the absolute start offset
                                                randomAccessFile.seek(startOffset)

                                                // Read the part data
                                                val readAmount = (endOffset - startOffset).toInt()
                                                val partData = ByteArray(readAmount)
                                                var totalRead = 0
                                                while (totalRead < readAmount) {
                                                    val read =
                                                        randomAccessFile.read(
                                                            partData,
                                                            totalRead,
                                                            readAmount - totalRead,
                                                        )
                                                    if (read == -1) break
                                                    totalRead += read
                                                }

                                                Triple(uploadUrl, partData, part)
                                            }
                                        },
                                        executor,
                                    )
                                    .thenCompose { (uploadUrl, partData, _) ->
                                        uploadPartToUrlAsync(uploadUrl, partData)
                                    }
                            }

                        CompletableFuture.allOf(*partFutures.toTypedArray()).thenCompose {
                            // Complete the file upload
                            client
                                .scans()
                                .upload()
                                .file()
                                .complete(
                                    com.hiddenlayer.api.models.scans.upload.file
                                        .FileCompleteParams
                                        .builder()
                                        .fileId(upload.uploadId())
                                        .scanId(scanId)
                                        .build()
                                )
                                .thenApply { null }
                        }
                    }
            }
            .thenCompose { it }
    }

    /** Async version of uploadPartToUrl using HTTP PUT. */
    private fun uploadPartToUrlAsync(
        uploadUrl: String,
        partData: ByteArray,
    ): CompletableFuture<Void> {
        return CompletableFuture.supplyAsync(
            {
                val url = java.net.URL(uploadUrl)
                val connection = url.openConnection() as java.net.HttpURLConnection

                try {
                    connection.requestMethod = "PUT"
                    connection.setRequestProperty("Content-Type", "application/octet-stream")
                    connection.setRequestProperty("Content-Length", partData.size.toString())
                    connection.doOutput = true

                    connection.outputStream.use { outputStream ->
                        outputStream.write(partData)
                        outputStream.flush()
                    }

                    val responseCode = connection.responseCode
                    if (responseCode < 200 || responseCode >= 300) {
                        throw RuntimeException("Failed to upload part: HTTP $responseCode")
                    }
                    null
                } catch (e: Exception) {
                    throw RuntimeException("Failed to upload part to URL: $uploadUrl", e)
                } finally {
                    connection.disconnect()
                }
            },
            executor,
        )
    }

    /** Helper method to get filtered files (same logic as sync version). */
    private fun getFilteredFiles(
        path: Path,
        allowPatterns: List<String>,
        ignorePatterns: List<String>,
    ): List<Path> {
        return Files.walk(path)
            .filter { Files.isRegularFile(it) }
            .filter { file ->
                val fileName = file.toString()

                // Apply allow patterns if specified
                if (allowPatterns.isNotEmpty()) {
                    val allowed = allowPatterns.any { pattern -> matchesPattern(fileName, pattern) }
                    if (!allowed) return@filter false
                }

                // Apply ignore patterns
                val ignored = ignorePatterns.any { pattern -> matchesPattern(fileName, pattern) }
                !ignored
            }
            .toList()
    }

    /** Helper method for pattern matching (same logic as sync version). */
    private fun matchesPattern(fileName: String, pattern: String): Boolean {
        val regex =
            pattern
                .replace("\\", "\\\\") // Escape backslashes first
                .replace(".", "\\.") // Escape dots
                .replace("**", "DOUBLE_STAR_PLACEHOLDER") // Handle ** first
                .replace("*", "[^/]*") // * matches anything except path separator
                .replace("DOUBLE_STAR_PLACEHOLDER", ".*") // ** matches anything including /
                .replace("?", ".") // ? matches single character
        return fileName.matches(Regex(regex))
    }

    /**
     * Closes the AsyncModelScanner and shuts down the internal thread pool.
     *
     * This method implements AutoCloseable.close() and ensures that all threads in the internal
     * executor are properly shut down. After calling this method, the scanner instance should not
     * be used for further operations.
     *
     * This method is idempotent - calling it multiple times has no additional effect.
     */
    override fun close() {
        executor.shutdown()
    }
}
