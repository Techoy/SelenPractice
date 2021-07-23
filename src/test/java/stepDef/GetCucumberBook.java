package stepDef;

import TestNG_Intro.TestBase;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Set;

import static TestNG_Intro.TestBase.driver;

public class GetCucumberBook extends TestBase {
    @Given("Google search page is open")
    public void google_search_page_is_open() {
        Driver.getWebDriver("Chrome").get("https://www.google.com");

    }

    @When("Entered {string} in the search box")
    public void entered_in_the_search_box(String string) {
        WebElement searchBox=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchBox.sendKeys("Cookbook");
        searchBox.sendKeys(Keys.ENTER);
    }

    @Then("Displayed the list of options for CookBook")
    public void displayed_the_list_of_options_for_CookBook() {
        Set<String> allpages=driver.getWindowHandles();
        String currentPage=driver.getWindowHandle();
        for(String pages:allpages){
            if(currentPage.equals(pages)){
                driver.switchTo().window(pages);
            }
        }

    }

}
