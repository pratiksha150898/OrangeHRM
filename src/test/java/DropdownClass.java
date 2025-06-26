import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownClass {

    WebDriver driver;

    @BeforeMethod
    public void Dropdown(){

        driver = new ChromeDriver();
        driver.get("https://blazedemo.com/");
    }

    @Test
    public void methodDro(){

        Select s= new Select(driver.findElement(By.xpath("//select[@name=\"fromport\"]")));
        s.selectByIndex(5);
    }

    @AfterMethod
    public void closeDemo(){
        driver.close();

    }
}
