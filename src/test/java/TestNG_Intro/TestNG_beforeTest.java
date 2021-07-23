package TestNG_Intro;

import org.testng.annotations.*;

import java.sql.SQLOutput;

public class TestNG_beforeTest {
    @BeforeSuite
    public void test(){
        System.out.println("Before suite");
    }

    @BeforeTest
    public void test1(){
        System.out.println("Before Test annotation");

    }

    @Test
    public void test2(){
        System.out.println("This is test");

    }

    @AfterTest
     public void test3(){
        System.out.println("After test annotation");
    }

    @AfterSuite
    public void test4(){
        System.out.println("After Siute");
    }
}
/*
Annotation order

Before Suite
After Suite
BeforeTest
AfterTest
BeforeClass
AfterClass
BeforeMethod
AfterMethod

 */