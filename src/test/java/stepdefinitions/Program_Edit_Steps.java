package stepdefinitions;

import com.lms.pages.ProgramPage;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Program_Edit_Steps extends ProgramPage {
	ProgramPage pp=new ProgramPage();
	@When("User selects Program using checkbox")
	public void user_selects_program_using_checkbox() throws InterruptedException {
		pp.selectpgm();
	}

	@Then("Program gets selected")
	public void program_gets_selected() {

		System.out.println("check box selected: "+pp.check_program_selected());
		assertEquals(true,pp.check_program_selected());
	}

	@When("User clicks on <Edit> button in ProgramPage")
	public void user_clicks_on_edit_button_in_programpage() {
		pp.click_editbtn();
	}


	@Then("User is on Program Details form.")
	public void user_is_on_program_details_form() {
		assertEquals(true, pp.check_dialogbox_displayed());
	}




	@When("User edits Name and selects the Save button in ProgramPage")
	public void user_edits_name_and_selects_the_save_button_in_programpage() throws InterruptedException {
		pp.editname();
	}

	@Then("User can see updated Name in ProgramPage")
	public void user_can_see_updated_name_in_programpage() {
		assertEquals(true, pp.check_updatedname());
	}

	@When("User edits Description and selects the Save button in ProgramPage")
	public void user_edits_description_and_selects_the_save_button_in_programpage() throws InterruptedException {
		pp.editdescription();
	}

	@Then("User can see updated Description in ProgramPage")
	public void user_can_see_updated_description_in_programpage() {
		assertEquals(true, pp.check_updateddescription());
	}

	@When("User changes status and selects the Save button in ProgramPage")
	public void user_changes_status_and_selects_the_save_button_in_programpage() throws InterruptedException {
		pp.change_status();
	}

	@Then("User can see updated status in ProgramPage")
	public void user_can_see_updated_status_in_programpage() {
		assertEquals(true,pp.check_updatedstatus());
	}

	@When("User clicks <Cancel> button in ProgramPage")
	public void user_clicks_cancel_button_in_programpage() {
	}



	@When("User clicks <Save> button in ProgramPage")
	public void user_clicks_save_button_in_programpage() {
		pp.click_savebtn();
	}

	@Then("User can see {string} message in ProgramPage")
	public void user_can_see_message_in_programpage(String expected) {
		if(expected.equals("Successful Program Updated"))
		assertEquals("Successful Program Updated", pp.checkmsg());
	}


}
