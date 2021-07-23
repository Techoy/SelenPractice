package stepDef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hooks {
    private static final Logger LOG= LoggerFactory.getLogger(Hooks.class);
// as many Before can be used
    @Before(value="@regression", order=200)// ascending order for Before
    public void setUp1(){
        // setting up a browser
        LOG.info("Before hook");
    }
    @Before("@smoke")
    public void setUp2(){
        // setting up a browser
        LOG.info("Before hook");
    }
    @Before("@sanity")
    public void setUp3(){
        // setting up a browser
        LOG.info("Before hook");
    }
    @After(order=200)// descending order for After annotation
    public void tearDown(){

        //sign out
        //quit browser
        LOG.info("After hook");

    }
}
