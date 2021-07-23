package Practice;

import Pages.FaceBook_Practice_Page;
import Utilities.Driver;
import Utilities.Properties_Facebook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class FaceBook_Practice {
    FaceBook_Practice_Page page=new FaceBook_Practice_Page();


    @Test
    public void test() throws IOException, AWTException {
        Driver.getWebDriver("Chrome").get("https://www.facebook.com/");

        page.emailFacebook.sendKeys(Properties_Facebook.getValueFB("login"));
        page.password.sendKeys(Properties_Facebook.getValueFB("password"));
        page.loginButton.click();
        Alert alert=Driver.getWebDriver("chrome").switchTo().alert();
        alert.notifyAll();
        page.likeButton.click();

        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);


//        WebElement likeButton=Driver.getWebDriver("Chrome").findElement(By.xpath("//i[@class='_6rk2 img sp_DOVwx90K0FX sx_9c2700']"));
//
//        likeButton.click();

    }
}
