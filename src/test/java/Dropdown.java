import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown extends BrowserLaunch{

    @Test
    public void validate(){

        driver.get("https://blazedemo.com/reserve.php");

       Select s= new Select(driver.findElement(By.xpath("//select[@name=\"fromPort\"]")));
       s.selectByIndex(0);
       Select s1= new Select(driver.findElement(By.xpath("//select[@name=\"toPort\"]")));
       s1.selectByIndex(4);
       driver.findElement(By.xpath("//input[@type=\"submit\"]"));

       String string=driver.findElement(By.xpath("//input[@type=\"submit\"]")).getText();
       System.out.println(string);

    }
}
