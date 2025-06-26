package pom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExecutePOM {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        WebDriverManager.chromedriver().setup();//declaring webdrivermanager
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
    }

    @Test
    public void executeclass(){

        //create obj of demo pom class
        DemoPOM dp=new DemoPOM(driver);
        dp.enterUserName("standard_user");
        dp.enterPass("secret_sauce");
        dp.login();
    }

    @AfterMethod
    public void close(){


    }
}
