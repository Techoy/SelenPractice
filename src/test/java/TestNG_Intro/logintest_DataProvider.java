package TestNG_Intro;

import Pages.WebOrder_loginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class logintest_DataProvider extends TestBase {
    WebOrder_loginPage page=new WebOrder_loginPage();

   @DataProvider(name="input")

    public Object[][] getData(){
        return new Object[][]{{"Tester", "techtorial"},{"TT", "test"},{"Tester","test"}
        };
    }

    @Test(dataProvider = "input")
    public void loginTest(String username, String password){
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        page.username.sendKeys(username);
        page.password.sendKeys(password);
        page.loginButton.click();

    }


}
