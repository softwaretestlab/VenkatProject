package StepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksLearning01 {
    @Before
    public void startTest(){
        System.out.println("Test Started");
    }
    @Given("user opens browser")
    public void user_opens_browser() {
        System.out.println("Browser opened");
    }
    @When("user on homepage")
    public void user_on_homepage() {
        System.out.println("I am on homepage");
    }
    @Then("user clicks on account link")
    public void user_clicks_on_account_link() {
        System.out.println("I am on my account screen");
    }

    @After
    public void EndTest(){
        System.out.println("Test Ended");
    }
}
