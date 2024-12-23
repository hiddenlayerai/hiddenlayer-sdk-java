package com.hiddenlayer.sdk;

import java.io.BufferedInputStream;
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
import com.hiddenlayer.sdk.rest.ApiResponse;
import com.hiddenlayer.sdk.rest.api.ModelScanApi;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;
import com.hiddenlayer.sdk.rest.api.SensorApi;

/**
 * Hiddenlayer SDK Service for scanning models
 */
public class ModelScanService extends HiddenlayerService {
  final private ModelSupplyChainApi modelSupplyChainApi;
  final private SensorApi sensorApi;
  final private ModelScanApi modelScanApi;

  /**
   * Constructor for ModelScanService
   * 
   * Credentials are read from the environment, HL_CLIENT_ID and HL_CLIENT_SECRET
   * @throws Exception
   */
  public ModelScanService() throws Exception {
    this(Configuration.defaultFromEnvironment());
  }

  /**
   * Constructor for ModelScanService
   * 
   * @param config Configuration object
   * @throws Exception
   */
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

  /**
   * Scan a file
   * 
   * Next version of the model will be created, starting at 1
   * 
   * @param modelPath Path to the model file
   * @param modelName Name of the model
   * @return ScanReportV3
   * @throws Exception
   * @throws FileNotFoundException
   * @throws RuntimeException
   * @throws IOException
   * @throws ApiException
   */
  public ScanReportV3 scanFile(String modelPath, String modelName) 
    throws Exception, FileNotFoundException, RuntimeException, IOException, ApiException {
    return scanFile(modelPath, modelName, OptionalInt.empty());
  }

  /**
   * Scan a file
   * 
   * Optionally specify a version for the model.  If no version is specified, the next version of the model will be created, starting at 1
   * 
   * @param modelPath Path to the model file
   * @param modelName Name of the model
   * @param modelVersion Version of the model
   * @return ScanReportV3
   * @throws Exception
   * @throws FileNotFoundException
   * @throws RuntimeException
   * @throws IOException
   * @throws ApiException
   */
  public ScanReportV3 scanFile(String modelPath, String modelName, OptionalInt modelVersion) 
    throws Exception, FileNotFoundException, RuntimeException, IOException, ApiException {
    File fileToScan = new File(modelPath);
    if (!fileToScan.exists()) {
        throw new FileNotFoundException("File not found: " + modelPath);
    } else if (!fileToScan.isFile()) {
        throw new FileNotFoundException("Path is not a file: " + modelPath);
    }
    InputStream modelStream = new FileInputStream(fileToScan);
    return scanStream(modelStream, fileToScan.length(), modelName, modelVersion);
  }

  /**
   * Scan a stream
   * 
   * Next version of the model will be created, starting at 1
   * 
   * @param modelStream InputStream of the model
   * @param streamLength Length of the stream
   * @param modelName Name of the model
   * @return ScanReportV3
   * @throws Exception
   * @throws RuntimeException
   * @throws IOException
   * @throws ApiException
   */
  public ScanReportV3 scanStream(InputStream modelStream, long streamLength, String modelName) 
    throws Exception, RuntimeException, IOException, ApiException {
    return this.scanStream(modelStream, streamLength, modelName, OptionalInt.empty());
  }

  /**
   * Scan a stream
   * 
   * Optionally specify a version for the model.  If no version is specified, the next version of the model will be created, starting at 1
   * 
   * @param modelStream InputStream of the model
   * @param streamLength Length of the stream
   * @param modelName Name of the model
   * @param modelVersion Version of the model
   * @return ScanReportV3
   * @throws Exception
   * @throws RuntimeException
   * @throws IOException
   * @throws ApiException
   */
  public ScanReportV3 scanStream(InputStream modelStream, long streamLength, String modelName, OptionalInt modelVersion) 
    throws Exception, RuntimeException, IOException, ApiException {
    Model sensor = this.submitStream(modelStream, streamLength, modelName, modelVersion);
    return this.getScanResults(sensor.getSensorId());
  }

  /**
   * Scan a folder
   * 
   * Folder is zipped at sent to Hiddenlayer Model Scanning service
   * 
   * Next version of the model will be created, starting at 1
   * 
   * @param folderPath Path to the folder
   * @param modelName Name of the model
   * @return ScanReportV3
   * @throws Exception
   * @throws ApiException
   * @throws IOException
   * @throws URISyntaxException
   * @throws InterruptedException
   * @throws Exception
   */
  public ScanReportV3 scanFolder(String folderPath, String modelName) 
    throws Exception, ApiException, IOException, URISyntaxException, InterruptedException, Exception {
    return this.scanFolder(folderPath, modelName, OptionalInt.empty());
  }

  /**
   * Scan a folder
   * 
   * Folder is zipped at sent to Hiddenlayer Model Scanning service
   * 
   * Optionally specify a version for the model.  If no version is specified, the next version of the model will be created, starting at 1
   * 
   * @param folderPath Path to the folder
   * @param modelName Name of the model
   * @param modelVersion Version of the model
   * @return ScanReportV3
   * @throws Exception
   * @throws ApiException
   * @throws IOException
   * @throws URISyntaxException
   * @throws InterruptedException
   * @throws Exception
   */
  public ScanReportV3 scanFolder(String folderPath, String modelName, OptionalInt modelVersion) 
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
        
        return this.scanFile(modelName, tempFile.getAbsolutePath(), modelVersion);
    }

    /**
     * Get the latest scan results for a model version
     * 
     * @param modelVersion UUID of the model version
     * @return ScanReportV3
     * @throws ApiException
     */
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

    /**
     * Submit a stream to the Hiddenlayer Model Scanning service
     * 
     * Optionally specify a version for the model.  If no version is specified, the next version of the model will be created, starting at 1
     * 
     * @param stream
     * @param streamLength
     * @param modelName
     * @param modelVersion
     * @return
     * @throws Exception
     * @throws ApiException
     * @throws InterruptedException
     * @throws IOException
     * @throws URISyntaxException
     */
    private Model submitStream(InputStream stream, long streamLength, String modelName, OptionalInt modelVersion) 
      throws Exception, ApiException, InterruptedException, IOException, URISyntaxException {
      CreateSensorRequest createSensorRequest = new CreateSensorRequest();
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

      BufferedInputStream bufferedReader = null;
      try{
          bufferedReader = new BufferedInputStream(stream);

          GetMultipartUploadResponse uploadStartResponse = this.sensorApi.beginMultipartUpload(sensorId, streamLength);
          for (int i = 0; i < uploadStartResponse.getParts().size(); i++) {
              MultipartUploadPart uploadPart = uploadStartResponse.getParts().get(i);
              long bytesToRead = uploadPart.getEndOffset() - uploadPart.getStartOffset();
              // TODO: appropriately handle large part sizes (this works for under 2GB parts)
              byte[] buffer = new byte[(int)bytesToRead];
              int read = bufferedReader.read(buffer, 0, (int)bytesToRead);
              // TODO: throw exception if read != bytesToRead
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
      } finally {
          if (bufferedReader != null) {
              bufferedReader.close();
          }
      }
      return model;
    }
}
