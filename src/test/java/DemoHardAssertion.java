import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoHardAssertion {

    @Test
    void hardAssertion(){

        Assert.assertEquals(123,123);
    }
}
