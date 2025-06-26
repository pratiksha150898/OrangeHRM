package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActions extends BrowserLaunch{

    @Test
    public void hover(){

        driver.get("https://webflow.com/made-in-webflow/mouse-hover");
        Actions actions= new Actions(driver);
        WebElement element=driver.findElement(By.xpath("//div[@aria-label='Text Grid with Magnetic Images on Hover-thumbnail']"));

        actions.moveToElement(element).build().perform();
    }

    @Test
    public void rightClick(){

        driver.get("https://demoqa.com/buttons");
        Actions actions=new Actions(driver);
        WebElement e=driver.findElement(By.xpath("//button[text()=\"Right Click Me\"]"));
        actions.contextClick(e).perform();
    }

    @Test
    public void doubleclick(){

        driver.get("https://demoqa.com/buttons");
        Actions actions=new Actions(driver);
        WebElement element=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        actions.doubleClick(element).perform();
    }
    @Test
    public void dragdrop(){

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions actions=new Actions(driver);

        WebElement webElement1=driver.findElement(By.xpath("//div[@id='box5']"));
        WebElement webElement2=driver.findElement(By.xpath("//div[@id='box105']"));
        actions.dragAndDrop(webElement1,webElement2).perform();

    }

}
