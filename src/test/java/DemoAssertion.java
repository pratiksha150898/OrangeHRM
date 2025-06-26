import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertion{

    @Test(priority = 1)
    public void testTitle(){

        String exp_title="openCart";
        String actual_title="opencart";

       /* if(exp_title.equals(actual_title)){

            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }*/
        //use method instead

        //Assert.assertEquals(actual_title,exp_title);

        if(exp_title.equals(actual_title)){
            System.out.println("Test Passed");
            Assert.assertTrue(true);
        }else{
            System.out.println("Test failed");
            Assert.assertTrue(false);
        }
    }
}
