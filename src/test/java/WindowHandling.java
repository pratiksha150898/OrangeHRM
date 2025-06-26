import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.*;

public class WindowHandling extends BrowserLaunch{

    @Test
    public void multipleWindow(){

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> str=driver.getWindowHandles();
        List<String> list=new ArrayList(str);

        String parentId=list.get(0);
        String childId=list.get(1);

        driver.switchTo().window(childId);

        driver.switchTo().window(parentId);
    }
}
