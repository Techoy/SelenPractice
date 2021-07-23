package TestNG_Intro;

import Pages.HW_Data_Proivder;
import Utilities.Driver;
import Utilities.PropertiesFilesIntro;
import org.testng.annotations.Test;

import java.io.IOException;

public class Properties_Practice {
    HW_Data_Proivder page=new HW_Data_Proivder();
    @Test
    public void test() throws IOException {
        Driver.getWebDriver("chrome").get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        page.username.sendKeys(PropertiesFilesIntro.getValue("login"));
        page.passsword.sendKeys(PropertiesFilesIntro.getValue("login"));
        page.loginButton.click();
        page.order.click();

    }
}
