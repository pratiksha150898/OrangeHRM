import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestValidation extends BrowserLaunch{

    @Test
    public void loginValidation(){

        driver.get("https://www.saucedemo.com/v1/");

        driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();

        String logo=driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
        System.out.println(logo);

        Assert.assertEquals(logo,"products");
      //  System.out.println("Login Successfully!");
    }
}
