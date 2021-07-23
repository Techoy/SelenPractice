package ProjectDayAutomation;

import TestNG_Intro.TestBase;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class Expedia_Page_TC1 {

    public Expedia_Page_TC1(){
        PageFactory.initElements(Driver.getWebDriver("chrome"), this);

    }
    @FindBy(xpath="(//span[@class='uitk-icon uitk-icon-hotels'])[1]")
    public WebElement hotelButton;

    @FindBy(xpath="//input[@id='hotel-destination-hp-hotel']")
    public WebElement goingTo;

    @FindBy(xpath="//input[@id='hotel-checkin-hp-hotel']")
    public WebElement checkIn;

    @FindBy(xpath="//input[@id='hotel-checkout-hp-hotel']")
    public WebElement checkOut;

    @FindBy(xpath="//*[@id=\"traveler-selector-hp-hotel\"]/div/ul/li")
     public WebElement traveler;

    @FindBy(xpath = "(//button[@class='uitk-step-input-button uitk-step-input-minus'])[7]")
    public WebElement minusAdult;

    @FindBy(xpath="(//button[@class=\"uitk-step-input-button uitk-step-input-plus\"])[1]")
     public WebElement addAdult;

    @FindBy(xpath="(//button[@class='uitk-step-input-button uitk-step-input-plus'])[8]")
    public WebElement addChild;

    @FindBy(xpath="(//button[@class='btn-primary btn-action  gcw-submit'])[1]")
    public WebElement searchButton;

    @FindBy(xpath="(//button[@class='uitk-faux-input'])[5]")
            public WebElement searchByPropertyName;

    @FindBy(xpath="(//select[@type='select'])[27]")
    public WebElement ageSelect;

    @FindBy(xpath="//input[@id=\'hotel-add-flight-checkbox-hlp\']")
    public WebElement getAddFlight;

    @FindBy(xpath="//input[@id='hotel-flight-origin-hlp']")
    public WebElement FlyingFrom;

    @FindBy(xpath="//button[@class='btn-primary btn-action  gcw-submit']")
    public WebElement searchHotelFlight;

    @FindBy(xpath="(//button[@class='btn-sort tab'])[3]")
    public WebElement guestRating;

    @FindBy(xpath = "//button[@class=\"uitk-button uitk-button-large uitk-button-fullWidth uitk-button-primary\"]")
    public WebElement Search2;










}
