package ProjectDayAutomation;

import TestNG_Intro.TestBase;
import Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Expedia_Test extends TestBase {

    JavascriptExecutor js;

    Expedia_Page_TC1 home=new Expedia_Page_TC1();
    @Test
    public void test1(){
       driver.navigate().to("https://www.expedia.com");
                home.hotelButton.click();
        home.goingTo.sendKeys("San Francisco");
        home.checkIn.sendKeys("8/23/2019");
        home.checkOut.sendKeys("8/25/2019");
        home.checkOut.sendKeys(Keys.TAB);
        home.traveler.click();
//        Set<String> allWindows=driver.getWindowHandles();
//        System.out.println(allWindows.size());
        home.minusAdult.click();
        home.addChild.click();
        Select select=new Select(home.ageSelect);
        select.selectByValue("6");
        home.traveler.click();
        home.searchButton.click();


        String firstWindow=driver.getWindowHandle();
        String actual="";
        Set<String> allWindows=driver.getWindowHandles();
        System.out.println(allWindows.size());

       for(String window: allWindows){
           if(!firstWindow.equalsIgnoreCase(window)){
              // Driver.getWebDriver("chrome").switchTo().window(window);
               driver.switchTo().window(window);
               Assert.assertEquals(driver.getWindowHandle(),window);
               System.out.println(driver.getTitle());
               System.out.println(firstWindow);


           }


    }

       home.Search2.click();
      //  Assert.assertEquals(driver.getWindowHandle(),actual);
//        js.executeScript("window.scrollBy(0,500)");
////       home.searchByPropertyName.sendKeys(Keys.ARROW_DOWN);
////        home.searchByPropertyName.sendKeys(Keys.ARROW_DOWN);
        WebDriverWait wait= new WebDriverWait(Driver.getWebDriver("chrome"),5);
       wait.until(ExpectedConditions.elementToBeClickable(home.searchByPropertyName));


       home.searchByPropertyName.sendKeys("Hotel G San Francisco");

    }

    @Test
    public void test2(){
        Driver.getWebDriver("Chrome").get("www.expedia.com");
        home.goingTo.sendKeys("Portland");
        home.checkIn.sendKeys("8/23/2019");
        home.checkOut.sendKeys("8/25/2019");
        home.addAdult.click();
        home.getAddFlight.click();
       // home.searchButton.click();
        home.FlyingFrom.sendKeys("Chicago");
        home.searchHotelFlight.click();
        String mainPage=Driver.getWebDriver("Chrome").getWindowHandle();
        Set <String> allPages= Driver.getWebDriver("Chrome").getWindowHandles();
        for(String pages:allPages){
            if(!mainPage.equals(pages)){
                Driver.getWebDriver("Chrome").switchTo();
            }
        }
        home.guestRating.click();

    }
    @Test
    public void test3(){
        Driver.getWebDriver("Chrome").get("www.expedia.com");
        home.goingTo.sendKeys("iiiiii");
        home.checkIn.sendKeys("7/21/2019");
        home.checkOut.sendKeys("7/22/2019");
        home.searchButton.click();
         }

}
