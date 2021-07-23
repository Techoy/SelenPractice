package TestNG_Intro;

import Pages.HW_Data_Proivder;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomeWork_DataProvider extends TestBase{

    HW_Data_Proivder page=new HW_Data_Proivder();

    @DataProvider(name="info")

    public Object[][] getData(){

        return new Object[][]{{"Aisanam", "W Catalpa","Chicago", "Illinois", "60625"},{"Toma", "N Foster", "Houston", "Texas", "8976"},{"Sagyn","Wellington", "San Diego", "California", "6789"}};

    }

    @Test(dataProvider = "info")
    public void test1(String customerName,String street, String city, String state,String zip){
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        page.username.sendKeys("Tester");
        page.passsword.sendKeys("test");
        page.loginButton.click();
        page.order.click();
        page.customerName.sendKeys(customerName);
        page.street.sendKeys(street);
        page.city.sendKeys(city);
        page.state.sendKeys(state);
        page.zipCode.sendKeys(zip);

    }
}
