package stepdefinitions;

import com.lms.pages.ProgramPage;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Program_Add_Steps extends ProgramPage {
	ProgramPage pp=new ProgramPage();
	
	@When("User clicks <A New Program> button")
	public void user_clicks_a_new_program_button() {
	    pp.click_newpgm();
	}

	@Then("User is on Program Details form")
	public void user_is_on_program_details_form() {
		assertEquals(true, pp.check_dialogbox_displayed());
	}
	@When("User clicks <Save> button without entering data in Programdetailsform")
	public void user_clicks_save_button_without_entering_data_in_programdetailsform() {
	   pp.click_savebtn();
	}

	@Then("User gets message {string} in PgmPage")
	public void user_gets_message_in_pgm_page(String expected) {
	   if(expected.equals("Name is required."))
	   {
		   String actual=pp.get_name_errormsg();
		   System.out.println("Actual error msg:"+actual);
		   assertEquals(actual,expected);
	   }
	   if(expected.equals("Successful Program created"))
	   {
		   String actual=pp.get_successmsg();
		   System.out.println("Actual Success msg:"+actual);
		   assertEquals(actual,expected);
	   }
	}

	@When("User enters <Name> in text box in Programdetailsform")
	public void user_enters_name_in_text_box_in_programdetailsform() throws InterruptedException {
	   pp.entername_inform();
	}

	@Then("User can see name entered in PgmPage")
	public void user_can_see_name_entered_in_pgm_page() {
		 		   pp.get_name_inform();
		  
	}
	@Then("User can see Description entered in PgmPage")
	public void user_can_see_Description_entered_in_pgm_page() {
		 
		    pp.get_desc_inform();
		  
	}

	@When("User enters <Description> in text box in Programdetailsform")
	public void user_enters_description_in_text_box_in_programdetailsform() throws InterruptedException {
	    pp.enterdescription_inform();
	}

	@When("User selects <Status> using radiobutton in Programdetailsform")
	public void user_selects_status_using_radiobutton_in_programdetailsform() throws InterruptedException {
	   pp.selectstatus_inform();
	  
	}

	@Then("User can see status selected in PgmPage")
	public void user_can_see_status_selected_in_pgm_page() {
		 assertEquals(true,pp.getselectedstatus());
	}

	@When("User clicks <Save> button in Programdetailsform")
	public void user_clicks_save_button_in_programdetailsform() {
		pp.click_savebtn();
	}

	@When("User clicks <Cancel> button in Programdetailsform")
	public void user_clicks_cancel_button_in_programdetailsform() {
		pp.click_newpgm();
	    pp.click_cancelbtn();
	}

	@Then("User can see Program Details form disappears")
	public void user_can_see_program_details_form_disappears() {
		assertEquals(false,pp.check_dialogbox_displayed());
	}
}
