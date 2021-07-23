package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HW_Data_Proivder {

    public HW_Data_Proivder(){
        PageFactory.initElements(Driver.getWebDriver("Chrome"), this);

    }
    @FindBy(xpath="//input[@id='ctl00_MainContent_username']")
    public WebElement username;

    @FindBy(xpath="//input[@id='ctl00_MainContent_password']")
    public WebElement passsword;

    @FindBy(xpath="//input[@id='ctl00_MainContent_login_button']")
    public WebElement loginButton;

    @FindBy(xpath="//*[@id=\"ctl00_menu\"]/li[3]/a")
     public WebElement order;

    @FindBy(xpath="//input[@id='ctl00_MainContent_fmwOrder_txtName']")
    public WebElement customerName;

    @FindBy(xpath="//input[@id='ctl00_MainContent_fmwOrder_TextBox2']")
    public WebElement street;

    @FindBy(xpath="//input[@id='ctl00_MainContent_fmwOrder_TextBox3']")
    public WebElement city;

    @FindBy(xpath="//input[@id='ctl00_MainContent_fmwOrder_TextBox4']")
    public WebElement state;

    @FindBy(xpath="//input[@id='ctl00_MainContent_fmwOrder_TextBox5']")
    public WebElement zipCode;

    @FindBy(xpath="//a[@id='ctl00_MainContent_fmwOrder_InsertButton']")
    public WebElement progreesButton;

}
