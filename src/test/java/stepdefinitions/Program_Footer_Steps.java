package stepdefinitions;

import com.lms.pages.ProgramPage;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.Then;

public class Program_Footer_Steps extends ProgramPage {
	ProgramPage pp=new ProgramPage();
	int recordsperpage,totalrecords;
	String actualstring;
	
	
	@Then("User should see the text as {string} below the table in ProgramPage.")
	public void user_should_see_the_text_as_below_the_table_in_program_page(String expectedstring) {
		//int start_rowno=pp.getstartrowno();
		//int end_rowno=pp.getendrowno();
		//String totalrow=pp.gettotalrows();
		//expectedstring="Showing "+start_rowno+" to "+end_rowno+" of "+totalrow+" entries";
		System.out.println("Actual Footer text: "+pp.validate_footertext());
	}

	@Then("User should see the footer as {string} in ProgramPage.")
	public void user_should_see_the_footer_as_in_program_page(String expected) {
		expected="In total there are "+pp.gettotalrows()+" programs.";
		System.out.println("Expected Footer: "+expected);
		String actual=pp.getfooterstring();
		System.out.println("Actual Footer: "+actual);

		assertEquals(expected,actual);
	}
	
}
