import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DemoGetText extends BrowserLaunch{

    @Test
    public void getText(){

        driver.navigate().to("https://www.amazon.in/");

        //boolean displayStatus = driver.findElement(By.xpath(" //a[@data-csa-c-slot-id=\"nav_cs_5\"]")).isDisplayed();
//System.out.println(displayStatus);

        String value = driver.findElement(By.xpath("//a[@data-csa-c-slot-id=\"nav_cs_5\"]")).getText();
        System.out.println(value);
    }
}
