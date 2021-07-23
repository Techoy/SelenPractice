package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class2 {
    static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        driver.manage().window().maximize();// fullscreen()
//        driver.get("https://www.primefaces.org/showcase/ui/misc/effect.xhtml");
//        WebElement slide=driver.findElement(By.id("slide_content"));
    Actions action= new Actions(driver);
//        action.doubleClick(slide).perform();
//
//
//        //contextClick()- right click of the mouse
//        driver.navigate().to("http://demo.guru99.com/test/simple_context_menu.html");
//                WebElement rightClick=driver.findElement(By.className("context-menu-one"));
//        action.contextClick(rightClick).perform();
//
//        driver.get("https://www.toolsqa.com/automation-practice-form/");
//        WebElement tool=driver.findElement(By.xpath("//a[@data-level='1')][3]"));
//        action.moveToElement(tool).perform();
//        action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();

        driver.navigate().to("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();

        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droptarget"));
        action.sendKeys(Keys.ARROW_DOWN).perform();
        action.sendKeys(Keys.ARROW_DOWN).perform();
        action.dragAndDrop(source, target).perform();
        

    }

}
