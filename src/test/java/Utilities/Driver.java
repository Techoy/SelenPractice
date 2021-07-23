package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class Driver {
    static WebDriver driver;
    private static final Logger LOG= LoggerFactory.getLogger(Driver.class);

    public static WebDriver getWebDriver(String browser){
        if(driver==null) {
            switch(browser.toLowerCase()){
                case "chrome":
                    LOG.info("User selected Chrome browser");
                    WebDriverManager.chromedriver().setup();
                    // if you do not set up driver selenium will throw staleElementException
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    LOG.info("User selected FireFox browser");
                    WebDriverManager.firefoxdriver().setup();
                    // if you do not set up driver selenium will throw staleElementException
                    driver = new FirefoxDriver();
                case "ie":
                    LOG.info("User selected Internet Exploer browser");
                    WebDriverManager.iedriver().setup();
                    // if you do not set up driver selenium will throw staleElementException
                    driver = new InternetExplorerDriver();
                case "opera":
                    LOG.info("User selected Opera browser");
                    WebDriverManager.iedriver().setup();
                    // if you do not set up driver selenium will throw staleElementException
                    driver = new InternetExplorerDriver();
                default:
                    LOG.info("User selected (Chrome)default browser");
                    WebDriverManager.chromedriver().setup();
                    // if you do not set up driver selenium will throw staleElementException
                    driver = new ChromeDriver();

            }
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.manage().window().fullscreen();


        }
        return driver;

    }// System.setProperty(webdriver.chrome.driver,location of the jar file in the computer)


}
// For every webpage we have to create a class to store all the webelements
// It is easy to handle webelements. If I am changing id, xpath, cssSelecter I will change in one place
//Store elements with @FindBy annotation
//linkText tag is <a>  </a>
// create constructor