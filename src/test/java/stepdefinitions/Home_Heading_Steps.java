package stepdefinitions;

import com.lms.pages.HomePage;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.Then;

public class Home_Heading_Steps extends HomePage {
	
	HomePage hm=new HomePage();
	
	@Then("User should see heading with text {string} on the Home page")
	public void user_should_see_heading_with_text_on_the_home_page(String string) {
		System.out.println("Expected Heading is "+string);
		String actualheading=hm.validate_heading();
		System.out.println("Actual Heading is "+actualheading);
		assertEquals(string,actualheading);
		
	}
}
