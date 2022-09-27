package stepdefinitions;

import com.lms.pages.AssignmentPage;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewAssignmentSteps extends AssignmentPage{
	
	AssignmentPage assignpage=new AssignmentPage();
	
	

	@When("User clicks A New Assignment button")
	public void user_clicks_a_new_assignment_button() {
	    assignpage.click_newpgm();
	}

	@Then("User can see Assignment details form")
	public void user_can_see_assignment_details_form() {
	   assignpage.check_dialogbox_displayed();
	}

	@When("User clicks Save button without entering data")
	public void user_clicks_save_button_without_entering_data() {
		assignpage.click_savebtn();
	}

	@Then("User gets message {string}")
	public void user_gets_message(String expected) {
		if(expected.equals("Name is required."))
		   {
			   String actual=assignpage.get_name_errormsg();
			   System.out.println("Actual error msg:"+actual);
			   assertEquals(actual,expected);
		   }
		   if(expected.equals("Successful Program created"))
		   {
			   String actual=assignpage.get_successmsg();
			   System.out.println("Actual Success msg:"+actual);
			   assertEquals(actual,expected);
		   }
		}
	

	@When("User enters Assignment name")
	public void user_enters_assignment_name() {
	   assignpage.editassignname();
	}

	@Then("User can see Name entered")
	public void user_can_see_entered() {
	   assignpage.assignnamegetdisplayed();
	}

	@When("User enters Assignment description")
	public void user_enters_assignment_description() {
assignpage.editassigndesc();
	}
	
	@Then("User can see Description entered")
	public void user_can_see_updated_assignment_description() {
		 assignpage.assigndescgetdisplayed();
	}

	@When("User enters assignment grade")
	public void user_enters_assignment_grade() {
	   assignpage.editassigngrade();
	}
	
	@Then("User can see Grade entered")
	public void user_can_see_updated_assignment_grade() {
		 assignpage.assigngradegetdisplayed();
	}

	@When("User enters assignment due date")
	public void user_enters_assignment_due_date() {
	    assignpage.editcalenderdate();
	}

	@Then("User can see Assignment due date")
	public void user_can_see_assignment_due_date() {
	    assignpage.assigndategetdisplayed();
	}

	@When("User clicks Save button")
	public void user_clicks_save_button() {
	    assignpage.clickonsavebutton();
	}
	
	@Then("User can get {string} message")
	public void user_can_see_message(String string) {
   if (string.equals("Successful Assignment Updated"))
   {
	   assertEquals(assignpage.savemsggetdispalyed(),string );
   }
	
	}

	@When("User clicks Cancel button")
	public void user_clicks_cancel_button() {
		assignpage.clickoncancelbutton();
	}

	@Then("User can get assignment Details form disappears")
	public void user_can_see_assignment_details_form_disappears() {
		System.out.println(assignpage.assigncancelbuttondisabled());
	}


}
