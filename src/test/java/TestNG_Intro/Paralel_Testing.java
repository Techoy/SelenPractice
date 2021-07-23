package TestNG_Intro;

import com.beust.jcommander.Parameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.session.FirefoxFilter;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Paralel_Testing {
    static WebDriver driver;
    @BeforeMethod
    @Parameters("browser")
    public void setUp(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
        }else if(browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver= new FirefoxDriver();
        }else{
            WebDriverManager.iedriver().setup();
            driver=new InternetExplorerDriver();

        }
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @Test
    public void test1(){
        driver.get("http://automationpractice.com/index.php?controller=contact");
        String actual=driver.findElement(By.xpath("//select[@id='id_contact'/")).getText();
        String expected="Subject Title";
        Assert.assertEquals(expected,actual);
        // in hard assertion Assert.asserteEquals(expected, actual)
        // if test case is failing it will throw the exception right away
        System.out.println("Subject and heading is not matching");
        SoftAssert soft=new SoftAssert();
        // in soft asserttion it will no throw an exception right awa. it will continue execution
        //recommended method assertAll() used to know which assertion is failed
        soft.assertEquals(actual,expected);



    }
}
