import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoScroll{

    WebDriver driver;

    @BeforeMethod
    public void launch(){

        driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/documentation/webdriver/");
    }

    @Test
    public void scrolling(){
    //scrolling to perticular element
       /* WebElement element=driver.findElement(By.xpath("//a[text()=\"Supported Browsers\"]"));
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",element);
        element.click();*/
    }

    @Test
    public void topTobottom(){

       /* WebElement element= driver.findElement(By.xpath("//nav[@class=\"js-navbar-scroll navbar navbar-expand-lg navbar-light bg-white flex-row td-navbar\"]"));
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight);",element);*/
    }

    @Test
    public void bottomToTop() throws InterruptedException {

        WebElement element= driver.findElement(By.xpath(("//nav[@class=\"js-navbar-scroll navbar navbar-expand-lg navbar-light bg-white flex-row td-navbar\"]")));
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight);",element);
        Thread.sleep(3000);
        jse.executeScript("window.scrollTo(0,0);");
        Thread.sleep(3000);

    }

    @AfterMethod
    public void close(){

    }
}
