package Window_Practice;

import TestNG_Intro.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class window_herokuapp extends TestBase {
    @Test
   public static void test1(){
        driver.get("http://the-internet.herokuapp.com/windows");
        WebElement click=driver.findElement(By.linkText("Click Here"));
         click.click();
         String homepage=driver.getWindowHandle();
         Set<String> windows=driver.getWindowHandles();
         for(String window:windows){
             driver.switchTo().window(window);
         }
       driver.switchTo().window(homepage);

    }



}
