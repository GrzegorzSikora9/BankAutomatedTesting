package stepDefinitions.Verify_the_Login_Section;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class steps extends DriverFactory {

    @Given("^User navigate to URL$")
    public void user_navigate_to_URL() throws Throwable {
        System.out.println("1234");
    }

    @When("^User input valid UserId$")
    public void user_input_valid_UserId() throws Throwable {

    }

    @When("^User write valid password$")
    public void user_write_valid_password() throws Throwable {

    }

    @When("^User click on Login button$")
    public void user_click_on_Login_button() throws Throwable {

    }

    @Then("^User should be successfully logged in$")
    public void user_should_be_successfully_logged_in() throws Throwable {

    }




}
