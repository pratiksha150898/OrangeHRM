package practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Screenshot1 {

    WebDriver driver;

    @BeforeMethod
    public void Launch(){

        driver=new ChromeDriver();

    }

    @Test (priority = 0)
    public void takeSS() throws IOException {
        driver.navigate().to("https://www.wikipedia.org/");
        TakesScreenshot screenshot=(TakesScreenshot) driver;
        File file=screenshot.getScreenshotAs(OutputType.FILE);
        File file1=new File("C:\\Users\\HP\\Documents\\Software Testing\\Screen Shot\\Page\\homepage.png");
        FileHandler.copy(file,file1);
        System.out.println("Took ScreenShot");
    }

    @Test(priority = 1)
    public void logoSS() throws IOException {

        driver.get("https://www.wikipedia.org/");
        WebElement webElement=driver.findElement(By.xpath("//span[@class='central-textlogo__image sprite svg-Wikipedia_wordmark']"));

        TakesScreenshot ts=(TakesScreenshot) driver;
        File f= webElement.getScreenshotAs(OutputType.FILE);
        File f1=new File("C:\\Users\\HP\\Documents\\Software Testing\\Screen Shot\\Page\\wikilogo.png");
        FileHandler.copy(f,f1);

    }

    @Test
    public void boxSS() throws IOException {

        driver.get("https://en.wikipedia.org/wiki/BTS");
        WebElement ele= driver.findElement(By.xpath("//table[@class='infobox vcard plainlist']"));

        File file=ele.getScreenshotAs(OutputType.FILE);
        File file1=new File("C:\\Users\\HP\\Documents\\Software Testing\\Screen Shot\\Page\\blockSS.png");
        FileHandler.copy(file,file1);
        System.out.println("Took Block ss");
    }

    @AfterMethod
    public void close(){

        driver.close();
    }
}
