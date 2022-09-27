package stepdefinitions;

import com.lms.pages.ProgramPage;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Program_Heading_Steps extends ProgramPage {
	ProgramPage pp=new ProgramPage();

	@Given("User is logged into LMS website")
	public void user_is_logged_into_lms_website() {

	}

	@When("User is on Program page")
	public void user_is_on_program_page() {
     pp.click_on_programpage();
	}

	@Then("User should see a heading with text {string} on the Program page")
	public void user_should_see_a_heading_with_text_on_the_program_page(String expectedheading) {
		System.out.println("Expected Heading :"+expectedheading);
		String actualheading= pp.validate_heading();
		System.out.println("Actual Heading :"+actualheading);
		assertEquals(actualheading,expectedheading);
	}


}
