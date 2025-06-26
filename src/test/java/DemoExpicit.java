import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoExpicit extends BrowserLaunch{

    @Test
    public void orangeHRMLogin(){

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Username\"]")));

        driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")));

        driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"Logout\"]")).click();

    }

}
