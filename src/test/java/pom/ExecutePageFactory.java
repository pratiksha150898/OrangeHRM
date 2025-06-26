package pom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExecutePageFactory {

    WebDriver driver;

    @BeforeMethod
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");
    }

    @Test
    public void executeFactory(){
      PageFactoryPom pom=new PageFactoryPom(driver);
      pom.setUsername("standard_user");
      pom.setPassword("secret_sauce");
      pom.loginbtn();
    }

    @AfterMethod
    public void close(){

    }
}
