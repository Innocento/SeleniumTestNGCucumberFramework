package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
    @Given("browser is open")
    public void user_is_on_login_page() {
        System.out.println("Test 1");
    }

    @And("user is on login page")
    public void user_enters_username_and_password() {
        System.out.println("Test 2");
    }

    @When("user enters username and password")
    public void clicks_on_login_button() {
        System.out.println("Test 3");
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("Test 4");
    }
}
