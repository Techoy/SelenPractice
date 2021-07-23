package Test;

import PageObject.Homepage;
import TestNG_Intro.TestBase;
import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class xpedia_test extends TestBase {

     Homepage page=new Homepage();

    @Test(groups={"Eliza"})
    public void test1(){
        driver.get("https://www.expedia.com");
        page.FlightButton.click();

    }

}
