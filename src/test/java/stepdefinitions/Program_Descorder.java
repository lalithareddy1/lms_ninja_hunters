package stepdefinitions;

import com.lms.pages.ProgramPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Program_Descorder extends ProgramPage {
	ProgramPage pp=new ProgramPage();
	
	@When("User clicks on the descending arrow \\(down ) near to the Program name")
	public void user_clicks_on_the_descending_arrow_down_near_to_the_program_name() throws InterruptedException {
		 pp.click_descArrow_inpgmName();
	}

	@Then("User can see the results in descending order of Program name")
	public void user_can_see_the_results_in_descending_order_of_program_name() {
		pp.view_descresults_forpgmName();
	}

	@When("User clicks on the descending arrow \\(down ) near to the Program Description")
	public void user_clicks_on_the_descending_arrow_down_near_to_the_program_description() throws InterruptedException {
		pp.click_descArrow_inpgmDesc();
	}

	@Then("User can see the results in descending order of Program Description")
	public void user_can_see_the_results_in_descending_order_of_program_description() {
		 pp.view_descresults_forpgmDesc();
	}

	@When("User clicks on the descending arrow \\(down ) near to the Program status")
	public void user_clicks_on_the_descending_arrow_down_near_to_the_program_status() throws InterruptedException {
		pp.click_descArrow_inpgmStatus();
	}

	@Then("User can see the results in descending order of Program status")
	public void user_can_see_the_results_in_descending_order_of_program_status() {
		 pp.view_descresults_forpgmStatus();
	}

}
