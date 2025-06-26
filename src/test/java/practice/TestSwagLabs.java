package practice;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TestSwagLabs extends BrowserLaunch{

    @Test
    public void login() throws InterruptedException, IOException {

        driver.get("https://www.saucedemo.com/v1/");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='product_sort_container']")));
        Select s=new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
        s.selectByIndex(2);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement element=driver.findElement(By.xpath("//footer[@class='footer']"));
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        Thread.sleep(5000);
        jse.executeScript("window.scrollTo(0,0);");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        File file=element.getScreenshotAs(OutputType.FILE);
        File file1=new File("C:\\Users\\HP\\Documents\\Software Testing\\Screen Shot\\Page\\footer.jpg");
        FileHandler.copy(file,file1);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement element1=driver.findElement(By.xpath("//button[normalize-space()='Open Menu']"));
        jse.executeScript("arguments[0].scrollIntoView(true);",element1);
        Thread.sleep(5000);
        element1.click();
        driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();

        System.out.println("Tested everything");
    }

}
