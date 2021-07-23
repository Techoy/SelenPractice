package com.techtorial.test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.expedia.com");
        driver.manage().window().maximize();
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='package-origin-hp-package']"));
        searchBox.sendKeys("Chicago");
        driver.close();

    }
}
