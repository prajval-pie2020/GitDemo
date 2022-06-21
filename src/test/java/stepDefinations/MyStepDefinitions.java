package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import resources.base;

public class MyStepDefinitions extends base{
	
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver =initializeDriver();
		
	   
	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("^Click on Login link in home page to land on Secure sign in Page$")
	public void click_on_Login_link_in_home_page_to_land_on_Secure_sign_in_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^User enters prajvalKhadatkar(\\d+)@gmail\\.com and Prajval@(\\d+) and logs in$")
	public void user_enters_prajvalKhadatkar_gmail_com_and_Prajval_and_logs_in(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^Verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Then("^close browsers$")
	public void close_browsers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
}