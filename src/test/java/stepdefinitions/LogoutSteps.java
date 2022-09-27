package stepdefinitions;

import com.lms.pages.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {
	
	LogoutPage logout = new LogoutPage();
	
	@Given("User has completed all the workflows")
	public void user_has_completed_all_the_workflows() {
	}

	@When("User clicks on logout")
	public void user_clicks_on_logout() {
		logout.click_logout();
	}

	@Then("LMS login page should be landed")
	public void lms_login_page_should_be_landed() {
		logout.validate_after_logout();
		logout.close_browser();
	}


}
