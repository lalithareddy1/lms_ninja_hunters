package stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import com.lms.pages.UserPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserPaginationSteps {
	
	UserPage userPage = new UserPage();

	@Then("user should see the pagination controls below the data table")
	public void user_should_see_the_pagination_controls_below_the_data_table() {
	    boolean actualValue = userPage.pagination_present();
	    assertEquals(actualValue, true);
	}

	@Given("User is on Manage user page")
	public void user_is_on_manage_user_page() {
	   
	}

	@When("Manage user table has less than or equals to {int} rows")
	public void manage_user_table_has_less_than_or_equals_to_rows(Integer int1) {
	   int totalRows = userPage.validateNumberOfrows();
	   if(totalRows > int1) {
		   Assert.fail();
		   
	   }
	}

	@Then("Pagination control should be disabled")
	public void pagination_control_should_be_disabled() {
	   boolean actualValue = userPage.pagination_isDisabled();
	    assertEquals(actualValue, true);

	}

}
