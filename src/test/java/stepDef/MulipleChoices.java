package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MulipleChoices {
    private static final Logger LOG=LoggerFactory.getLogger(MulipleChoices.class);

    @Given("The grocery store is open")
    public void the_grocery_store_is_open() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("We go to the store")
    public void we_go_to_the_store() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("User buys {int} and {int} carrots")
    public void user_buys_and_carrots(Integer apples, Integer carrots) {
        LOG.info("We are buying {} apples {} carrots", apples, carrots);
    }

}
