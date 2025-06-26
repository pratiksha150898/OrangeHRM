package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Checkbox extends BrowserLaunch{

    @Test
    public void selectCheckbox(){

        driver.get("https://total-qa.com/checkbox-example/");
        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));

        for(int i=0;i<checkboxes.size();i++){

            checkboxes.get(i).click();
        }
    }
}
