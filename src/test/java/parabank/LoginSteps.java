package parabank;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    private LoginPage loginPage;

    public LoginSteps() {
        this.loginPage = new LoginPage();
    }


    @Given("I am in the login page of the Para Bank application")
    public void i_am_in_the_login_page_of_the_para_bank_application() {
        loginPage.goToHomePage();
    }

    @When("I enter valid {string} and {string}")
    public void i_enter_valid_credentials(String username, String password) {
        loginPage.setCredentials(username, password);
    }

    @Then("I should be taken to the Overview page")
    public void i_should_be_taken_to_the_overview_page() {
        loginPage.isUserLogged();
    }
}