package Test;

import Pages.automationWebSite_page;
import TestNG_Intro.TestBase;
import org.testng.annotations.Test;

public class AutomationPractice_test extends TestBase {

    automationWebSite_page home=new automationWebSite_page();


    @Test
    public void test1(){
        home.searchBox.click();
    }


}
