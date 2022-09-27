package com.lms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.lms.util.TestBase;

public class BatchPage extends TestBase {

	@FindBy(xpath = "//span[@text =_'ngcontent-jic-c154']")
	@CacheLookup
	WebElement lmsLogo;

	@FindBy(xpath = "//span[@class='mat-button-wrapper' and text() ='Batch']")
	@CacheLookup
	WebElement batchPage;

	@FindBy(xpath = "//div[text()=' Manage Batch']")
	@CacheLookup
	WebElement manageBatch;
	
	

	public BatchPage() {

		super();
	}

	public void validateBatchPage() {
		batchPage.click();
	}
	
	public String validateHeadertext() {
		String actual_txt = manageBatch.getText();
		actual_txt = actual_txt.trim();
		return actual_txt;
	}
	
	

}
