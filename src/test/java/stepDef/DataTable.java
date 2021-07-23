package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.collections.Maps;

import java.util.List;
import java.util.Map;

public class DataTable {
    @Given("the following users existing")
    public void the_following_users_existing(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        List<Map<String, String>> stringMap=dataTable.asMaps(String.class, String.class);
        System.out.println("Emails from datatable "+stringMap.get(0).get("email"));
        System.out.println(stringMap.get(1).get("twitter"));
        System.out.println(stringMap.get(0).get("email"));
        for(Map<String, String> str:stringMap){
            System.out.println(str.get("name"));

        }
        List<List<String>> lists=dataTable.asLists(String.class);
        System.out.println(lists.get(1).get(2));

    }

    @When("user writes email to Aslak")
    public void user_writes_email_to_Aslak() {
        System.out.println("nknbkk");
    }

    @Then("Aslak responds")
    public void aslak_responds() {
        System.out.println("buipg");
    }

}
