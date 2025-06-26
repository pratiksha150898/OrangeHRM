package DDF;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FetchDataCheck {

    WebDriver driver;

    @BeforeMethod
    public void browserLaunch(){

        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
    }

    @Test
    public void demoCheck() throws IOException {
        //create an object of file class to open file
        File excel=new File("C:\\New folder\\readfile.xslx");

        //Create an obj of FileInputStream
        FileInputStream fileInputStream=new FileInputStream(excel);

        //Create an obj of XSSFWorkbook
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet=workbook.getSheetAt(0);
        //XSSFSheet sheet=workbook.getSheet("readfile");

        //get row count
        int rowCount=sheet.getLastRowNum()+1;

        //for cell
        //get total cell
        int total_cell=sheet.getRow(0).getLastCellNum();

        //create for loop for rows and inner for loop for cells
        for (int currentRow=0;currentRow<rowCount;currentRow++){

            for (int currentCell=0;currentCell<total_cell;currentCell++){

                //print the username and password
                //sheet.getRow(currentRow).getCell(currentCell).toString();
                System.out.print(sheet.getRow(currentRow).getCell(currentCell).toString());

                System.out.print("\t");

                //for numeric cell->getnumericcellvalue

            }
            System.out.println();
        }
        workbook.close();
    }

    @AfterMethod
    public void close(){


    }
}
