package TestNG_Intro;

import org.testng.annotations.Test;

public class dependsOnAnnotation {

    @Test(dependsOnMethods = "test2")// test2 will execute first
    public void test1(){
        System.out.println("Test 1 method");
    }
    @Test
    public void test2(){

        System.out.println("Test 2 method");
    }
    @Test(dependsOnGroups = "test1")
    public void test3(){
        System.out.println("Test 3 method");
    }
}
