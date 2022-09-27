package stepdefinitions;

import com.lms.pages.AssignmentPage;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignmentDeleteSteps extends AssignmentPage{
	
	AssignmentPage assignpage=new AssignmentPage();
	
	
	@When("User clicks on a <Delete> button after selecting an assignment")
	public void user_clicks_on_a_delete_button() {
		assignpage.click_btndelete();
	}

	@Then("User lands on a Confirm Deletion form.")
	public void user_lands_on_a_confirm_deletion_form() {
		assignpage.check_confirmdelteionbox_displayed();
	}

	@Given("User is on a Confirm Deletion form")
	public void user_is_on_a_confirm_deletion_form() {
		assignpage.check_confirmdelteionbox_displayed();
	}

	@When("User clicks on <Yes> button")
	public void user_clicks_on_yes_button() {
		assignpage.click_yesbtn_fordelete();
	}

	@Then("User can saw the {string} message")
	public void user_can_see_message(String expected) {
		if(expected.equals("Successful Program Deleted"))
			assertEquals("Successful Program Deleted",assignpage.check_program_deleted());	
	}
	
	@When("User clicks on <No> button")
	public void user_clicks_on_no_button() throws InterruptedException {
		assignpage.click_No();

	}

	@Then("User can see a Confirm Deletion form disappears")
	public void user_can_see_a_confirm_deletion_form_disappears() {
		assertEquals (true,assignpage.check_dialogbox_disappear());
		
	}
	
	@Given("User is on Assignment page")
	public void user_is_on_assignment_page() {
	}
}


