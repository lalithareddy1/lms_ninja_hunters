package stepdefinitions;


import static org.junit.Assert.assertEquals;

import com.lms.pages.LoginPage;
import com.lms.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends TestBase{
	
	LoginPage loginpage = new LoginPage();
	
	@Given("User is on the browser")
	public void user_is_on_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    TestBase.initialization();
	}

	@When("User opens the LMS website")
	public void user_opens_the_lms_website() {
	    // Write code here that turns the phrase above into concrete actions
		open_url();
	}

	@Then("User should see the Login Page")
	public void user_should_see_the_login_page() {
		String login_url = loginpage.validateLoginPageUrl();
		System.out.println("Login Url" + login_url);
		assertEquals(prop.getProperty("url"), login_url);
		
	}

	@Given("User is on the Login Page")
	public void user_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("User clicks the Login Button after entering invalid password {string}")
	public void user_clicks_the_login_button_after_entering_invalid_password(String invalid_password) {
		System.out.println("Password is " + invalid_password);
		loginpage.submit_invalid_password(invalid_password);
	}

	@Then("User should receive the message {string}")
	public void user_should_receive_the_message_invalid_username_and_password_please_try_again(String expected_msg) {
		String actual_msg = loginpage.error_message();
		System.out.println("Actual message is : " + actual_msg);
		assertEquals(expected_msg, actual_msg);
		driver.navigate().refresh();
	}

	@When("User clicks the Login Button after entering invalid username {string}")
	public void user_clicks_the_login_button_after_entering_invalid_username(String invalid_username) {
		System.out.println("Invalid username :" + invalid_username);
		loginpage.submit_invalid_username(invalid_username);
		
	}

	@When("User clicks the Login Button after entering valid {string} and {string}")
	public void user_clicks_the_login_button_after_entering_valid_username_and_password(String valid_username, String valid_password) {
		System.out.println("Valid Username" + valid_username);
		System.out.println("Valid Username" + valid_password);
		loginpage.submit_valid_credentials(valid_username, valid_password);

	}
	
	

	@Then("User should see the LMS HomePage")
	public void user_should_see_the_lms_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	}

}
