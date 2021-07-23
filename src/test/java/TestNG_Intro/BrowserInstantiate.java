package TestNG_Intro;

import Utilities.Driver;
import org.testng.annotations.Test;

public class BrowserInstantiate {

    @Test
    public void test1() {
        Driver.getWebDriver("chrome").get("http://the-internet.herokuapp.com/iframe");


    }



}
