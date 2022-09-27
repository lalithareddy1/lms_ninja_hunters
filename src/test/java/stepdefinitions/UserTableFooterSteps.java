package stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.lms.pages.UserPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserTableFooterSteps {
	
	UserPage userPage = new UserPage();
	
	@Given("User is logged on to the LMS website")
	public void user_is_logged_on_to_the_lms_website() {
	   
	}

	@When("User lands on Manage User page")
	public void user_lands_on_manage_user_page() {
	   
	}

	@Then("User should see the table footer as {string}")
	public void user_should_see_the_table_footer_as(String expectedValue) {		
		String actualValue = userPage.validate_user_footer();
		actualValue = actualValue.trim();
		assertEquals(actualValue, expectedValue);
	 
	}

}
