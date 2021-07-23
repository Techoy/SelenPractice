package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeWork_Page {
    public HomeWork_Page(){
        PageFactory.initElements(Driver.getWebDriver("chrome"),this);
    }

    @FindBy(xpath="//div[@id='UKFG-switch-display-status']")
    public WebElement dropOff;

    @FindBy(xpath="//input[@id='KLMw-pickup']")
    public WebElement pickUpPlace;


    @FindBy(xpath="//div[@id='KLMw-pickup-date-input']")
    public WebElement pickUpDate;

    @FindBy(xpath="//div[@id='KLMw-dropoff-date-input']")
    public WebElement dropOffDate;

    @FindBy(xpath="//button[@id='q5iD-submit'])")
    public WebElement searchButton;


}
