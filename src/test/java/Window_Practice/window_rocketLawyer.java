package Window_Practice;

import TestNG_Intro.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

import static javafx.scene.input.KeyCode.COMMAND;

public class window_rocketLawyer extends TestBase {

    @Test
    public static void test1(){
        driver.navigate().to("https://www.rocketlawyer.com/");
        Actions action=new Actions(driver);
        WebElement helpButton=driver.findElement(By.xpath("//div[@class='svg-svgs--icon-help-white-dims svg-svgs--icon-help-white']"));
        action.moveToElement(helpButton);
        WebElement chartOnline=driver.findElement(By.xpath("//div[@class='rlHomepageHeroArea']"));
        chartOnline.click();
        //action.sendKeys(COMMAND+"t");
        String homepage="https://www.rocketlawyer.com/nanorep.rl";
        Set<String> windows=driver.getWindowHandles();
        for(String window: windows) {
            if (!window.equals(homepage)) {
                driver.switchTo().window(window);
            }
        }
        System.out.println(driver.getWindowHandle());

        driver.switchTo().defaultContent();
        System.out.println(driver.getTitle());




    }


}
