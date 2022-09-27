package stepdefinitions;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Assert;

import com.lms.pages.UserPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserTableHeaderSteps {
	
	UserPage userPage = new UserPage();
	
	@When("User is on the Manage user page after clicking User Tab")
	public void user_is_on_the_manage_user_page_after_clicking_user_tab() {
	}

	@Then("User should see the table header as Empty checkbox-icon and all the fields with sorticon, edit and delete as column name")
	public void user_should_see_the_table_header_as_empty_checkbox_icon_and_all_the_fields_with_sorticon_edit_and_delete_as_column_name() {
		if(userPage.validateHeaderCheckBoxColumn()) {
			Assert.fail();
		}
		
		if(!userPage.validateIDcolumn()) {
			Assert.fail();

		}
		
		if(!userPage.validateNamecolumn()) {
			Assert.fail();

		}
		if(!userPage.validateEmailcolumn()) {
			Assert.fail();

		}
		
		if(!userPage.validateNumbercolumn()) {
			Assert.fail();

		}
		
		if(!userPage.validateBatchcolumn()) {
			Assert.fail();

		}
		
		if(!userPage.validateSkillcolumn()) {
			Assert.fail();

		}
		
		if(!userPage.validateEditDeletecolumn()) {
			Assert.fail();

		}
	}

	@Given("User table is displayed in manage user page")
	public void user_table_is_displayed_in_manage_user_page() {
	   
	}

	@When("User clicks sort icon in table header")
	public void user_clicks_sort_icon_in_table_header() {
		userPage.click_sorticon_name();
	}

	@Then("Table rows should be sorted")
	public void table_rows_should_be_sorted() {
		String email = userPage.validate_firstrow_after_sorting();
		System.out.println("Email After Sorting -------------" + email);
		if("john_dovee1234@gmail.com".equals(email)) {			
			Assert.fail();
		}
	  
	}

	@When("User checks empty checkbox in header")
	public void user_checks_empty_checkbox_in_header() {
	  userPage.click_header_checkbox();
	  String actual_value = userPage.validate_checkbox();
	  System.out.println("Is Check box selected -------------" + actual_value);
	   if(!actual_value.equals("true")) {
		   Assert.fail();
	   }
	}

	@Then("check box in all rows of user table should be checked")
	public void check_box_in_all_rows_of_user_table_should_be_checked() {
		 String actual_value = userPage.validate_all_rows_selected();
		 System.out.println("Checking all the values are selected :::::::::" + actual_value);
		 if(!actual_value.equals("true")) {
			   Assert.fail();
		   }
		//  boolean d = userPage.validate_all_rows_selected();
		  //System.out.println("dddddddddddddddddddddddddddddddd" + d);

	}

	@When("User unchecks empty checkbox in header")
	public void user_unchecks_empty_checkbox_in_header() {
		userPage.unclick_header_checkbox();
	}

	@Then("check box in all rows of user table should be unchecked")
	public void check_box_in_all_rows_of_user_table_should_be_unchecked() {
		String actual_value = userPage.validate_all_rows_selected();
		 System.out.println("Checking all the values are un selected :::::::::" + actual_value);
		 if(!actual_value.equals("false")) {
			   Assert.fail();
		   }
	   
	}
	
	


}
