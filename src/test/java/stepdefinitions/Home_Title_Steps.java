package stepdefinitions;



import com.lms.pages.HomePage;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Home_Title_Steps extends HomePage{
	

	HomePage hm=new HomePage();
	
	@Given("User opens browser")
	public void user_opens_browser() {
		
	}

	@When("User landed on the Home page after logging into the LMS website")
	public void user_landed_on_the_home_page_after_logging_into_the_lms_website() {
		
		
	}

	@Then("verify that title of the page is {string}")
	public void verify_that_title_of_the_page_is(String string) {
	   
        String actualtitle=hm.validate_title();
        System.out.println("Actual Title:"+actualtitle);
        assertEquals(string, actualtitle);
        
        
        
     
	}
}
