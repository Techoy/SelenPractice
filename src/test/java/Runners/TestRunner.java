package Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
        glue ="stepDef",
        tags={"@datatable","@homework"},
        dryRun=false)// way of grouping your scenarios
// you can put tag level on Features and Scenario

public class TestRunner {


}
