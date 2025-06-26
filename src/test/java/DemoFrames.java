import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DemoFrames extends BrowserLaunch{

    @Test
    public void firstIFrame(){//this is for 1st iframe

        driver.get("https://ui.vision/demo/webtest/frames/");
        WebElement frame1=driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
        driver.switchTo().frame(frame1);

        driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("Hello");

        driver.switchTo().defaultContent();//switch to main frame

        WebElement frame2=driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));//2nd frame
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("Selenium");

        driver.switchTo().defaultContent();//switch to main frame

        WebElement frame3=driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));//2nd frame
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("Automation");


        //inner iframe
        driver.switchTo().frame(0);//switch to frame using index
        WebElement frame5=driver.findElement(By.xpath("//span[text()=\"I am a human\"]"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",frame5);
    }

}
