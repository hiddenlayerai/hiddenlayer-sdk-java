package hiddenlayer;

import hiddenlayer.sdk.rest.ModelScanApi;
import hiddenlayer.sdk.rest.ModelSupplyChainApi;
import hiddenlayer.sdk.rest.SensorApi;

public class ModelScanService {
  private ModelSupplyChainApi modelSupplyChainApi;
  private SensorApi sensorApi;
  private ModelScanApi modelScanApi;

  public ModelScanService() {
    this.modelSupplyChainApi = new ModelSupplyChainApi();
    this.sensorApi = new SensorApi();
    this.modelScanApi = new ModelScanApi();
  }
}
