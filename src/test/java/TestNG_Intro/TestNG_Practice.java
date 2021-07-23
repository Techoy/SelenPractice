package TestNG_Intro;

import org.testng.annotations.*;

public class TestNG_Practice {
    @BeforeMethod
    public static void beforeMethod(){
        System.out.println("Before method annotation");// it implements before every method
    }
    @Test
    public static void testing1(){
        System.out.println("TestNG -->test annotation 1");
    }
    @Test
    public static void testing2(){
        System.out.println("TestNG -->test annotation 2");
    }
    @Test
    public static void testing3(){
        System.out.println("TestNG -->test annotation 3");
    }
    @AfterMethod
    public static void afterMethod(){
        System.out.println("Aftermethod annotation");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class execute one time before in the begining of the class");

    }

    @AfterClass
    public static void afterClass(){
        System.out.println("The after Class annotaion executes just once");
    }

}
