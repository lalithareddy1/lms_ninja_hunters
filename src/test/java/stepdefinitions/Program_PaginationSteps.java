package stepdefinitions;

import com.lms.pages.ProgramPage;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Program_PaginationSteps extends ProgramPage{
	ProgramPage pp=new ProgramPage();
	@When("User is on first page of Manage Program")
	public void user_is_on_first_page_of_manage_program() {
		pp.click_firstpage();
	}

	@Then("Verify that previous link is disabled")
	public void verify_that_previous_link_is_disabled() {
	  assertEquals("true", pp.check_previous_link());
	}

	@Given("User is on first page")
	public void user_is_on_first_page() {
	   
	}

	@When("User clicks navigate > button")
	public void user_clicks_navigate_nextbutton() {
	  pp.click_nextpagelink();
	}
	@Then("User is on page number {string}")
	public void user_is_on_the_page_number(String expected) {
		
	   if(expected.equals("2"))
		   assertEquals("2", pp.get_pageno());
	   if(expected.equals("1"))
		   assertEquals("1", pp.get_pageno());
	}

	
	@When("User clicks navigate < button")
	public void user_clicks_navigate_previousbutton() {
		pp.click_previouspagelink();
	}

	@When("User is on last page of Manage Program")
	public void user_is_on_last_page_of_manage_program() {
	   pp.goto_lastpage();
	}

	@Then("Verify that next link is disabled")
	public void verify_that_next_link_is_disabled() {
		assertEquals("true", pp.check_nextpagelink());
	}

}
