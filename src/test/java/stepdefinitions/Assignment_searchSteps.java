package stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.lms.pages.AssignmentPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Assignment_searchSteps extends AssignmentPage{
	
	
	AssignmentPage assignpage=new AssignmentPage();
	
	@Then("Text box used for search has text as {string}")
	public void text_box_used_for_search_has_text_as(String string) {
		System.out.println("Expected value:"+string);
		  String actualvalue=assignpage.Validatesearchtext();
		  System.out.println("Actual value:"+actualvalue);
		  assertEquals(actualvalue,string );
	}

	@Given("User is on  Manage Assignment page")
	public void user_is_on_manage_assignment_page() {
	    
	}
	@When("User clicks on search with <name phrase> into search box.")
	public void user_clicks_on_search_with_name_phrase_into_search_box() throws InterruptedException {
		assignpage.searchassignementname();
	}

	@Then("Entries for <name phrase> are shown.")
	public void entries_for_name_phrase_are_shown() throws InterruptedException {
		assignpage.check_assignment_byname();
	}

}
