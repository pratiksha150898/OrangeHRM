import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DemoAlert extends BrowserLaunch{

    @Test
    public void simpleAlert(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();



        //accept method=close alert with ok button

        //driver.switchTo().alert().accept();
       /* Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();*/
    }

    @Test
    public void confirmationAlert(){
        /*driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
       // driver.switchTo().alert().accept();//close alert with ok button
        //driver.switchTo().alert().dismiss();//close alert with cancel button
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();*/
    }
    @Test
    public void promptalert(){

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();

        Alert alert=driver.switchTo().alert();
        alert.sendKeys("hello");
        //alert.accept();
        alert.dismiss();
    }
}
