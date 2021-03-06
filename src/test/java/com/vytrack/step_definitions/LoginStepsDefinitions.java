package com.vytrack.step_definitions;

import io.cucumber.java.en.*;


public class LoginStepsDefinitions {
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("I'm on the login page ");
    }

    @Then("user logs in as store manager")
    public void user_logs_in_as_store_manager() {
        System.out.println("Login as store manager");
    }

    @Then("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {
        System.out.println("verifying page subtitle "+ string);
    }
    @Then("user logs in as driver")
    public void user_logs_in_as_driver() {
        System.out.println("login as driver");
    }

    @Given("user logs in as sales manager")
    public void user_logs_in_as_sales_manager() {
        System.out.println("login as sales manager");
    }


}
