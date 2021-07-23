package TestNG_Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Iframe_Practice extends TestBase{

    // IFRAME there can be nested html code html inside html
    // Selenium handle just one html code
    // Before inner html has tag iframe
    //to be able to execute the script inside iframe we need  to switch the frame
    //to swithch with the name, id ; with the index; by element;



    @Test
    public void test1(){
        driver.get("https://www.toolsqa.com/iframe-practice-page/");
        List<WebElement> iframe=driver.findElements(By.xpath("//iframe"));
        System.out.println(iframe.size());
        //I am switching to nested html(FRAME)
        //driver.switchTo().frame("iframe2");// by name
      //  driver.switchTo().frame(1);// by index 0 based indexing
        WebElement iframe2=driver.findElement(By.xpath("//iframe[@id='IF2']"));
        driver.switchTo().frame(iframe2);// switching by element





        // to be able to store as a linkedtext My tag should be "a"
        String sortable=driver.findElement(By.linkText("Sortable")).getText();
        System.out.println(sortable);

// homework dataProvider



    }


}
