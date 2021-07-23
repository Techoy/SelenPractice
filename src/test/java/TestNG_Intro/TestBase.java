package TestNG_Intro;

import Utilities.Driver;
import Utilities.ScreenShotIntro;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    static public WebDriver driver;

    @BeforeClass
    public static void setUp(){
        driver=Driver.getWebDriver("chrome");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if(result.getStatus()==ITestResult.FAILURE){
            ScreenShotIntro.takeScreenshot();
        }
    }
    @AfterClass
    public static void tearDown(){

      //  driver.close();
    }
}
