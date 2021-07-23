package TestNG_Intro;

import com.beust.jcommander.Parameter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_parameter {

    @Test
    @Parameters("browser")
    public void test1(String browser){
        System.out.println("This the example for paramertirization in TestNG. The parameter is "+browser);
    }

    @Test
    @Parameters("OS")
    public void test2(String OS){
        System.out.println("This is operation system"+OS);
    }

}
