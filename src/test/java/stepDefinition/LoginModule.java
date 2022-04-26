package stepDefinition;

import commonMethods.BaseMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginModule {
	
	BaseMethods base;
	
	@Given("Open Browser")
	public void open_browser() {
		base = new BaseMethods();
        base.launchBrowser();
	}
	
	@When("Launch Application")
	public void launch_application() {
	    base.launchERP();
	}
	
	@When("Login with valid user credentials")
	public void login_with_valid_user_credentials() {
        base.loginERP();
	}
	
	@Then("validate the ERP HomePage")
	public void validate_the_erp_home_page() {

	}
	
	@When("Login with valid {string} and valid {string}")
	public void login_with_valid_and_valid(String username, String password) {
	    base.loginERP1(username, password);
	}
	
	@Then("Click on Logout button")
	public void click_on_logout_button() {
	    base.logoutERP();
	}
	
	@Then("Close the Browser")
	public void close_the_browser() {
		base.driver.close();
	}


}
