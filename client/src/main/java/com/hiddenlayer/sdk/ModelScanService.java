package com.hiddenlayer.sdk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.InterruptedException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.OptionalInt;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import com.hiddenlayer.sdk.rest.models.*;

import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;

public class ModelScanService extends HiddenlayerService {
  final private ModelSupplyChainApi modelSupplyChainApi;

  public ModelScanService() throws Exception {
    this(Configuration.defaultFromEnvironment());
  }

  public ModelScanService(Configuration config) throws Exception {
    this(config, new ApiClient());
  }

  public ModelScanService(Configuration config, ApiClient apiClient) throws Exception {
    super(config, apiClient.getHttpClient());
    String jwt = getJWT();
    apiClient.setRequestInterceptor((request) -> {
      request.header("Authorization", "Bearer " + jwt);
    });
    apiClient.updateBaseUri(config.getHlApiUrl());
    this.modelSupplyChainApi = new ModelSupplyChainApi(apiClient);
  }

  public ScanReportV3 scanFile(String modelPath, String modelName) 
    throws Exception, FileNotFoundException, RuntimeException, IOException, ApiException {
    return scanFile(modelPath, modelName, null, true);
  }

  public ScanReportV3 scanFile(String modelPath, String modelName, boolean waitForDone) 
    throws Exception, FileNotFoundException, RuntimeException, IOException, ApiException {
    return scanFile(modelPath, modelName, null, waitForDone);
  }

  public ScanReportV3 scanFile(String modelPath, String modelName, String modelVersion, boolean waitForDone) 
    throws Exception, FileNotFoundException, RuntimeException, IOException, ApiException {
    File fileToScan = new File(modelPath);
    if (!fileToScan.exists()) {
        throw new FileNotFoundException("File not found: " + modelPath);
    } else if (!fileToScan.isFile()) {
        throw new FileNotFoundException("Path is not a file: " + modelPath);
    }
    InputStream modelStream = new FileInputStream(fileToScan);
    try{
      return scanStream(modelStream, fileToScan.getName(), fileToScan.length(), modelName, modelVersion, waitForDone);
    } finally {
      modelStream.close();
    }
  }

  public ScanReportV3 scanStream(InputStream modelStream, String filename, long streamLength, String modelName) 
    throws Exception, RuntimeException, IOException, ApiException {
    return this.scanStream(modelStream, filename, streamLength, modelName, null, true);
  }

  public ScanReportV3 scanStream(InputStream modelStream, String filename, long streamLength, String modelName, boolean waitForDone) 
    throws Exception, RuntimeException, IOException, ApiException {
    return this.scanStream(modelStream, filename, streamLength, modelName, null, waitForDone);
  }

  public ScanReportV3 scanStream(InputStream modelStream, String filename, long streamLength, String modelName, String modelVersion, boolean waitForDone) 
    throws Exception, RuntimeException, IOException, ApiException {
    MultiFileUploadRequestV3 multiFileUploadRequest = new MultiFileUploadRequestV3();
    multiFileUploadRequest.setModelName(modelName);
    if (modelVersion != null && !modelVersion.isEmpty()) {
        multiFileUploadRequest.setModelVersion(modelVersion);
    }
    multiFileUploadRequest.setRequestingEntity("hiddenlayer-sdk-java");
    BeginMultiFileUpload200Response multiFileUploadResponse = this.modelSupplyChainApi.beginMultiFileUpload(multiFileUploadRequest);
    
    this.submitStream(modelStream, filename, streamLength, multiFileUploadResponse.getScanId());
    this.modelSupplyChainApi.completeMultiFileUpload(multiFileUploadResponse.getScanId());
    if (waitForDone) {
      return this.getDoneScanResults(multiFileUploadResponse.getScanId());
    } else {
      return this.modelSupplyChainApi.getScanResults(multiFileUploadResponse.getScanId(), null);
    }
  }

  public ScanReportV3 scanFolder(String folderPath, String modelName) 
    throws Exception, ApiException, IOException, URISyntaxException, InterruptedException, Exception {
    return this.scanFolder(folderPath, modelName, null, true);
  }

