package Test;

import Pages.ContactPage;
import TestNG_Intro.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ContactTest extends TestBase {

    ContactPage page=new ContactPage();

    @Test (groups = {"Eliza"})
    public void test1(){
        driver.get("http://automationpractice.com/index.php?controller=contact");
        String actual=page.SubjectHeading.getText();
        String expected="Subject Title";
        Assert.assertEquals(expected,actual);
        // in hard assertion Assert.asserteEquals(expected, actual)
        // if test case is failing it will throw the exception right away
        System.out.println("Subject and heading is not matching");
        SoftAssert soft=new SoftAssert();
        // in soft asserttion it will no throw an exception right awa. it will continue execution
        //recommended method assertAll() used to know which assertion is failed
        soft.assertEquals(actual,expected);
        String emailActual=page.emailAddress.getText();
        String emailExpected="Email Address";
        soft.assertEquals(emailActual,emailExpected);
        soft.assertAll();

    }
}
