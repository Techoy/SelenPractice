package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook_Practice_Page {


    public FaceBook_Practice_Page(){
        PageFactory.initElements(Driver.getWebDriver("chrome"), this );
    }

    @FindBy(xpath="//input[@id='email']")
    public WebElement emailFacebook;


    @FindBy(xpath="//input[@id='pass']")
    public WebElement  password;

    @FindBy(xpath="//i[@class='_6rk2 img sp_DOVwx90K0FX sx_9c2700']")
    public WebElement likeButton;
    @FindBy(xpath="//input[@id='u_0_2']")
    public WebElement loginButton;






}
