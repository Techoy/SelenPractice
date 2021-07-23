package TestNG_Intro;

import Utilities.Driver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
    @DataProvider(name="identity")// to store options and to store data in one time

    public Object[][] getData(){


        return new Object[][]{{"Muammer", "Turan"},{"Arslan", "Kabulniyazov"},{"Temirlan", "Nurkul"}

        };
    }


    @Test (dataProvider = "identity")
    public void test1(String firstName, String lastNam){
        Driver.getWebDriver("chrome").get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        System.out.println("The first name is "+firstName);
        System.out.println("The last name is "+lastNam);

    }

}
