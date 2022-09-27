package stepdefinitions;

import com.lms.pages.AssignmentPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class Assignment_headingSteps extends AssignmentPage  {
	
	AssignmentPage assignpage=new AssignmentPage();
	@Given("User is logged on to LMS website")
	public void user_is_logged_on_to_lms_website() {
	   
	}
	

	@When("User is on Manage Assignment page")
	public void user_is_on_manage_assignment_page() throws InterruptedException {
		assignpage.clickonassignment();
	   
	}
	
	@Then("User should see a heading with text {string} on the Assignment page")
	public void user_should_see_a_heading_with_text_on_the_assignment_page(String string) {
		System.out.println("Expected value:"+string);
		  String actualvalue=assignpage.checkheader();
		  System.out.println("Actual value:"+actualvalue);
		  assertEquals(actualvalue,string );
	}


}