  public ScanReportV3 scanFolder(String folderPath, String modelName, boolean waitForDone) 
    throws Exception, ApiException, IOException, URISyntaxException, InterruptedException, Exception {
    return this.scanFolder(folderPath, modelName, null, waitForDone);
  }

  public ScanReportV3 scanFolder(String folderPath, String modelName, String modelVersion, boolean waitForDone) 
        throws Exception, ApiException, IOException, URISyntaxException, InterruptedException, Exception {
        if (modelName == null || modelName.isEmpty()) {
            throw new Exception("Model name is required");
        } 
        File folder = new File(folderPath);
        if (!folder.isDirectory()) {
            throw new Exception("Folder path is not a directory");
        }

        MultiFileUploadRequestV3 multiFileUploadRequest = new MultiFileUploadRequestV3();
        multiFileUploadRequest.setModelName(modelName);
        if (modelVersion != null && !modelVersion.isEmpty()) {
            multiFileUploadRequest.setModelVersion(modelVersion);
        }
        multiFileUploadRequest.setRequestingEntity("hiddenlayer-sdk-java");
        BeginMultiFileUpload200Response multiFileUploadResponse = this.modelSupplyChainApi.beginMultiFileUpload(multiFileUploadRequest);

        File[] files = folder.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                FileInputStream in = new FileInputStream(file);
                this.submitStream(in, file.getName(), file.length(), multiFileUploadResponse.getScanId());
            }
        }
        if (waitForDone) {
            return this.getDoneScanResults(multiFileUploadResponse.getScanId());
        } else {
            return this.modelSupplyChainApi.getScanResults(multiFileUploadResponse.getScanId(), null);
        }
    }

    public ScanReportV3 getDoneScanResults(UUID scanId) 
        throws ApiException {
          Double baseDelay = 100.0; // milliseconds
          Integer retries = 0;

          ScanReportV3 scanReport = this.modelSupplyChainApi.getScanResults(scanId, null);
          while (scanReport == null 
                  || (scanReport.getStatus() != ScanReportV3.StatusEnum.DONE 
                        && scanReport.getStatus() != ScanReportV3.StatusEnum.FAILED
                        && scanReport.getStatus() != ScanReportV3.StatusEnum.CANCELED)) {
              retries += 1;
              Double delay = baseDelay * Math.pow(2, retries) + Math.random();
              delay = Math.min(delay, 10000.0); // max 10 seconds
              try {
                  Thread.sleep(delay.longValue());
              }
              catch (InterruptedException e) {
                  return null;
              }
  
              scanReport = this.modelSupplyChainApi.getScanResults(scanId, null);
          }
          return scanReport;
    }

    private void submitStream(InputStream stream, String filename, long streamLength, UUID scanId) 
      throws ApiException, Exception {

      BeginMultipartFileUpload200Response multipartResponse = 
        this.modelSupplyChainApi.beginMultipartFileUpload(Math.toIntExact(streamLength), filename, scanId);

      for (int i = 0; i < multipartResponse.getParts().size(); i++) {
          BeginMultipartFileUpload200ResponsePartsInner uploadPart = multipartResponse.getParts().get(i);
          long bytesToRead = uploadPart.getEndOffset() - uploadPart.getStartOffset();
          // TODO: appropriately handle large part sizes (this works for under 2GB parts)
          byte[] buffer = stream.readNBytes((int)bytesToRead);
          HttpRequest.Builder requestBuilder = HttpRequest.newBuilder()
              .uri(uploadPart.getUploadUrl())
              .header("Content-Type", "application/octet-stream")
              .PUT(HttpRequest.BodyPublishers.ofByteArray(buffer));
          HttpClient client = HttpClient.newHttpClient();
          HttpRequest request = requestBuilder.build();
          HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
          if (response.statusCode() != 200) {
              throw new Exception("Failed to upload part " + uploadPart.getPartNumber() + ": " + response.statusCode() + ": " + response.body());
          }
      }
      this.modelSupplyChainApi.completeMultipartFileUpload(scanId, multipartResponse.getUploadId());
    }
}
