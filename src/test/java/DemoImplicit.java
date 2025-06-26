import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoImplicit extends BrowserLaunch{

    @Test
    public void orangeHRMLogin(){

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();


    }

}
