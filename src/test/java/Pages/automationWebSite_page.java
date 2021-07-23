package Pages;

import TestNG_Intro.TestBase;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class automationWebSite_page extends TestBase {

    public automationWebSite_page(){
        PageFactory.initElements(Driver.getWebDriver("Chrome"), this );
    }
    @FindBy(id="search_query_top")
    public WebElement searchBox;

    @FindBy(className = "sf-menu clearfix menu-content sf-js-enabled sf-arrows")
    public WebElement searchButton;



}
