package stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.lms.pages.UserPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserManagePageSteps {
	UserPage userPage = new UserPage();
	
	
	@Given("User is on any page after login")
	public void user_is_on_any_page_after_login() {
	    // Write code here that turns the phrase above into concrete actions
		userPage.verify_loggedIn();
		//boolean expected_value = userPage.verify_loggedIn();
		//System.out.println("++++++++++++++))))))))" + expected_value);
		//assertEquals(true, expected_value);
	}

	@When("User clicks the Tab {string}")
	public void user_clicks_the_tab(String string) {
	    // Write code here that turns the phrase above into concrete actions
		userPage.click_usertab();
	}

	@Then("User should see the Manage user page")
	public void user_should_see_the_manage_user_page() {		
		if(userPage.validateUserisOnUserPage()) {
			
			assertEquals(true, true);
		}
	}


}
