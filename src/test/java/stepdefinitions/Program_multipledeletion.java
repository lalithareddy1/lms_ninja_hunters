package stepdefinitions;

import com.lms.pages.ProgramPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Program_multipledeletion extends ProgramPage {
	ProgramPage pp=new ProgramPage();
	
	@When("User selects more than one Program using checkbox")
	public void user_selects_more_than_one_program_using_checkbox() throws InterruptedException {
	    pp.select_multiplepgm();
	}

	@Then("multiple Program gets selected")
	public void multiple_program_gets_selected() {
		pp.check_multipgram_selected();
	}

	@When("User clicks on <Delete> button on top left corner")
	public void user_clicks_on_delete_button_on_top_left_corner() throws InterruptedException {
	   pp.click_deletebtn_attop();
	}

	

}
