package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class DataTableSteps {
    @Given("I placed an order with following item")
    public void i_placed_an_order_with_following_item(io.cucumber.datatable.DataTable dataTable) {
        List<String> billDatas = dataTable.asList();
        for(String data:billDatas){
            System.out.println(data);
        }
    }

    @When("I generate the bill")
    public void i_generate_the_bill() {

    }
    @Then("A bill for {int} should be generated")
    public void a_bill_for_should_be_generated(Integer int1) {

    }

    @Given("I placed an order with following items")
    public void i_placed_an_order_with_following_items(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> listOfLists = dataTable.asLists();
        for(List<String> billItems:listOfLists){
            for(String item:billItems){
                System.out.println(item);
            }
        }
    }


    @Given("I placed an order with following items through map")
    public void i_placed_an_order_with_following_items_through_map(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> listOfMaps = dataTable.asMaps();
        for (Map<String, String> map : listOfMaps) {
            //map.forEach((k, v) -> System.out.println(k + " : " + v));
            for(Map.Entry<String,String> billItem: map.entrySet()){
                System.out.println(billItem.getKey() +" : " +billItem.getValue());
            }
        }


    }
}
