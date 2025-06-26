package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class DropDown extends BrowserLaunch {

    @Test
    public void testAmazon() throws InterruptedException, IOException {

        driver.get("https://dev.mysql.com/");
        WebElement webElement=driver.findElement(By.xpath("//div[@class='pad-tb-slight']"));
        JavascriptExecutor jse =(JavascriptExecutor) driver;
        Thread.sleep(5000);
        jse.executeScript("arguments[0].scrollIntoView(true)",webElement);

        File file=webElement.getScreenshotAs(OutputType.FILE);
        File file1=new File("C:\\Users\\HP\\Documents\\Software Testing\\Screen Shot\\Page\\mirror.png");
        FileHandler.copy(file,file1);

    }

    @Test
    public void ss() throws IOException {

        WebElement webElement=driver.findElement(By.xpath("//li[@id='sobe_d_b_ms_18_3']//img[@class='a-dynamic-image sl-sobe-carousel-sub-card-img']"));

    }
}