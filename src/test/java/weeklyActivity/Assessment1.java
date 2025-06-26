package weeklyActivity;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Assessment1 {

    WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver=new ChromeDriver();
        driver.navigate().to("https://example.com");
    }

    @Test(priority = 0)
    public void execute(){

        System.out.println("Title:" +driver.getTitle());
    }

    @Test(priority = 1)
    public void login(){

        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student ");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123 ");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        System.out.println("login Successfully!");
    }

    @Test(priority = 2)
    public void explicitWait(){

        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student ");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123 ");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        System.out.println("login Successfully!");
        System.out.println("Waited for 5 mins!!");
    }
    @Test(priority = 3)
    public void dragdrop(){

        driver.get("https://jqueryui.com/droppable/");
        Actions actions=new Actions(driver);

        WebElement element1=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
        WebElement element2= driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        actions.dragAndDrop(element1,element2).perform();
        System.out.println("Element is dragged and dropped successfully!");
    }

    @Test(priority = 4)
    public void dropdown(){

        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[text()=\"Select Option\"]")).click();

        driver.findElement(By.xpath("//div[text()=\"Select Title\"]")).click();

        driver.findElement(By.xpath("//div[@class\"mt-2 row\"]")).click();

    }

    @Test(priority = 5)
    public void screenshot() throws IOException {

        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
        File file1=takesScreenshot.getScreenshotAs(OutputType.FILE);
        File file2=new File("C:\\Users\\HP\\Documents\\Software Testing\\Screen Shot\\Page\\page.jpg");
        FileHandler.copy(file1,file2);
        System.out.println("Took Screenshot successfully!");

    }
    @AfterMethod
    public void close(){

    }

}
/*1.//tagname[@id="value"]
  2.//tagmae[text()="value"]
  3.//tagname[@normalize-space="value"]
 */
