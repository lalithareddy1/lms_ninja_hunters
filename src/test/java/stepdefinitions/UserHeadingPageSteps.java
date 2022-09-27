package stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.lms.pages.UserPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserHeadingPageSteps {
	
	UserPage userPage = new UserPage();
	
	@When("User is on Manage user page after clicking User Tab")
	public void user_is_on_manage_user_page_after_clicking_user_tab() {
		if(userPage.validateUserisOnUserPage()) {			
			assertEquals(true, true);
		}
	   
	}

	@Then("User should see the page heading as {string}")
	public void user_should_see_the_page_heading_as(String expectedValue) {
		String actualValue = userPage.validate_userHeading();
		assertEquals(actualValue, expectedValue);
	}

	

}
