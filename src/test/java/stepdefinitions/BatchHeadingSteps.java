package stepdefinitions;

import com.lms.pages.BatchPage;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BatchHeadingSteps {
	
	BatchPage batchPage =  new BatchPage();
	
	@When("User is on Batch page")
	public void user_is_on_batch_page() {
	    // Write code here that turns the phrase above into concrete actions
		batchPage.validateBatchPage();
	}

	@Then("User should see a heading with text {string} on the page")
	public void user_should_see_a_heading_with_text_on_the_page(String expectedValue) {
	    // Write code here that turns the phrase above into concrete actions
		String actualValue = batchPage.validateHeadertext();
		if(!actualValue.equals(expectedValue)) {
			Assert.fail();
			
		}
		
		
	}


}
