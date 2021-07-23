package TestNG_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Alerts_Practice extends TestBase {


    @Test(enabled = false)
    public static void test() {
        driver.navigate().to("http://the-internet.herokuapp.com/javascript_alerts");
        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        Alert alert = driver.switchTo().alert();
        alert.accept();
        List<WebElement> names = driver.findElements(By.xpath("//li/button"));
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals("Click for JS Alert")) {
                System.out.println(names.get(i).getText());
            }

        }
    }
    @Test()
    public static void test2(){
        WebElement JsConfirm=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        JsConfirm.click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();

        String actualResult=driver.findElement(By.id("result")).getText();
        String expectedResult="You clicked: Cancel";
        Assert.assertEquals(expectedResult,actualResult);

    }
    @Test
    public static void test3(){
        WebElement jsPrompt=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        jsPrompt.click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Techtorial academy ");
        String actual=driver.findElement(By.id("result")).getText();
        String expected="You clicked: Techtorial academy";
        Assert.assertEquals(actual,expected);


    }


}
