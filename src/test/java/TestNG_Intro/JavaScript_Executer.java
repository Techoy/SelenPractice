package TestNG_Intro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class JavaScript_Executer extends TestBase {

    JavascriptExecutor js; // it is coming from Selenium
    //We need javascript execution making a problem
    //I can achieve click, getTitle getURL, functions using javascript
    //To be use the javascript executor

    @Test
    public void test1(){
        js=(JavascriptExecutor)driver;// this is casting
        // this is to navigate to the website
        js.executeScript("window.location='https://www.expedia.com/'");

        //this you will get url of the website
        System.out.println(js.executeScript("return document.URL"));

        //this will return the title of the website
        System.out.println(js.executeScript("return.document.title"));

        WebElement searchButton=driver.findElement(By.id("search-button-hp-package"));
        //js.executeScript("arguments[0].click();",searchButton);
        // using JavaScript we scroll down
       // js.executeScript("window.open('http://www.google.com');");
        js.executeScript("window.open('http://www.google.com');");
       // js.executeScript("window.open('http://www.google.com','_blank');");

        String home=driver.getWindowHandle();

        Set<String> windows=driver.getWindowHandles();

        for(String window: windows){
            if(!home.equals(window)){
                driver.switchTo().window(window);
            }
        }
        System.out.println(js.executeScript("return document.title"));
        driver.switchTo().window(home);

        System.out.println(js.executeScript("return window.innerHeight"));
        System.out.println(js.executeScript("return window.innerWidth"));
        System.out.println(js.executeScript("window.scrollBy(0,1900)"));
        System.out.println(js.executeScript("window.scrollBy(0,-1900)"));
        js.executeScript("alert('Welcome Techtorial Academy");
        Alert alert=driver.switchTo().alert();
        alert.accept();





    }
}
