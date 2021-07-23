package Window_Practice;

import TestNG_Intro.TestBase;
import com.sun.org.apache.xerces.internal.impl.dv.dtd.ENTITYDatatypeValidator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.plugin2.message.MarkTaintedMessage;

import java.util.List;
import java.util.Set;

import static org.openqa.selenium.Keys.ENTER;

public class Homework extends TestBase {

    @Test
    public static void test1(){
        driver.navigate().to("https://www.rocketlawyer.com/");
        WebElement startBusiness=driver.findElement(By.xpath("(//a[@href='/incorporation.rl'])[2]"));
        Actions action=new Actions(driver);
        action.moveToElement(startBusiness).perform();
        WebElement getStarted=driver.findElement(By.xpath("(//a[@class='primary'])[3]"));
        action.moveToElement(getStarted).perform();
          getStarted.click();
        String homePage=driver.getWindowHandle();
        Set <String> allPages=driver.getWindowHandles();
        for(String pages:allPages){
            if(!homePage.equals(pages)){
                driver.switchTo().window(pages);
            }

        }

        WebElement stateIncorperation=driver.findElement(By.xpath("(//select[@class='state'])[1]"));
        stateIncorperation.click();
        Select select=new Select(stateIncorperation);
        List<WebElement> allOptions=select.getOptions();
        for(WebElement options: allOptions){
            String str=options.getText();
            if(str.startsWith("M")){
                System.out.println(options.getText());
            }
        }
        WebElement selectLLC=driver.findElement(By.xpath("(//select[@class='businessType'])[1]"));
        Select select1=new Select(selectLLC);
        select1.selectByValue("C_CORP");// C corp select anf give value

    }
    @Test
    public static void test2(){

        driver.navigate().to("https://www.rocketlawyer.com/");
        WebElement helpButton=driver.findElement(By.xpath("//div[@class='svg-svgs--icon-help-white-dims svg-svgs--icon-help-white']"));
        Actions action=new Actions(driver);
        action.moveToElement(helpButton).perform();
        action.clickAndHold();

        WebElement chartOnline=driver.findElement(By.xpath("//div[@class='rlHomepageHeroArea']"));

       action.moveToElement(chartOnline).perform();
       action.sendKeys(Keys.ARROW_DOWN);
       action.sendKeys(ENTER);
        chartOnline.click();

        String homepage=driver.getWindowHandle();
        Set<String> allPages=driver.getWindowHandles();
        for(String pages: allPages){
            if(!homepage.equals(pages)){
                driver.switchTo().window(pages);

            }
        }

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.rocketlawyer.com/";
       if(actualUrl.equals(expectedUrl)){
            Assert.assertTrue(actualUrl.equals(expectedUrl));
           System.out.println(actualUrl.equals(expectedUrl));

        }
        }

    @Test
    public static void test3(){
        driver.navigate().to("https://www.rocketlawyer.com/");
        WebElement helpButton=driver.findElement(By.xpath("//div[@class='svg-svgs--icon-help-white-dims svg-svgs--icon-help-white']"));
        Actions action=new Actions(driver);
        action.moveToElement(helpButton).perform();
        action.sendKeys(Keys.ARROW_DOWN);

        WebElement call=driver.findElement(By.xpath("//a[@id='navbar_callus_link_logged_out']"));
        action.moveToElement(call).perform();
        call.sendKeys(ENTER);
        //call.click();
        Alert alert=driver.switchTo().alert();
       // action.sendKeys(ENTER);
        alert.dismiss();






    }

}
