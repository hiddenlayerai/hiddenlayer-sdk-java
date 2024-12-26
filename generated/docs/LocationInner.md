

# LocationInner

## anyOf schemas
* [Integer](Integer.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.hiddenlayer.sdk.rest.models.LocationInner;
import com.hiddenlayer.sdk.rest.models.Integer;
import com.hiddenlayer.sdk.rest.models.String;

public class Example {
    public static void main(String[] args) {
        LocationInner exampleLocationInner = new LocationInner();

        // create a new Integer
        Integer exampleInteger = new Integer();
        // set LocationInner to Integer
        exampleLocationInner.setActualInstance(exampleInteger);
        // to get back the Integer set earlier
        Integer testInteger = (Integer) exampleLocationInner.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set LocationInner to String
        exampleLocationInner.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleLocationInner.getActualInstance();
    }
}
```


