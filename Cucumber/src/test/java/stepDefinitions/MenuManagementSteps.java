package stepDefinitions;

import com.mp.cucumber.RestarauntMenuItem;
import com.mp.cucumber.RestaurantMenu;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MenuManagementSteps {

    RestarauntMenuItem menuItem;
    RestaurantMenu restaurantMenu = new RestaurantMenu();
    String errorMessage;

    @Given("I have a menu item with name {string} and price {int}")
    public void i_have_a_menu_item_with_name_and_price(String menuItemName, Integer price) {
        // Write code here that turns the phrase above into concrete actions
        menuItem = new RestarauntMenuItem(menuItemName,"some description", price);
        System.out.println("step 1 completed");
    }

    @When("I add that menu item")
    public void i_add_that_menu_item() {
        try{
            restaurantMenu.add(menuItem);
        } catch(IllegalArgumentException ex) {
            errorMessage = ex.getMessage();
        }

        System.out.println("step 2 completed");
    }

    @Then("Menu item with the name {string} should be added")
    public void menu_item_with_the_name_should_be_added(String string) {
        System.out.println(restaurantMenu.isMenuItemExists(menuItem));
        System.out.println("step 3 completed");
    }

    @Then("I should see an error message {string}")
    public void i_should_see_an_error_message(String string) {
        Assert.assertEquals("Duplicate Item", errorMessage);
    }
}

