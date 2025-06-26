import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertion {

    @Test
    void testHardAssertion(){

        System.out.println("Testing....");

        System.out.println("Testing....");

        Assert.assertEquals(123,12);

        System.out.println("Testing....");

        System.out.println("Testing....");
    }

    @Test
    void testSoftAssertion(){
        System.out.println("Testing....");

        System.out.println("Testing....");

        SoftAssert soft=new SoftAssert();
        soft.assertEquals(123,6);

        System.out.println("Testing....");

        System.out.println("Testing....");

        soft.assertAll();//mandatory for soft assertion

    }
}
