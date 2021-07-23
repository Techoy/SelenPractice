package TestNG_Intro;

import org.testng.annotations.Test;

public class TestNG_Priority {
    @Test(priority=1, enabled=false)// to skip the execution use enabled=false
    public static void testing1(){
        System.out.println("TestNG -->test annotation 1");
    }
    @Test(priority=2)// if you commented out annotation it will not run
    public static void testing2(){
        System.out.println("TestNG -->test annotation 2");
    }
    @Test(priority=3)// to change the order of the execution we put priority
    public static void testing3(){
        System.out.println("TestNG -->test annotation 3");
    }
// test will execute by alphabetical order
    //
}
