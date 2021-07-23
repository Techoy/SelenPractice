package stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstFeatureCucumber {
    @When("I learn how to write scenarios")
    public void i_learn_how_to_write_scenarios() {
        System.out.println("this is 1 one ");
    }

    @Then("I became better tester")
    public void i_became_better_tester() {
        System.out.println("this is 2");
    }

    @When("I login to  amazon")
    public void i_login_to_amazon() {
        System.out.println("this is 2");
    }

    @Then("I can buy an IPhone")
    public void i_can_buy_an_IPhone() {
        System.out.println("this is 2");
    }

    @When("eat properly")
    public void eat_properly() {
        System.out.println("this is 2");
    }

    @Then("Then don't gain weight")
    public void then_don_t_gain_weight() {
        System.out.println("this is 2");
    }


}
