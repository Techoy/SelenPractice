package Window_Practice;

import TestNG_Intro.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class window_practice extends TestBase {
    @Test
    public static void test1(){
        driver.navigate().to("https://www.messenger.com/");
        WebElement googlePlay=driver.findElement(By.xpath("//i[@class='img sp_RpQ8QNMBode sx_9ca3e7']"));
        googlePlay.click();


        //Selenium handles just one webpage/tab at a time
        //To be able to click installButton on googlePlay  we need to switch window
        //GetWindowHandle will return String the id
        String homepage=driver.getWindowHandle();

        System.out.println(homepage);
        Set<String> allPages=driver.getWindowHandles();
        for(String window:allPages){
            //System.out.println(window);
            if(!window.equals(homepage)) {
                driver.switchTo().window(window);
            }
            }
            WebElement installButton=driver.findElement(By.xpath("//button[@aria-label='Install']"));

            installButton.click();




    }
}
