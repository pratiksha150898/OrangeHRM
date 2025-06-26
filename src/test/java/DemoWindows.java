import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DemoWindows extends BrowserLaunch{

    @Test(priority = 0)
    public void multipleWindow(){

        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.findElement(By.xpath("//button[@class='btn btn-info'][normalize-space()='click']")).click();

        Set<String> str=driver.getWindowHandles();
        List<String> list=new ArrayList(str);

        String parentId=list.get(0);
        String childId=list.get(1);

        driver.switchTo().window(childId);

        driver.switchTo().window(parentId);
    }

    @Test(priority = 1)
    public void windowSeperate(){


        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

        Set<String> str=driver.getWindowHandles();
        List<String> list=new ArrayList(str);

        String parentId=list.get(0);
        String childId=list.get(1);

        driver.switchTo().window(childId);

        driver.switchTo().window(parentId);
    }

    @Test(priority = 2)
    public void windows(){

        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(By.xpath("//a[normalize-space()='Open Seperate Multiple Windows']")).click();
        driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();

        Set<String> str=driver.getWindowHandles();
        List<String> list=new ArrayList(str);

        String parentId=list.get(0);
        String childId=list.get(1);

        driver.switchTo().window(childId);

        driver.switchTo().window(parentId);
    }
}

