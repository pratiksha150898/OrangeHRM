import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Alerts extends BrowserLaunch{

    @Test(priority = 1)
    public void simple(){

       driver.get("https://vinothqaacademy.com/alert-and-popup/");
        driver.findElement(By.xpath("//button[text()=\"Alert Box\"]")).click();

        Alert alert=driver.switchTo().alert();
        alert.accept();
    }

    @Test(priority = 2)
    public void confirm(){

       driver.get("https://vinothqaacademy.com/alert-and-popup/");
        driver.findElement(By.xpath("//button[text()=\"Confirm Alert Box\"]")).click();

        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
    }

    @Test(priority = 3)
    public void prompt(){
        driver.get("https://vinothqaacademy.com/alert-and-popup/");
        driver.findElement(By.xpath("//button[text()=\"Prompt Alert Box\"]")).click();

        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("yes");
        alert.accept();
    }
}
