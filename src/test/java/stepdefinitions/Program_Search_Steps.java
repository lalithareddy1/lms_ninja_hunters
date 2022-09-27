package stepdefinitions;

import com.lms.pages.ProgramPage;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Program_Search_Steps extends ProgramPage {
	ProgramPage pp=new ProgramPage();
	@Then("Text box used for search has text as {string} in ProgramPage")
	public void text_box_used_for_search_has_text_as_in_program_page(String expected) {
				String actual=pp.validate_searchbox();
				System.out.println("Expected text in the search box: "+expected);
				System.out.println("Actual text in the search box: "+actual);
				assertEquals(actual,expected);
	}

	@When("User enters <name phrase> into search box from ProgramPage.")
	public void user_enters_name_phrase_into_search_box_from_program_page() throws InterruptedException {
	   pp.enter_namephrase();
	}

	@Then("Entries for <name phrase> are shown in ProgramPage.")
	public void entries_for_name_phrase_are_shown_in_program_page() {
	    pp.check_records_byname();
	}

	@When("User enters <description phrase> into search box from ProgramPage.")
	public void user_enters_description_phrase_into_search_box_from_program_page() throws InterruptedException {
	    pp.enter_descriptionphrase();
	}

	@Then("Entries for <description phrase> are shown in ProgramPage.")
	public void entries_for_description_phrase_are_shown_in_program_page() {
		pp.check_records_bydescription();
	}

	@When("User enters <status phrase> into search box in ProgramPage.")
	public void user_enters_status_phrase_into_search_box_in_program_page() throws InterruptedException {
		 pp.enter_statusphrase();
	}

	@Then("Entries for <status phrase> are shown in ProgramPage.")
	public void entries_for_status_phrase_are_shown_in_program_page() {
		pp.check_records_bystatus();
	}
	

}
