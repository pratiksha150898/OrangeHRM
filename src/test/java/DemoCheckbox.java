import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class DemoCheckbox extends BrowserLaunch{

    @Test
    public void checkbox(){

        driver.get("https://testautomationpractice.blogspot.com/");

        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement w=driver.findElement(By.xpath("//label[normalize-space()='Colors:']"));
        js.executeScript("arguments[0].scrollIntoView(true);",w);

        //driver.findElement(By.xpath("//input[@id='monday']")).click();

        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
        /*for (int i=0;i<=checkboxes.size();i++){
            if (!checkboxes.get(i).isSelected()){
                checkboxes.get(i).click();

            }
            //checkboxes.get(i).click();

        }*/

       /* for (WebElement options:checkboxes){

            options.click();
        }*/
        //last 3
       /* for (int i=4;i<checkboxes.size();i++){

            checkboxes.get(i).click();
        }*/


   for (int i=0;i<checkboxes.size()-4;i++){
            checkboxes.get(i).click();
        }
    }
}
