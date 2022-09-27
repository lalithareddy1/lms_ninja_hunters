package com.lms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.lms.util.TestBase;

public class HomePage extends TestBase{
	
	public HomePage()
	{
		super();
	}
	@FindBy(xpath = "//mat-toolbar/span[text()=' LMS - Learning Management System ']")
	WebElement heading;
	@FindBy(xpath="//mat-toolbar//button/span[text()='Program']")
	WebElement btn_program;
	@FindBy(xpath="//mat-toolbar//button/span[text()='Batch']")
	WebElement btn_batch;
	@FindBy(xpath="//mat-toolbar//button/span[text()='User']")
	WebElement btn_user;
	@FindBy(xpath="//mat-toolbar//button/span[text()='Assignment']") 
	WebElement btn_assignment;
	@FindBy(xpath="//mat-toolbar//button/span[text()='Attendance']")
	WebElement btn_attendance;
	@FindBy(xpath="//mat-toolbar//button/span[text()='Logout']")
	WebElement btn_logout;
	
	public String validate_title()
	{
    return driver.getTitle();
      
	}
	public String validate_heading()
	{
    return heading.getText();
      
	}
	public String validate_btnprogram()
	{
		
    return btn_program.getText();
      
	}
	public String validate_btnbatch()
	{
    return btn_batch.getText();
      
	}
	public String validate_btnuser()
	{
    return btn_user.getText();
      
	}
	public String validate_btnassignment()
	{
    return btn_assignment.getText();
      
	}
	public String validate_btnattendance()
	{
    return btn_attendance.getText();
      
	}
	public String validate_btnlogout()
	{
    return btn_logout.getText();
      
	}
}
