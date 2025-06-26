import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoORM extends BrowserLaunch {

    @Test
    public void dropdown1(){

        driver.get("https://formstone.it/components/dropdown/demo/");
       Select st= new Select(driver.findElement(By.xpath("//*[@id=\"demo_basic\"]")));
        st.selectByVisibleText("Two");

        Select s1=new Select(driver.findElement(By.xpath("//*[@id=\"demo_groups\"]")));
        //s1.selectByVisibleText("Ten");
        s1.selectByIndex(4);
    }
}
