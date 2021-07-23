package TestNG_Intro;

import org.testng.annotations.Test;

public class TimeOut_practice {
    @Test(timeOut=2000)// we you this timeout if the test case is the time sensitive
    //if my execution taking more than specified time it throwThreadTimeOutException
    public void test1() throws InterruptedException {
        System.out.println("this is for timeout");
        Thread.sleep(3000);

    }
}
