package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebOrder_loginPage {
    public WebOrder_loginPage(){
        PageFactory.initElements(Driver.getWebDriver("Chrome"), this);
           }

           @FindBy(id="ctl00_MainContent_username")
    public WebElement username;

    @FindBy(id="ctl00_MainContent_password")
    public WebElement password;
    @FindBy(id="ctl00_MainContent_login_button")
    public WebElement loginButton;



}
