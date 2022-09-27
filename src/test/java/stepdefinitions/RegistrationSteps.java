package stepdefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {
	
	@When("User fills the {string} using Alpha Numerics and or Symbols")
	public void user_fills_the_using_alpha_numerics_and_or_symbols(String string, DataTable dataTable) {
		List<List<String>> rows = dataTable.asLists(String.class);
		System.out.println(rows.get(0).get(0));
		System.out.println(rows.get(0).get(1));
	}

	@When("User fills the {string} Field using Alpha Numerics and or Symbols")
	public void user_fills_the_field_using_alpha_numerics_and_or_symbols(String string, DataTable dataTable) {
		List<List<String>> rows = dataTable.asLists(String.class);
		System.out.println(rows.get(0).get(0));
		System.out.println(rows.get(0).get(1));
	}

	@When("User selects the respective State Name from the DropBox")
	public void user_selects_the_respective_state_name_from_the_drop_box(DataTable dataTable) {
		List<List<String>> rows = dataTable.asLists(String.class);
		System.out.println(rows.get(0).get(0));
		System.out.println(rows.get(0).get(1));
	}

	@When("User fills the {int} digit zip code using Numbers only")
	public void user_fills_the_digit_zip_code_using_numbers_only(Integer int1, DataTable dataTable) {
		List<List<String>> rows = dataTable.asLists(String.class);
		System.out.println(rows.get(0).get(0));
		System.out.println(rows.get(0).get(1));
	}

	@When("User selects Date of Birth from the calender")
	public void user_selects_date_of_birth_from_the_calender(DataTable dataTable) {
		List<List<String>> rows = dataTable.asLists(String.class);
		System.out.println(rows.get(0).get(0));
		System.out.println(rows.get(0).get(1));
	}

	@When("User fills the valid unique UserName")
	public void user_fills_the_valid_unique_user_name(DataTable dataTable) {
		List<List<String>> rows = dataTable.asLists(String.class);
		System.out.println(rows.get(0).get(0));
		System.out.println(rows.get(0).get(1));
	}

	@When("User fills the valid {int} digit Mobile Number in Numerics")
	public void user_fills_the_valid_digit_mobile_number_in_numerics(Integer int1, DataTable dataTable) {
		List<List<String>> rows = dataTable.asLists(String.class);
		System.out.println(rows.get(0).get(0));
		System.out.println(rows.get(0).get(1));
	}

	@When("User fills the valid Email")
	public void user_fills_the_valid_email(DataTable dataTable) {
		List<List<String>> rows = dataTable.asLists(String.class);
		System.out.println(rows.get(0).get(0));
		System.out.println(rows.get(0).get(1));
	}

	@When("User fills the valid password with {int} upper case, {int} Numeric and {int} special character and {int} characters")
	public void user_fills_the_valid_password_with_upper_case_numeric_and_special_character_and_characters(Integer int1, Integer int2, Integer int3, Integer int4, DataTable dataTable) {
		List<List<String>> rows = dataTable.asLists(String.class);
		System.out.println(rows.get(0).get(0));
		System.out.println(rows.get(0).get(1));
	}

	@When("User enters submit button with all fields empty")
	public void user_enters_submit_button_with_all_fields_empty() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("User click Sign Up button with invalid {string}")
	public void user_click_sign_up_button_with_invalid(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("User click Sign Up button without selecting BirthDate")
	public void user_click_sign_up_button_without_selecting_birth_date() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("User click Sign Up button with existing userName")
	public void user_click_sign_up_button_with_existing_user_name() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("User enters all field value and click {string} button")
	public void user_enters_all_field_value_and_click_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	

}
