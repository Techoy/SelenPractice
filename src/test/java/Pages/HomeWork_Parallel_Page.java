package Pages;

import TestNG_Intro.HomeWork_Parallel;
import TestNG_Intro.TestBase;
import Utilities.Driver;
import javafx.beans.value.WeakChangeListener;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeWork_Parallel_Page {

    public HomeWork_Parallel_Page(){
        PageFactory.initElements(Driver.getWebDriver("Chrome"),this);
    }

    @FindBy(xpath="//select[@id='id_contact']")
    public  WebElement subjectHeading;

    @FindBy(xpath="//input[@id='email']")
    public WebElement emailAddress;

    @FindBy(xpath="//input[@id='id_order']")
    public WebElement orderReference;

    @FindBy(xpath="//span[@class='filename']")
    public WebElement fileAttachmet;

    @FindBy(xpath="//textarea[@id='message']")
    public  WebElement messageBox;
    @FindBy(xpath="//*[@id=\"submitMessage\"]")
    public WebElement searchButton;
    @FindBy(xpath="//p[@class='alert alert-success']")
    public WebElement succesSend;

    @FindBy(xpath="//input[@id='fileUpload']")
    public WebElement chooseFile;
}
