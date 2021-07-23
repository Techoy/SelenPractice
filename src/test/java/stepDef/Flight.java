package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import javax.swing.*;

public class Flight {
    @Given("Kayak {string} page should be open")
    public void kayak_page_should_be_open(String string) {
        System.out.println("Open");
    }





    @When("Search for one way flight from Chicago to New York on {int}\\/{int}\\/{int}")
    public void search_for_one_way_flight_from_Chicago_to_New_York_on(Integer month, Integer date, Integer year) {
        System.out.println("We are searching for flight on  "+month+date+year);
    }

    @Then("Displayed {int} or more one way flight options on webpage")
    public void displayed_or_more_one_way_flight_options_on_webpage(Integer numOfFlights) {
        System.out.println("Displayed 5 options");
    }@Given("Kayak (//S+) page should be open")
    public void kayak_hotel_page_should_be_open(String page) {
        System.out.println("ghdufi");
    }

    @When("Search for hotel in Chicago")
    public void search_for_hotel_in_Chicago() {
        System.out.println("088y4t4");
    }

    @When("chooses to stay from {int}\\/{int}\\/{int} to {int}\\/{int}\\/{int}")
    public void chooses_to_stay_from_to(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6) {
        System.out.println("ehgiogh");
    }

    @Then("The list of the cheapest hotels appeared on the page")
    public void the_list_of_the_cheapest_hotels_appeared_on_the_page() {
        System.out.println("jbvdojvb");
    }



}
