package PageObject;

import TestNG_Intro.TestBase;
import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    public Homepage() {

        PageFactory.initElements(Driver.getWebDriver("Chrome"), this);
    }
   @FindBy(xpath="//input[@id='flight-origin-flp']")
    public WebElement FlightButton;

    @FindBy(id="flight-origin-flp")
    public WebElement flightFrom;

    @FindBy(xpath="//input[@id='flight-destination-flp']")
    public WebElement flyingTo;



}
