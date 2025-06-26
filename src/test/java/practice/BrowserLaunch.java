package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class BrowserLaunch {

    WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver=new ChromeDriver();
    }

    @Test
    public void launch(){

        driver.get("https://www.wikipedia.org/");
        System.out.println("Title: "+driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterMethod
    public void close(){

        //driver.close();
    }

}
