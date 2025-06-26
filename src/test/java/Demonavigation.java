import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Demonavigation extends BrowserLaunch{

    @Test
    public void navCommands() throws MalformedURLException {

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().to("https://www.nopcommerce.com/en");

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();
    }
}
