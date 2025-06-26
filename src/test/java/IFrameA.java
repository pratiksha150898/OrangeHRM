import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IFrameA extends BrowserLaunch{

    @Test(priority = 0)
    public void testIframe(){

        driver.get("https://demo.automationtesting.in/Frames.html");
        WebElement webElement=driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
        driver.switchTo().frame(webElement);
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("hello");
    }

    @Test (priority = 1)
    public void nestedFrame(){

        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.findElement(By.xpath("//a[text()=\"Iframe with in an Iframe\"]")).click();
        WebElement webElement1=driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
        driver.switchTo().frame(0);
        WebElement webElement2= driver.findElement(By.xpath("//input[@type=\"text\"]"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].value=arguments[1];",webElement2);
    }
}
