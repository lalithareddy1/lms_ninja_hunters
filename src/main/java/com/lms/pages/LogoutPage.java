package com.lms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.lms.util.TestBase;

public class LogoutPage extends TestBase{
	
	@FindBy(xpath = "//span[@class='mat-button-wrapper' and text()='Logout']")
	WebElement logout_button;
	
	
	public LogoutPage() {
		super();
	}
	
	
	public void click_logout() {
		logout_button.click();
	}
	
	public void validate_after_logout() {
		String expected_url = prop.getProperty("url");
		String actual = driver.getCurrentUrl();
		
	}
	
	public void close_browser() {
		driver.quit();
	}
	

}
