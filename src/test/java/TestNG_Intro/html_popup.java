package TestNG_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class html_popup {
    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("https://sweetalert.js.org/");

    }
    @Test
    static public void test1(){
        driver.findElement(By.xpath("(//button[@class='preview'])[2]")).click();


        WebElement okayButton=driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']"));
        okayButton.click();
        WebDriverWait wait=new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.elementToBeClickable(okayButton));
    }
    @AfterClass
    static public void tearDown(){
        driver.close();
    }

}
