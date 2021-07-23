package TestNG_Intro;

import Pages.HomeWork_Parallel_Page;
import Utilities.Driver;
import com.beust.jcommander.Parameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;


public class HomeWork_Parallel {
    WebDriver driver;
    HomeWork_Parallel_Page page=new HomeWork_Parallel_Page();

    @BeforeMethod
    @Parameters("browser")
    public void setUp(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();

        }else{
            WebDriverManager.iedriver().setup();
            driver=new InternetExplorerDriver();
             }

        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @Test
    public void test1(){
        Driver.getWebDriver("chrome").get("http://automationpractice.com/index.php?controller=contact");

        Select select=new Select(page.subjectHeading);
        select.selectByValue("2");
        //page.subjectHeading.sendKeys(Keys.ARROW_DOWN);
        page.emailAddress.sendKeys("eliza.zhusupova@mail.ru");
        page.orderReference.sendKeys("Shipping");
        page.chooseFile.sendKeys("C:\\Users\\nurik\\Desktop\\Gulcha.jpg");
        page.messageBox.click();
        page.messageBox.sendKeys("This order with shipping");
        page.searchButton.click();
        String actualResult=page.succesSend.getText();

        String expectedResult="Your message has been successfully sent to our team.";

        SoftAssert soft=new SoftAssert();
        soft.assertEquals(expectedResult,actualResult);


    }
}
