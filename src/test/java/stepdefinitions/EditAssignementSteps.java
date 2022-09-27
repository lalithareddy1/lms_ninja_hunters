package stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.lms.pages.AssignmentPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditAssignementSteps extends AssignmentPage {
	
	AssignmentPage assignpage=new AssignmentPage();
	
	
	@Given("User is on the Assignment page")
	public void user_is_on_the_assignment_page() {
	    
	}

	@When("User selects Assignment using checkbox on assignement page")
	public void user_selects_assignment_using_checkbox_on_assignement_page() throws InterruptedException {
		 assignpage.editassignment();
	}

	@Then("Assignment gets selected on assignement page")
	public void assignment_gets_selected_on_assignement_page() {
		System.out.println(assignpage.selectedbox());
	}

	@When("User clicks on <Edit> button on assignement page")
	public void user_clicks_on_edit_button_on_assignement_page() {
	   assignpage.clickoneditbutton();
	}

	@Then("User lands on Assignment Details form of assignement page")
	public void user_lands_on_assignment_details_form_of_assignement_page() {
	// System.out.println("Expected value:"+string);
		System.out.println (assignpage.assigndescriptionbox());
	// System.out.println("Actual value:"+actualvalue);
	//  assertEquals(actualvalue,string );
	}

	@Given("User is on Assignment Details form")
	public void user_is_on_assignment_details_form() {
	   
	}

	@When("User edits assignment Name")
	public void user_edits_assignment_name() {
		assignpage.editassignname();
	}

	@Then("User can see updated assignment Name")
	public void user_can_see_updated_assignment_name() {
		assignpage.assignnamegetdisplayed();
	}

	@When("User edits Assignment Description")
	public void user_edits_assignment_description() {
	    assignpage.editassigndesc();
	}

	@Then("User can see updated Assignment Description")
	public void user_can_see_updated_assignment_description() {
		 assignpage.assigndescgetdisplayed();
	}
	
	@When("User edits  Assignment Grade")
	public void user_edits_assignment_grade() {
	   assignpage.editassigngrade();
	}

	@Then("User can see updated Assignment Grade")
	public void user_can_see_updated_assignment_grade() {
		assignpage.assigngradegetdisplayed();
	}

	@When("User edits Assignment Due Date")
	public void user_edits_assignment_due_date() {
	    assignpage.editcalenderdate();
	}

	@Then("User can see updated Assignment Due Date")
	public void user_can_see_updated_assignment_due_date() {
		assignpage.assigndategetdisplayed();
	}

	@When("User clicks <Cancel> button on form")
	public void user_clicks_cancel_button_on_form() {
		assignpage.clickoncancelbutton();
	}

	@Then("User can see Assignment Details form disappears")
	public void user_can_see_assignment_details_form_disappears() {
		System.out.println(assignpage.assigncancelbuttondisabled());
	}

	@When("User clicks <Save> button on form")
	public void user_clicks_save_button_on_form() {
	 assignpage.clickonsavebutton();
	}

	@Then("User can see a {string} message")
	public void user_can_see_a_message(String string) {
   if (string.equals("Successful Assignment Updated"))
   {
	   assertEquals(assignpage.savemsggetdispalyed(),string );
   }
	
	}

}
