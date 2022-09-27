package com.lms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.lms.util.TestBase;

public class RegistrationPage extends TestBase{
	
	
	@FindBy(id = "registrationButton")WebElement registration_button;
	@FindBy(id = "login")WebElement login_button;
	@FindBy(id = "Sign Up") WebElement signUp_button;
	@FindBy(id = "firstName") WebElement firstName_field;
	@FindBy(id = "lastName") WebElement lastName_field;
	@FindBy(id = "address") WebElement address_field;
	@FindBy(id = "streetName") WebElement streetName_field;
	@FindBy(id = "city") WebElement city_field;
	@FindBy(id = "state") WebElement state_field;
	@FindBy(id = "zip") WebElement zip_field;
	@FindBy(id = "birthdate") WebElement birthdate_field;
	@FindBy(id = "phoneNumber") WebElement number_field;
	@FindBy(id = "userName") WebElement userName_field;
	@FindBy(id = "password") WebElement password_field;
	@FindBy(id = "email") WebElement email_field;




	public RegistrationPage() {
		super();
	}
	
	public String validate_reg_heading() {
		String actual_value = prop.getProperty("registration_heading");
		System.out.println("Registration heading" + actual_value);
		return actual_value;
	}
	
	public void click_login() {
		login_button.click();
	}
	
	public void registration_click() {
		registration_button.click();
	}
	

	
	

}
