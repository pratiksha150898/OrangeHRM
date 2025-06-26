package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoPOM {

    WebDriver driver;

    DemoPOM(WebDriver webDriver){

        driver=webDriver;
    }

    //identify the web element
    //Create a method of operation to be performed
    //locate the element

    By userName=By.id("user-name");
    By passWord=By.id("password");
    By loginBtn=By.id("login-button");

    //repository by creating methods
    public void enterUserName(String uName){

        driver.findElement(userName).sendKeys(uName);
    }

    public void enterPass(String pass){

        driver.findElement(passWord).sendKeys(pass);
    }

    public void login(){

        driver.findElement(loginBtn).click();
    }

}
