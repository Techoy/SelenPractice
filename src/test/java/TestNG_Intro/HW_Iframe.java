package TestNG_Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class HW_Iframe extends TestBase{
    JavascriptExecutor js;

    @Test
    public void test1(){
         driver.navigate().to("https://www.toolsqa.com/iframe-practice-page/");
       // List<WebElement> iframe=driver.findElements(By.xpath("//iframe"));

        WebElement iframeElement=driver.findElement(By.linkText("Droppable"));


        js.executeScript("window.scrollBy(0,1000)");
        driver.switchTo().frame(iframeElement);
        iframeElement.click();





    }

    @Test
    public void test2(){
        driver.navigate().to("http://the-internet.herokuapp.com/iframe");

       // WebElement iframe=driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));

        driver.switchTo().frame("tinymce");
        WebElement iframe=driver.findElement(By.id("tinymce"));
        iframe.clear();
        iframe.sendKeys("I'm here");


    }

}
