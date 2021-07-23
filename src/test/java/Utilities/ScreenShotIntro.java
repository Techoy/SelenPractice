package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenShotIntro {

    public static void takeScreenshot() throws IOException {
       // Driver.getWebDriver("chrome").get("http://www.google.com");
        File src=((TakesScreenshot)Driver.getWebDriver("chrome")).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("src/test/resources/screenshot"+System.currentTimeMillis()+".png"));
    }

         //timeStamp "System.currentTimeMillis to store screenShots name unique


    @Test(timeOut = 3000)
    public void test() throws InterruptedException {
        System.out.println("User navigating to Facebook");// this is logging it helps to recording of the activity
        // display on the console
        //write to a file or syslog
        //append to a database table

        Driver.getWebDriver("chrome").get("https://www.facebook.com");
        Thread.sleep(5000);
    }
    @Test
    public void test1(){
        Driver.getWebDriver("chrome").get("https://www.expedia.com");
        System.out.println("User navigating to expedia.com");

    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException{
        if(result.getStatus()==ITestResult.FAILURE){
            takeScreenshot();
        }
    }
}
