package stepDef;

import Pages.HomeWork_Page;
import TestNG_Intro.TestBase;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.Set;

import static Utilities.ScreenShotIntro.takeScreenshot;

public class HomeWork extends TestBase {
    HomeWork_Page kayak=new HomeWork_Page();
    @Given("Kayak car page should be open")
    public void kayak_car_page_should_be_open() {
        Driver.getWebDriver("chrome").get("https://www.kayak.com/horizon/sem/cars/general");
    }

    @When("Search for the car from Chicago with the same drop-off destination")
    public void search_for_the_car_from_Chicago_with_the_same_drop_off_destination() {
        //kayak.dropOff.click();
        Select select=new Select(kayak.dropOff);
        select.selectByIndex(0);
        kayak.pickUpPlace.clear();
        kayak.pickUpPlace.sendKeys("alaska");
        kayak.pickUpDate.clear();
        kayak.pickUpDate.sendKeys("08/12/2019");
        kayak.dropOffDate.clear();
        kayak.dropOffDate.sendKeys("08/20/2019");
        kayak.searchButton.click();

    }

    @Then("List of car options is appeared on the page")
    public void list_of_car_options_is_appeared_on_the_page() throws IOException {
        String carPage=driver.getWindowHandle();
        Set<String> allpages=driver.getWindowHandles();
        for(String pages:allpages){
            if(carPage.equals(pages)){
                driver.switchTo().window(pages);
            }

        }
        takeScreenshot();

    }

    @When("Search for a car from non-existing destination")
    public void search_for_a_car_from_non_existing_destination() {
        kayak.dropOff.click();
        Select select=new Select(kayak.dropOff);
        select.selectByIndex(1);

        kayak.pickUpPlace.sendKeys("iiii");
        kayak.pickUpDate.sendKeys("08/12/2019");
        kayak.dropOffDate.sendKeys("08/20/2019");
        kayak.searchButton.click();


    }

    @Then("Appeared page with error message")
    public void appeared_page_with_error_message() throws IOException {
        String carPage=driver.getWindowHandle();
        Set<String> allpages=driver.getWindowHandles();
        for(String pages:allpages){
            if(carPage.equals(pages)){
                driver.switchTo().window(pages);
            }

        }
        takeScreenshot();


    }

}
