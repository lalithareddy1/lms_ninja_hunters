package stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.lms.pages.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationHeadingSteps extends RegistrationPage{
	
	RegistrationPage regr_page = new RegistrationPage();
	
	@Given("User is on LMS website")
	public void user_is_on_lms_website() {
		System.out.println("User is on" + prop.getProperty("url"));
		assertTrue(true);
	}

	@When("User lands on Registration page")
	public void user_lands_on_registration_page() {
		System.out.println("user is on registation page" + prop.getProperty("regr_url"));
		regr_page.registration_click();

	}

	@Then("User sees the registration heading on the form as {string}")
	public void user_sees_the_registration_heading_on_the_form_as(String expected_value) {
		String actual_value = regr_page.validate_reg_heading();
		assertEquals(expected_value, actual_value);
	}

}
