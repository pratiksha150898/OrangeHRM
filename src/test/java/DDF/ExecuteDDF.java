package DDF;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class ExecuteDDF extends BasicLaunch{

    @BeforeMethod
    public void loginPage(){

        ChromeOptions options = new ChromeOptions();

        // Preferences map
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false); // Disables password save popup
        prefs.put("profile.password_manager_enabled", false); // Disables password manager

        options.setExperimentalOption("prefs", prefs);

        // Optional: run in incognito mode to prevent stored password prompts
        options.addArguments("--incognito");

        // Optional: start maximized
        options.addArguments("start-maximized");

        // Launch browser
        driver = new ChromeDriver(options);


    }

    @Test
    public void execute() throws IOException {

        driver.get("https://www.saucedemo.com/v1/");

        File file=new File("C:\\New folder\\readfile.xlsx");

        FileInputStream fs=new FileInputStream(file);

        XSSFWorkbook wb=new XSSFWorkbook(fs);

        XSSFSheet sheet=wb.getSheetAt(0);

        int rowCount=sheet.getLastRowNum();

        int totalCell=sheet.getRow(0).getLastCellNum();

        for (int currentRow=1;currentRow<rowCount;currentRow++){

            String username=sheet.getRow(currentRow).getCell(0).toString();
            String password=sheet.getRow(currentRow).getCell(1).toString();

            System.out.println(username);
            System.out.println(password);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
            driver.findElement(By.xpath("//input[@id='user-name']")).clear();
            driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
            driver.findElement(By.xpath("//input[@id='password']")).clear();
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
            driver.findElement(By.xpath("//input[@id='login-button']")).click();

            try {
                driver.findElement(By.xpath("//button[normalize-space()='Open Menu']")).click();
                driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
                System.out.println("Login passed with this "+username);
            }
            catch (Exception e){
                System.out.println("Login may failed with this "+username);
            }

        }
    }
}
