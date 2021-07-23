package TestNG_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class xpedia_wait {

    static WebDriver driver;
   @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
       driver.get("https://www.expedia.com/Flights?semcid=US.B.BING.BT-c-EN.FLIGHT&semdtl=a1268772542.b11287528277475401.r1.g1kwd-80470628032467:aud-806555322.i1.d180470559730791.e1c.j1190.k1.f1.n1.l1o.h1e.m1be&msclkid=4c8d118c3f8d1791e6284c897303aba0&utm_source=bing&utm_medium=cpc&utm_campaign=USA%3AENG%3A@%3ABT%3AX%3AX%3AE%3AX%3A&utm_term=expedia%20flights&utm_content=USA%3AENG%3A@%3ABT%3AX%3AXX%3AX%3AX%3AX%3AX%3AE%3AX%3Aflight%3Aexpedia_flights%3A");
// IF YOU PUT TIMEOUT IMPLICITELYWAIT IT WILL WAIT IF THE ELEMENTS DON'T LOAD IT WILL THROW AN EXCEPTION
       //if it is loaded it will continue to run it will not wait 5 sec to go further
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   }
    @Test
    public static void test1(){
        WebElement flight=driver.findElement(By.xpath("//input[@id='flight-origin-flp']"));
        flight.sendKeys("Chicago");
        flight.sendKeys(Keys.ARROW_DOWN);
        flight.sendKeys(Keys.ENTER);

        WebElement flightTo=driver.findElement(By.xpath("//input[@id='flight-destination-flp']"));
        flightTo.sendKeys("Los Angeles");

        flightTo.sendKeys(Keys.ARROW_DOWN);
        flightTo.sendKeys(Keys.ENTER);

        WebElement departing=driver.findElement(By.xpath("//input[@id='flight-departing-flp']"));
        departing.sendKeys("06/27/2019");

        WebElement returning=driver.findElement(By.xpath("//input[@id='flight-returning-flp']"));
        returning.sendKeys("06/27/2019");

        WebElement travelers=driver.findElement(By.xpath("//body[@class='wrap cf aoa-enabled exp28390-1']"));
        travelers.sendKeys("1");
        WebElement search=driver.findElement(By.xpath("(//button[@class='btn-primary btn-action gcw-submit'])[1]"));
        search.click();

        WebElement peopleNumber=driver.findElement(By.className("notification-text"));
        WebDriverWait wait=new WebDriverWait(driver, 5);// Explicit way of waiting for specific element on the page
        wait.until(ExpectedConditions.visibilityOf(peopleNumber));// if it is more than 5 min it will throw an exception timeOut
        System.out.println(peopleNumber.getText());
        WebElement non_Stop=driver.findElement(By.xpath("//input[@id='stopFilter_stops-0']"));
        non_Stop.click();




    }
}
