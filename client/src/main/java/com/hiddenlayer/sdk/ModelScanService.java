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
import com.hiddenlayer.sdk.rest.api.ModelScanApi;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;
import com.hiddenlayer.sdk.rest.api.SensorApi;

public class ModelScanService extends HiddenlayerService {
  final private ModelSupplyChainApi modelSupplyChainApi;
  final private SensorApi sensorApi;
  final private ModelScanApi modelScanApi;

  public ModelScanService() throws Exception {
    this(Configuration.defaultFromEnvironment());
  }

  public ModelScanService(Configuration config) throws Exception {
    super(config);
    String jwt = getJWT();
    ApiClient apiClient = new ApiClient();
    apiClient.setRequestInterceptor((request) -> {
      request.header("Authorization", "Bearer " + jwt);
    });
    apiClient.updateBaseUri(config.getHlApiUrl());
    this.modelSupplyChainApi = new ModelSupplyChainApi(apiClient);
    this.sensorApi = new SensorApi(apiClient);
    this.modelScanApi = new ModelScanApi(apiClient);
  }

  public ScanReportV3 scanFile(String modelPath, String modelName, boolean waitForDone) 
    throws Exception, FileNotFoundException, RuntimeException, IOException, ApiException {
    return scanFile(modelPath, modelName, OptionalInt.empty(), waitForDone);
  }

  public ScanReportV3 scanFile(String modelPath, String modelName, OptionalInt modelVersion, boolean waitForDone) 
    throws Exception, FileNotFoundException, RuntimeException, IOException, ApiException {
    File fileToScan = new File(modelPath);
    if (!fileToScan.exists()) {
        throw new FileNotFoundException("File not found: " + modelPath);
    } else if (!fileToScan.isFile()) {
        throw new FileNotFoundException("Path is not a file: " + modelPath);
    }
    InputStream modelStream = new FileInputStream(fileToScan);
    try{
      return scanStream(modelStream, fileToScan.length(), modelName, modelVersion, waitForDone);
    } finally {
      modelStream.close();
    }
  }

  public ScanReportV3 scanStream(InputStream modelStream, long streamLength, String modelName, boolean waitForDone) 
    throws Exception, RuntimeException, IOException, ApiException {
    return this.scanStream(modelStream, streamLength, modelName, OptionalInt.empty(), waitForDone);
  }

  public ScanReportV3 scanStream(InputStream modelStream, long streamLength, String modelName, OptionalInt modelVersion, boolean waitForDone) 
    throws Exception, RuntimeException, IOException, ApiException {
    Model sensor = this.submitStream(modelStream, streamLength, modelName, modelVersion);
    if (waitForDone) {
      return this.getDoneScanResults(sensor.getSensorId());
    } else {
      return this.getScanResults(sensor.getSensorId());
    }
  }

  public ScanReportV3 scanFolder(String folderPath, String modelName, boolean waitForDone) 
    throws Exception, ApiException, IOException, URISyntaxException, InterruptedException, Exception {
    return this.scanFolder(folderPath, modelName, OptionalInt.empty(), waitForDone);
  }

