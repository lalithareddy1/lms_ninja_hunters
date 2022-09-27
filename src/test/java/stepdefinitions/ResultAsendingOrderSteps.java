package stepdefinitions;

import com.lms.pages.AssignmentPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ResultAsendingOrderSteps extends AssignmentPage{
	
	AssignmentPage assignpage=new AssignmentPage();
	
	

	@When("User clicks onthe Ascending arrow \\(Up ) near to the Assignment name")
	public void user_clicks_onthe_ascending_arrow_down_near_to_the_assignment_name() throws InterruptedException {
	    assignpage.click_AscArrow_inassignName();
	}

	@Then("User can see the results in Ascending order of Assignment name")
	public void user_can_see_the_results_in_ascending_order_of_assignment_name() {
	   assignpage.view_results_forassignName();
	}

	@When("User clicks onthe Ascending arrow \\(Up ) near to the Assignment Description")
	public void user_clicks_onthe_ascending_arrow_down_near_to_the_assignment_description() throws InterruptedException {
	 assignpage.click_AscArrow_inassignDesc();
	}

	@Then("User can see the results in Ascending order of Assignment Description")
	public void user_can_see_the_results_in_ascending_order_of_assignment_description() {
	  assignpage.view_results_forassignDesc();
	}


}
