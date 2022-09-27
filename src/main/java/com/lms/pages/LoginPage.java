package com.lms.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lms.util.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id = "username")
	WebElement name_field;
	
	@FindBy(id = "password")
	WebElement password_field;
	
	@FindBy(id="login")
	WebElement login_button;
	
	@FindBy(id= "errormessage")
	WebElement error_message;
	
	public LoginPage() {
		super();
	}
	
	
	public void submit_invalid_password(String invalidPass) {
		password_field.sendKeys(invalidPass);
		login_button.click();
		waitUntillVisibilityOf(error_message);
		
	}
	
	public void error_message_text() {
		String text_error_msg = error_message.getText();
		System.out.println("INNNNNNNNNNNN LOGINNNNNNNN" + text_error_msg);
	}
	
	public void submit_invalid_username(String invalidUsername) {
		password_field.sendKeys(invalidUsername);
		login_button.click();
		waitUntillVisibilityOf(error_message);
		
	}
	
	public void submit_valid_credentials(String username, String password) {
		name_field.sendKeys(username);
		password_field.sendKeys(password);
		login_button.click();
		
		waitUntillUrlTobe(prop.getProperty("homepage_url"));
		
	}
	
	public void waitUntillUrlTobe(String url) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.urlToBe(url));

	}
	
	public void waitUntillVisibilityOf(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
		}catch(Exception e) {
			//return false;
		}
		//return true;

	}
	
	public String error_message() {
		String err_msg = error_message.getText();
		return err_msg;
	}
	
	
	
	public String validateLoginPageUrl() {
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		return url;
	}
	

}
