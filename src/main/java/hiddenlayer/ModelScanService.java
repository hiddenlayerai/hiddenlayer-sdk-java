package hiddenlayer;

import hiddenlayer.sdk.rest.ModelSupplyChainApi;

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
