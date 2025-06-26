import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BrowserLaunch {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver=new ChromeDriver();
        //driver.get("https://www.saucedemo.com/v1/");//open url
        //driver.navigate().to("https://www.saucedemo.com/v1/");//open url
        //driver.manage().window().maximize();//full Screen
        //driver.manage().window().minimize();//minimize screen
       // driver.getTitle();

    }

    @BeforeClass
    public void demoClass(){

    }

    @Test
    public void loginPage(){

        /*driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();*/

       /* driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();*/

        //driver.findElement(By.cssSelector("input.form_input")).sendKeys("standard_user");
        //driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
        //driver.findElement(By.cssSelector("input              [type=\"submit\"]")).click();

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