  public ScanReportV3 scanFolder(String folderPath, String modelName, OptionalInt modelVersion, boolean waitForDone) 
        throws Exception, ApiException, IOException, URISyntaxException, InterruptedException, Exception {
        if (modelName == null || modelName.isEmpty()) {
            throw new Exception("Model name is required");
        } 
        File folder = new File(folderPath);
        if (!folder.isDirectory()) {
            throw new Exception("Folder path is not a directory");
        }
        File tempFile = File.createTempFile("temp", ".zip");
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(tempFile));
        File[] files = folder.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                FileInputStream in = new FileInputStream(file);
                ZipEntry entry = new ZipEntry(file.getName());
                out.putNextEntry(entry);
                byte[] buffer = new byte[1024];
                int len;
                while ((len = in.read(buffer)) > 0) {
                    out.write(buffer, 0, len);
                }
                out.closeEntry();
                in.close();
            }
        }
        out.finish();
        out.flush();
        out.close();
        
        return this.scanFile(tempFile.getAbsolutePath(), modelName, modelVersion, waitForDone);
    }

    public ScanReportV3 getDoneScanResults(UUID modelVersion) 
        throws ApiException {
          Double baseDelay = 100.0; // milliseconds
          Integer retries = 0;

          ScanReportV3 scanReport = this.getScanResults(modelVersion);
  
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
  
              scanReport = this.getScanResults(modelVersion);
          }
          return scanReport;
    }

    private ScanReportV3 getScanResults(UUID modelVersion)
        throws ApiException {
        // model version and sensor ids are one to one currently
        ArrayList<String> modelVersionList = new ArrayList<String>();
        modelVersionList.add(modelVersion.toString());
        ModelScanApiV3ScanQuery200Response scans = this.modelSupplyChainApi.modelScanApiV3ScanQuery(modelVersionList, null, null, null, null, null, null, null, null, true);
        if (scans.getTotal().intValue() == 0 || scans.getItems() == null) {
          return null;
        }

        ScanReportV3 scan = scans.getItems().get(0);
        UUID scanUuid = UUID.fromString(scan.getScanId());
        ScanReportV3 scanReport = this.modelSupplyChainApi.modelScanApiV3ScanModelVersionIdGet(scanUuid, null);
        return scanReport;
    }

    private Model submitStream(InputStream stream, long streamLength, String modelName, OptionalInt modelVersion) 
      throws Exception, ApiException, InterruptedException, IOException, URISyntaxException {
      CreateSensorRequest createSensorRequest = new CreateSensorRequest();
      createSensorRequest.setAdhoc(true);
      createSensorRequest.setActive(true);
      createSensorRequest.setPlaintextName(modelName);
      if (modelVersion.isPresent()) {
        createSensorRequest.setVersion(modelVersion.getAsInt());
      }
      // actually a sensor, not a Model
      Model model = null;
      try{
        model = this.sensorApi.createSensor(createSensorRequest);
      } catch(ApiException e) {
        if (e.getCode() == 409) {
          // sensor already exists, get the existing sensor. Version must have been specified to trigger collision
          ModelQueryResponse models = this.sensorApi.querySensor(new SensorSORQueryRequest().filter(new SensorSORQueryFilter().plaintextName(modelName).active(true).version(modelVersion.getAsInt())));
          if (models.getTotalCount() > 0) {
            model = models.getResults().get(0);
          } else {
            throw e;
          }
        } else {
          throw e;
        }
      }
      UUID sensorId = model.getSensorId();

      GetMultipartUploadResponse uploadStartResponse = this.sensorApi.beginMultipartUpload(sensorId, streamLength);
      for (int i = 0; i < uploadStartResponse.getParts().size(); i++) {
          MultipartUploadPart uploadPart = uploadStartResponse.getParts().get(i);
          long bytesToRead = uploadPart.getEndOffset() - uploadPart.getStartOffset();
          // TODO: appropriately handle large part sizes (this works for under 2GB parts)
          byte[] buffer = stream.readNBytes((int)bytesToRead);
          if (uploadPart.getUploadUrl() != null) {
            HttpRequest.Builder requestBuilder = HttpRequest.newBuilder()
                .uri(new URI(uploadPart.getUploadUrl()))
                .header("Content-Type", "application/octet-stream")
                .PUT(HttpRequest.BodyPublishers.ofByteArray(buffer));
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = requestBuilder.build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() != 200) {
                throw new Exception("Failed to upload part " + uploadPart.getPartNumber() + ": " + response.statusCode() + ": " + response.body());
            }
          } else {
            this.sensorApi.uploadModelPart(sensorId, uploadStartResponse.getUploadId(), uploadPart.getPartNumber(), buffer);
          }
      }
      this.sensorApi.completeMultipartUpload(sensorId, uploadStartResponse.getUploadId());
      this.modelScanApi.scanModel(sensorId, null);
      return model;
    }
}
