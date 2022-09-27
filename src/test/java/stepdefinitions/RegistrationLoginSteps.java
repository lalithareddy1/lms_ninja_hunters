package stepdefinitions;


import com.lms.pages.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationLoginSteps {
	
	RegistrationPage regr_page = new RegistrationPage();
	
	@Then("User sees a button with text {string} on the form")
	public void user_sees_a_button_with_text_on_the_form(String string) {
		System.out.println("User sees a button with text " + string +"on the form");
 
	}

	@Given("User is on Registration page")
	public void user_is_on_registration_page() {
		System.out.println("User is on registation page");
	}

	@When("User selects the Log in Button")
	public void user_selects_the_log_in_button() {
		regr_page.click_login();
	}

	@Then("User lands on Log in page")
	public void user_lands_on_log_in_page() {
		System.out.println("User is on Login Page");
	}

}
