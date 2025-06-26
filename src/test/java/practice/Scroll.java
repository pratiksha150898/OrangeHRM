package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

public class Scroll extends BrowserLaunch{

    @Test
    public void scrollTopToBottom()  {

        driver.get("https://en.wikipedia.org/wiki/BTS");
        WebElement element= driver.findElement(By.xpath("//div[@id='catlinks']"));
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight);",element);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void scrollToElement() throws InterruptedException {

        driver.get("https://en.wikipedia.org/wiki/BTS");
        WebElement element=driver.findElement(By.xpath("//h2[@id='Filmography']"));
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        Thread.sleep(4000);
        jse.executeScript("arguments[0].scrollIntoView(true)",element);
    }

    @Test
    public void bottomtotop() throws InterruptedException {

        driver.get("https://www.selenium.dev/documentation/webdriver/");
        WebElement webElement=driver.findElement(By.xpath("//footer[@class=\"bg-dark py-5 row d-print-none\"]"));

        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight);",webElement);
        Thread.sleep(4000);
        jse.executeScript("window.scrollTo(0,0);");
        Thread.sleep(4000);
    }
}
