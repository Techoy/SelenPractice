package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

    static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();// fullscreen()
        String url = "http://the-internet.herokuapp.com/";
        driver.get(url);
        WebElement fileUpload = driver.findElement(By.linkText("File Upload"));
        fileUpload.click();
        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("C:\\Users\\nurik\\Desktop\\uploadFile.rtf");
        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();
        String uploadBar=driver.findElement(By.id("uploaded-files")).getText();
        String expectedUploadBar="uploadFile.rtf";
        String actualUploadBar=uploadBar;
        if(expectedUploadBar.equals(uploadBar)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


    }
}
