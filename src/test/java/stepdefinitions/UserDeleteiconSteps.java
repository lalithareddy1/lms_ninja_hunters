package stepdefinitions;

import com.lms.pages.UserPage;
import org.junit.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserDeleteiconSteps {
	
	UserPage userPage = new UserPage();
	
	
	@Then("User should see the delete icon at the top left corner of the user table")
	public void user_should_see_the_delete_icon_at_the_top_left_corner_of_the_user_table() {
	    // Write code here that turns the phrase above into concrete actions
		boolean actualValue = userPage.validate_headerDeleteIcon();
		if(!actualValue) {
			
			Assert.fail();
		}
	}

	@When("no rows is checked")
	public void no_rows_is_checked() {
	    // Write code here that turns the phrase above into concrete actions
		String isrowsSelected = userPage.validate_all_rows_Unselected();
		if(isrowsSelected.equals("true")) {
			Assert.fail();
		}
	}

	@Then("Delete icon on the top left corner of the user table disabled")
	public void delete_icon_on_the_top_left_corner_of_the_user_table_disabled() {
	    // Write code here that turns the phrase above into concrete actions
		boolean actualValue = userPage.validate_headerDeleteIconEnabled();

		if(actualValue) {
			Assert.fail();
		}
		
	}
	
	
	@When("User checks rows in the user table")
	public void user_checks_rows_in_the_user_table() {
	    // Write code here that turns the phrase above into concrete actions
		userPage.selectAllrows();
	}

	@Then("Delete icon on the top left corner of the user table enabled")
	public void delete_icon_on_the_top_left_corner_of_the_user_table_enabled() {
	    // Write code here that turns the phrase above into concrete actions
		boolean actualValue = userPage.validate_headerDeleteIconEnabled();
		if(!actualValue) {
			Assert.fail();

		}

	}
	
	@When("User clicks the delete icon at the top left corner of the user table")
	public void user_clicks_the_delete_icon_at_the_top_left_corner_of_the_user_table() {
		
		userPage.click_headerdeleteIcon();
		
	}

	@Then("confirm dialogue box should be displayed with text {string}")
	public void confirm_dialogue_box_should_be_displayed_with_text(String string) {
		
		userPage.deleteTextDialogueBox();
	    
	}

	@Then("button with text {string}")
	public void button_with_text(String expectedValue) {
		if(expectedValue.equals("Yes")) {
			String actualValue = userPage.verifyYesButton();
			if(!actualValue.equals(expectedValue)) {
				Assert.fail();
			}
		}
		
		if(expectedValue.equals("No")) {
			String actualValue = userPage.verifyNoButton();
			if(!actualValue.equals(expectedValue)) {
				Assert.fail();
			}
		}
		
	    
	}


}
