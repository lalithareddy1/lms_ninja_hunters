package stepdefinitions;


import com.lms.pages.AssignmentPage;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AssignementfooterSteps extends AssignmentPage{
	
	AssignmentPage assignpage=new AssignmentPage();
	
	

	@Then("User should see the text as {string} below the table on Assignment Page")
	public void below_the_table( String string) {
		System.out.println("Expected value:"+string);
		String actualvalue= assignpage.textvalidation();
		  System.out.println("Actual value:"+actualvalue);
		  assertEquals(actualvalue,string );
	}

	@Then("User should see the footer as {string} on Assignment Page")
	public void user_should_see_the_footer_as(String string) {
		System.out.println("Expected value:"+string);
		System.out.println("validating assignement page footer text");
		String actualvalue= assignpage.footervalidation();
		 System.out.println("Actual value:"+actualvalue);
		  assertEquals(actualvalue,string );
	}

	
}
