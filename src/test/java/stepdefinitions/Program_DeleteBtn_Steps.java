package stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.lms.pages.ProgramPage;

import io.cucumber.java.en.Then;

public class Program_DeleteBtn_Steps extends ProgramPage{
	ProgramPage pp=new ProgramPage();
	String actual="";
	String expected="Disabled";
	@Then("User should see the Delete button on the top left hand side as Disabled in ProgramPage")
	public void user_should_see_the_delete_button_on_the_top_left_hand_side_as_disabled_in_programpage() {
		
		
	   if(pp.check_deletebutton_state().equals("true"))
	   {
		   actual="Disabled";
		   System.out.println("Delete button is diasbled");
	   }
	   assertEquals(expected,actual);
	}

}
