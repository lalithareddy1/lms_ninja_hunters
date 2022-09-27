package stepdefinitions;

import com.lms.pages.ProgramPage;
import static org.junit.Assert.*;

import org.junit.Assert;

import io.cucumber.java.en.Then;

public class Program_NoofRecords_Steps extends ProgramPage {

	ProgramPage pp = new ProgramPage();

	@Then("Verify that number of records  displayed on the programpage")
	public void verify_that_number_of_records_displayed_on_the_programpage() {
		if (pp.check_displayofrecords())
			System.out.println("Records are displayed");
		else {
			System.out.println("Records are not displayed");
			Assert.fail();
		}

	}
}
