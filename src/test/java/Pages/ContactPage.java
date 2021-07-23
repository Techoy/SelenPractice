package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

    public ContactPage(){
        PageFactory.initElements(Driver.getWebDriver("Chrome"),this);

    }
    @FindBy(xpath="//select[@id='id_contact']")
    public WebElement SubjectHeading;

    @FindBy(xpath="//input[@id='email']")
            public WebElement emailAddress;



}
