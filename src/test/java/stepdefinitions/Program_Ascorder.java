package stepdefinitions;

import com.lms.pages.ProgramPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Program_Ascorder extends ProgramPage {
	ProgramPage pp=new ProgramPage();
	
	@When("User clicks on the Ascending arrow \\(down ) near to the Program name")
	public void user_clicks_onthe_ascending_arrow_down_near_to_the_program_name() throws InterruptedException {
	  pp.click_AscArrow_inpgmName();
	}

	@Then("User can see the results in Ascending order of Program name")
	public void user_can_see_the_results_in_ascending_order_of_program_name() {
	   pp.view_results_forpgmName();
	}

	@When("User clicks on the Ascending arrow \\(down ) near to the Program Description")
	public void user_clicks_onthe_ascending_arrow_down_near_to_the_program_description() throws InterruptedException {
		pp.click_AscArrow_inpgmDesc();
	}

	@Then("User can see the results in Ascending order of Program Description")
	public void user_can_see_the_results_in_ascending_order_of_program_description() {
		   pp.view_results_forpgmDesc();

	}

	@When("User clicks on the Ascending arrow \\(down ) near to the Program status")
	public void user_clicks_onthe_ascending_arrow_down_near_to_the_program_status() throws InterruptedException {
		pp.click_AscArrow_inpgmStatus();
	}

	@Then("User can see the results in Ascending order of Program status")
	public void user_can_see_the_results_in_ascending_order_of_program_status() {
		   pp.view_results_forpgmStatus();

	}

}
