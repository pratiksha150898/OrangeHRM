import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DemoMouseEvents extends BrowserLaunch {

    @Test
    public void mousehover() throws InterruptedException {
       /* driver.get("https://vinothqaacademy.com/mouse-event/");
        Actions actions=new Actions(driver);
        WebElement element=driver.findElement(By.xpath("(//a[normalize-space()=\"Self Paced Video Course\"])[2]"));
        WebElement element1=driver.findElement(By.xpath("(//a[normalize-space()=\"Free YouTube Courses\"])[2]"));

        actions.moveToElement(element).build().perform();
        Thread.sleep(1000);
        actions.moveToElement(element1).build().perform();*/
    }

    @Test
    public void rightClick() {

       driver.get("https://vinothqaacademy.com/mouse-event/");
        Actions actions=new Actions(driver);
        WebElement element=driver.findElement(By.xpath("//button[@id=\"rightclick\"]"));
        actions.contextClick().perform();
    }

    @Test
    public void doubleClick() throws InterruptedException {

       /* driver.get("https://vinothqaacademy.com/mouse-event/");
        Actions actions=new Actions(driver);
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        WebElement element=driver.findElement(By.xpath("//button[@id=\"dblclick\"]"));
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight);",element);
        Thread.sleep(2000);
        actions.doubleClick(element).perform();*/
    }

    @Test
    public void dragdrop() throws InterruptedException {

       /* driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        Thread.sleep(2000);

        Actions ac = new Actions(driver);
        WebElement s = driver.findElement(By.xpath("//div[@id='box5']"));
        WebElement sk = driver.findElement(By.xpath("//div[@id='box105']"));
        ac.dragAndDrop(s,sk).perform();*/

    }

    @Test
    public void demoActions() {

      /* driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        WebElement w=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions actions=new Actions(driver);
        Action act=actions.contextClick(w).build();
        act.perform();

        driver.findElement(By.xpath("//li[@class=\"context-menu-item context-menu-icon context-menu-icon-cut\"]")).click();*/

    }

    @Test
    public void dragndrop() {

        driver.get("https://vinothqaacademy.com/mouse-event/");

        Actions ac = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//div[@id='draggableElement']"));
        WebElement element1 = driver.findElement(By.xpath("//div[@id='droppableElement']"));
        ac.dragAndDrop(element, element1).perform();
    }
}
