package DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BasicLaunch{

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver=new ChromeDriver();


    }

    @BeforeClass
    public void demoClass(){

    }

    @AfterClass
    public void demoClass1(){

    }

    @AfterMethod
    public void exitPage(){

        // driver.quit();//close the browser,all tabs
        // driver.close();// close current tab
    }
}

