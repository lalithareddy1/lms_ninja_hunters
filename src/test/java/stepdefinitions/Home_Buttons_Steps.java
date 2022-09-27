package stepdefinitions;


import com.lms.pages.HomePage;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;




public class Home_Buttons_Steps extends HomePage {

	HomePage hm=new HomePage();
	String actualstring;

	@Then("User should see a button with text {string} on the menu bar")
	public void user_should_see_a_button_with_text_on_the_menu_bar(String expectedstring) {
		System.out.println("Expected Text:"+expectedstring);
	   if(expectedstring.equals("Program"))
	   {
		   actualstring=hm.validate_btnprogram();
		   System.out.println("Actual text:"+actualstring);
		   assertEquals(expectedstring,actualstring);
		   System.out.println(expectedstring+"Button is present");
	   }
	   else if(expectedstring.equals("Batch"))
	   {
		   actualstring=hm.validate_btnbatch();
		   System.out.println("Actual text:"+actualstring);
		   assertEquals(expectedstring,actualstring);
		   System.out.println(expectedstring+"Button is present");
	   }
	   else if(expectedstring.equals("User"))
	   {
		   actualstring=hm.validate_btnuser();
		   System.out.println("Actual text:"+actualstring);
		   assertEquals(expectedstring,actualstring);
		   System.out.println(expectedstring+"Button is present");
	   }
	   else if(expectedstring.equals("Assignment"))
	   {
		   actualstring=hm.validate_btnassignment();
		   System.out.println("Actual text:"+actualstring);
		   assertEquals(expectedstring,actualstring);
		   System.out.println(expectedstring+"Button is present");
		   }
	   else if(expectedstring.equals("Attendance"))
	   {
		   actualstring=hm.validate_btnattendance();
		   System.out.println("Actual text:"+actualstring);
		   assertEquals(expectedstring,actualstring);
		   System.out.println(expectedstring+"Button is present");
	   }
	   else if(expectedstring.equals("Logout"))
	   {
		   actualstring=hm.validate_btnlogout();
		   System.out.println("Actual text:"+actualstring);
		   assertEquals(expectedstring,actualstring);
		   System.out.println(expectedstring+"Button is present");
	   }
	   else
	   {
		   System.out.println("Invalid text passed");
	   }
	   }
	}
/*
	@Then("User should see a Program button  on the menu bar")
	public void user_should_see_a_program_button_on_the_menu_bar() {
		if(hm.validate_btnprogram())
			System.out.println("Program Button is Present");
		else
			System.out.println("Program Button is not Present");
	}

	@Then("User should see a Batch button  on the menu bar")
	public void user_should_see_a_batch_button_on_the_menu_bar() {
		if(hm.validate_btnbatch())
			System.out.println("Batch Button is Present");
		else
			System.out.println("Batch Button is not Present");
	}

	@Then("User should see a User button on the menu bar")
	public void user_should_see_a_user_button_on_the_menu_bar() {
		if(hm.validate_btnuser())
			System.out.println("User Button is Present");
		else
			System.out.println("User Button is not Present");
	}

	@Then("User should see a Assignment button  on the menu bar")
	public void user_should_see_a_assignment_button_on_the_menu_bar() {
		if(hm.validate_btnassignment())
			System.out.println("Assignment Button is Present");
		else
			System.out.println("Assignment Button is not Present");
	}

	@Then("User should see a Attendance button  on the menu bar")
	public void user_should_see_a_attendance_button_on_the_menu_bar() {
		if(hm.validate_btnattendance())
			System.out.println("Attendance Button is Present");
		else
			System.out.println("Attendance Button is not Present");
	}

	@Then("User should see a Logout button  on the menu bar")
	public void user_should_see_a_logout_button_on_the_menu_bar() {
		if(hm.validate_btnlogout())
			System.out.println("Logout Button is Present");
		else
			System.out.println("Logout Button is not Present");
	}
*/

