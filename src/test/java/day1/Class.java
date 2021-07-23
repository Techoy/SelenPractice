package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Class {
    static WebDriver driver;

    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/");
        String expectedURL="http://the-internet.herokuapp.com/";


        String actualURL=driver.getCurrentUrl();
        if(expectedURL.equals(actualURL)){
            System.out.println("The expected and  actual URL is matching");
        }else{
            System.out.println("The test case failed");
        }
        WebElement forgotPass=driver.findElement(By.linkText("Forgot Password"));
        forgotPass.click();

        String expectedAfterForgotPass="http://the-internet.herokuapp.com/";

        String afterForgotPass= driver.getCurrentUrl();

        if(expectedAfterForgotPass.equals(afterForgotPass)){
            System.out.println("is matching after clicking");
        }else{
            System.out.println("is not matching after clicking");
        }
driver.findElement(By.id("email")).sendKeys("eliza.zhusupova@mail.ru");

        driver.findElement(By.id("form_submit")).click();

        String expectedURL1="http://the-internet.herokuapp.com/email_sent";
        String actualURL1=driver.getCurrentUrl();
        //expected conditionis coming from business requirement
        //Do not ask the developer
        //Do not copy from application itself
        //Business requirement Scrum master, Business Analyst, Product owner
        //You can find under user story
        // Confluence page in JIRE

        if(expectedURL1.equals(actualURL1)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
            throw new Exception();
        }

        WebElement message=driver.findElement(By.id("content"));

        message.getText();

        String expectedMessage="Your e-mail's been sent!";
        String actualMessage=message.getText();
        if(expectedMessage.equals(actualMessage)){
            System.out.println("Pass");
        }else{
            System.out.println("Failed");
        }

        driver.navigate().back();// one step back
        driver.navigate().forward();
        driver.navigate().refresh();
        // Show execution point checks every line
        //debug pauses the code execution and you should Evaluate expression

        driver.close();
        // close methods closes the last tab
        driver.quit();
        // close all the tabs which are opened

        driver.get("http://the-internet.herokuapp.com/");
        List<WebElement> list=driver.findElements(By.xpath("//li//a"));
        for(int i=0; i<list.size();i++){
            list.get(i).getText();
        }



    }
}
