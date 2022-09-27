package stepdefinitions;

import org.junit.Assert;

import com.lms.pages.UserPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserAddNewUserSteps {
	
	UserPage userPage = new UserPage();
	
	@When("User is on the Manage user page after clicking Uset tab")
	public void user_is_on_the_manage_user_page_after_clicking_uset_tab() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("User should see a button with the text + {string}")
	public void user_should_see_a_button_with_the_text(String expectedValue) {
		String actualValue = userPage.validate_addNewUser();
		if(!actualValue.equals(expectedValue)) {
			Assert.fail();
		}
		
	}

	@Given("User is on Manage User page")
	public void user_is_on_manage_user_page() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("User clicks Add New User button")
	public void user_clicks_add_new_user_button() {
		userPage.click_AddNewUser();
	}

	@Then("User should see the {string} dialog box")
	public void user_should_see_the_dialog_box(String expectedValue) {
		String actualtext = userPage.validateTextAfterAddNewUser();
		if(!actualtext.equals(expectedValue)) {
			Assert.fail();
			
		}
		
		userPage.close_user_window();
		
	}

}
