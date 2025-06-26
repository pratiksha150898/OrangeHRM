package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryPom {

    WebDriver driver;

    PageFactoryPom(WebDriver driver1)
    {
       driver=driver1;
       //This method will create web element
        PageFactory.initElements(driver,this);
    }

    //identify the web element
    //identify username password

    @FindBy(id = "user-name") WebElement username;
    @FindBy(id = "password") WebElement password;
    @FindBy(id = "login-button") WebElement btn;

    //create a repository for all web elements
    public void setUsername(String uname){

        username.sendKeys(uname);
    }

    public void setPassword(String pass){

        password.sendKeys(pass);
    }

    public void loginbtn(){

        btn.click();
    }

}
