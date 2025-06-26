import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class DemoScreenShot extends BrowserLaunch{

    @Test
    public void demoScreen() throws IOException {
       // driver.get("https://www.amazon.in/");

        //use interface
        //TakesScreenshot ts=(TakesScreenshot) driver;

        //use method with TakesScreenshot object
        //File f=ts.getScreenshotAs(OutputType.FILE);

        //file path
        //File fl=new File("C:\\Users\\HP\\Documents\\Software Testing\\Screen Shot\\Page\\page.png");
        //FileHandler.copy(f,fl);
    }

    @Test
    public void section() throws IOException {
      /*  driver.get("https://www.amazon.in/");
        WebElement element=driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
        element.isDisplayed();
        TakesScreenshot t=(TakesScreenshot) driver;
        File f1=element.getScreenshotAs(OutputType.FILE);
        File f2= new File("C:\\Users\\HP\\Documents\\Software Testing\\Screen Shot\\Page\\logo.png");
        FileHandler.copy(f1,f2);*/
    }

    @Test
    public void section1() throws IOException{
        driver.get("https://www.amazon.in/");
        WebElement ele=driver.findElement(By.xpath("//div[@class=\"a-box-inner a-padding-extra-large\"]"));
        TakesScreenshot t=(TakesScreenshot) driver;
        File f=ele.getScreenshotAs(OutputType.FILE);
        File f1=new File("C:\\Users\\HP\\Documents\\Software Testing\\Screen Shot\\Page\\block.jpg");
        FileHandler.copy(f,f1);
    }
}
