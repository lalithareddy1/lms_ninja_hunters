package stepdefinitions;

import static org.junit.Assert.*;

import com.lms.pages.ProgramPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Program_Delete_Steps extends ProgramPage {
	ProgramPage pp=new ProgramPage();
	@When("User clicks on <Delete> button")
	public void user_clicks_on_delete_button() {
		pp.click_btndelete();
	}

	@Then("User lands on Confirm Deletion form.")
	public void user_lands_on_confirm_deletion_form() {
		pp.check_confirmdelteionbox_displayed();
	}

	@Given("User is on Confirm Deletion form")
	public void user_is_on_confirm_deletion_form() {
		pp.check_confirmdelteionbox_displayed();
	}

	@When("User clicks <Yes> button")
	public void user_clicks_yes_button() {
		pp.click_yesbtn_fordelete();
	}

	@Then("User can see {string} message")
	public void user_can_see_message(String expected) {
		if(expected.equals("Successful Program Deleted"))
			assertEquals("Successful Program Deleted",pp.check_program_deleted());	
	}
	
	@When("User clicks <No> button")
	public void user_clicks_no_button() throws InterruptedException {
		pp.click_No();

	}

	@Then("User can see Confirm Deletion form disappears")
	public void user_can_see_confirm_deletion_form_disappears() {
		assertEquals (true,pp.check_dialogbox_disappear());
		
	}
}
