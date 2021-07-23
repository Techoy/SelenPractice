package Select_Practice;

import TestNG_Intro.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SelectClass_Practice extends TestBase {

    @Test
    static public void test1() {
        driver.navigate().to("http://the-internet.herokuapp.com/dropdown");
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select=new Select(dropDown);
        // Select class will take an argument Webelement
        //Select class has 3 options
        //selectByText by dropoff text
        //selectByValue it is coming from html
        //selectByIndex

        select.selectByVisibleText("Option 1");

    }
    @Test
    static public void test2(){
        driver.get("https://www.spicejet.com/");
        //WebElement addOn=driver.findElement(By.id("highlight-addons"));
        WebElement currency=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select select=new Select(currency);
        select.selectByVisibleText("USD");

    }

    @Test
    public static void test3(){

        driver.navigate().to("http://the-internet.herokuapp.com/dropdown");
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select=new Select(dropDown);
        select.selectByValue("1");

    }
    @Test
    public static void test4(){
        driver.get("https://www.spicejet.com/");
        WebElement currency=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select select=new Select(currency);
        select.selectByValue("AED");

    }
    @Test
    public static void test5(){
        driver.navigate().to("http://the-internet.herokuapp.com/dropdown");
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select=new Select(dropDown);
        select.selectByIndex(2);// zero based indexing-- 0 index is selected by default
          }
     @Test
    public static void test6(){
         driver.get("https://www.spicejet.com/");
         WebElement currency=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
         Select select=new Select(currency);
         select.selectByIndex(3);
         List<WebElement> options=select.getOptions();// we get all the options storing in ArrayList webelement values
 String actual=options.get(1).getText();
 String expected="ING";

         Assert.assertEquals(actual,expected);
         for(WebElement opt:options){
             System.out.println(opt.getText());
         }

     }
     @Test
    public static void test7(){
         driver.get("https://www.spicejet.com/");
         WebElement currency=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
         Select select=new Select(currency);
         List<String> expectedOption=new ArrayList<>();
         expectedOption.add("Select");
         expectedOption.add("INR");
         expectedOption.add("AED");
         expectedOption.add("USD");

         List<WebElement> actualOption=select.getOptions();
         String actual="actual";
         String expected="expected";

         for(int i=0; i<expectedOption.size(); i++){
             actual=actualOption.get(i).getText();
             expected=expectedOption.get(i);
             Assert.assertEquals(actual,expected);

         }




     }



}
