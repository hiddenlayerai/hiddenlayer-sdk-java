/*
 * HiddenLayer ModelScan V2
 * HiddenLayer ModelScan API for scanning of models
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.hiddenlayer.sdk.rest.api;

import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.models.CreateSensorRequest;
import com.hiddenlayer.sdk.rest.models.GetMultipartUploadResponse;
import com.hiddenlayer.sdk.rest.models.Model;
import com.hiddenlayer.sdk.rest.models.ModelQueryResponse;
import com.hiddenlayer.sdk.rest.models.SensorSORModelCardQueryResponse;
import com.hiddenlayer.sdk.rest.models.SensorSORQueryRequest;
import java.util.UUID;
import com.hiddenlayer.sdk.rest.models.ValidationErrorModel;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for SensorApi
 */
@Disabled
public class SensorApiTest {

    private final SensorApi api = new SensorApi();

    
    /**
     * Begin Multipart Upload
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void beginMultipartUploadTest() throws ApiException {
        UUID sensorId = null;
        Long xContentLength = null;
        GetMultipartUploadResponse response = 
        api.beginMultipartUpload(sensorId, xContentLength);
        
        // TODO: test validations
    }
    
    /**
     * Complete Multipart Upload
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void completeMultipartUploadTest() throws ApiException {
        UUID sensorId = null;
        String uploadId = null;
        
        api.completeMultipartUpload(sensorId, uploadId);
        
        // TODO: test validations
    }
    
    /**
     * Create a Sensor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSensorTest() throws ApiException {
        CreateSensorRequest createSensorRequest = null;
        Model response = 
        api.createSensor(createSensorRequest);
        
        // TODO: test validations
    }
    
    /**
     * Remove an Adhoc Sensor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteModelTest() throws ApiException {
        UUID sensorId = null;
        
        api.deleteModel(sensorId);
        
        // TODO: test validations
    }
    
    /**
     * Get Model
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelTest() throws ApiException {
        UUID sensorId = null;
        Model response = 
        api.getModel(sensorId);
        
        // TODO: test validations
    }
    
    /**
     * Query a Sensor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void querySensorTest() throws ApiException {
        SensorSORQueryRequest sensorSORQueryRequest = null;
        ModelQueryResponse response = 
        api.querySensor(sensorSORQueryRequest);
        
        // TODO: test validations
    }
    
    /**
     * List Model Cards
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sensorSorApiV3ModelCardsQueryGetTest() throws ApiException {
        String modelNameEq = null;
        String modelNameContains = null;
        Integer limit = null;
        Integer offset = null;
        String sort = null;
        SensorSORModelCardQueryResponse response = 
        api.sensorSorApiV3ModelCardsQueryGet(modelNameEq, modelNameContains, limit, offset, sort);
        
        // TODO: test validations
    }
    
    /**
     * Upload part
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadModelPartTest() throws ApiException {
        UUID sensorId = null;
        String uploadId = null;
        Integer part = null;
        Object body = null;
        
        api.uploadModelPart(sensorId, uploadId, part, body);
        
        // TODO: test validations
    }
    
}
