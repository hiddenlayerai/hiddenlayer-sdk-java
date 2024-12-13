

# ScanJobInventory

## oneOf schemas
* [ScanModelDetailsV3](ScanModelDetailsV3.md)
* [ScanModelIdsV3](ScanModelIdsV3.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.ScanJobInventory;
import org.openapitools.client.model.ScanModelDetailsV3;
import org.openapitools.client.model.ScanModelIdsV3;

public class Example {
    public static void main(String[] args) {
        ScanJobInventory exampleScanJobInventory = new ScanJobInventory();

        // create a new ScanModelDetailsV3
        ScanModelDetailsV3 exampleScanModelDetailsV3 = new ScanModelDetailsV3();
        // set ScanJobInventory to ScanModelDetailsV3
        exampleScanJobInventory.setActualInstance(exampleScanModelDetailsV3);
        // to get back the ScanModelDetailsV3 set earlier
        ScanModelDetailsV3 testScanModelDetailsV3 = (ScanModelDetailsV3) exampleScanJobInventory.getActualInstance();

        // create a new ScanModelIdsV3
        ScanModelIdsV3 exampleScanModelIdsV3 = new ScanModelIdsV3();
        // set ScanJobInventory to ScanModelIdsV3
        exampleScanJobInventory.setActualInstance(exampleScanModelIdsV3);
        // to get back the ScanModelIdsV3 set earlier
        ScanModelIdsV3 testScanModelIdsV3 = (ScanModelIdsV3) exampleScanJobInventory.getActualInstance();
    }
}
```


