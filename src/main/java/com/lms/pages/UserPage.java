package com.lms.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lms.util.TestBase;

public class UserPage extends TestBase {

	@FindBy(xpath = "//span[@class='mat-button-wrapper' and text()='User']")
	WebElement user_tab;

	@FindBy(xpath = "//div[@class='box' and text()=' Manage User']")
	WebElement manage_user;

	@FindBy(xpath = "//div[@ng-reflect-ng-class='p-paginator p-component']")
	WebElement pagination_control;

	@FindBy(xpath = "//p-paginator[@ng-reflect-rows='5']/div/button[1]")
	WebElement pagination_backButton;

	@FindBy(xpath = "//p-paginator[@class='ng-star-inserted']/following::div[1]")
	WebElement user_footer_text;

	@FindBy(xpath = "//div[@class='p-checkbox-box']")
	WebElement header_checkbox;
	
	@FindBy(xpath = "//div[@class='p-checkbox-box p-highlight']")
	WebElement header_checkbox_after_click;
	

	@FindBy(xpath = "//th[@ng-reflect-field='user_id']")
	WebElement id_column;

	@FindBy(xpath = "//th[@ng-reflect-field='firstName']")
	WebElement name_column;

	@FindBy(xpath = "//th[@ng-reflect-field='emailAddress']")
	WebElement email_column;
	
	@FindBy(xpath = "//th[@ng-reflect-field='emailAddress']//i")
	WebElement emailColumn_sorticon;

	@FindBy(xpath = "//th[@ng-reflect-field='phoneNumber']")
	WebElement number_column;

	@FindBy(xpath = "//th[@ng-reflect-field='batch']")
	WebElement batch_column;

	@FindBy(xpath = "//th[@ng-reflect-field='skill']")
	WebElement skill_column;

	@FindBy(xpath = "//tr[@class='ng-star-inserted']/th[text()=' Edit / Delete']")
	WebElement edit_delete_column;
	
	@FindBy(xpath = "//span[@class='p-button-label' and contains(text(), 'New User')]")
	WebElement add_new_user;
	
	@FindBy(xpath = "//span[text()='User Details']")
	WebElement afterClick_addNewUser;
	
	@FindBy(xpath = "//span[@ng-reflect-ng-class='pi pi-times']")
	WebElement cross_button;

	@FindBy(xpath = "(//button[contains(@class,'p-button-danger p-button')])[1]")
	WebElement header_delete;
	
	
	@FindBy(xpath = "//p-confirmdialog[@class='ng-tns-c133-8']//span[contains(text(), 'Are you')]")
	WebElement delete_confirm;
	
	@FindBy(xpath = "//button//span[text()='Yes']/..")
	WebElement btn_yes;

	@FindBy(xpath = "//button//span[text()='No']/..")
	WebElement btn_No;
	
	public UserPage() {
		// TODO Auto-generated constructor stub
		super();
	}

	public void  verify_loggedIn() {
		//waitUntillVisibilityOf(user_tab);
		//boolean is_displayed = user_tab.isDisplayed();
		//return is_displayed;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void waitUntillVisibilityOf(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// return false;
		}

	}
	
	public void waitUntillElementClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			// return false;
		}

	}
	
	public void waitUntillElementSelected(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 8);
		try {
			wait.until(ExpectedConditions.elementToBeSelected(element));
		} catch (Exception e) {
			// return false;
		}

	}

	public void click_usertab() {
		//waitUntillElementClickable(user_tab);
		
		user_tab.click();
	}

	public boolean validateUserisOnUserPage() {
		String expected_url = prop.getProperty("user_url");
		String actual_url = driver.getCurrentUrl();
		if (expected_url == actual_url) {
			return true;
		}

		return false;
	}

	public String validate_userHeading() {

		String actual_value = manage_user.getText();
		actual_value = actual_value.trim();
		return actual_value;
	}

	public boolean pagination_present() {
		return pagination_control.isDisplayed();

	}

	public boolean pagination_isDisabled() {
		return pagination_backButton.isDisplayed();
	}

	public int validateNumberOfrows() {
		List<WebElement> allRows = driver.findElements(By.xpath("//tbody[@class='p-datatable-tbody']/tr"));
		int number_of_rows = allRows.size();
		return number_of_rows;
	}

	

	public void click_sorticon_name() {

		emailColumn_sorticon.click();
	}

	public String validate_firstrow_after_sorting() {
		System.out.println("Inside validate FirstRow after sorting method ");
		String email_value = null;
		int total_rows = validateNumberOfrows();
		for (int i = 1; i <= total_rows; i++) {
			if (i == 1) {
				driver.findElement(By.xpath("//tbody[@class='p-datatable-tbody']/tr[" + i + "]"));
				email_value = driver.findElement(By.xpath("//tbody[@class='p-datatable-tbody']/tr[" + i + "]/td[4]"))
						.getText();
			}
		}
		
		return email_value;

	}

	public String validate_user_footer() {
		return user_footer_text.getText();
	}

	public boolean validateHeaderCheckBoxColumn() {
		//System.out.println("header_checkbox.isSelected() =============" + header_checkbox.isSelected());
		return header_checkbox.isSelected();

	}

	public boolean validateIDcolumn() {
		return id_column.isDisplayed();
	}

	public boolean validateNamecolumn() {
		return name_column.isDisplayed();
	}

	public boolean validateEmailcolumn() {
		return email_column.isDisplayed();
	}

	public boolean validateNumbercolumn() {
		return number_column.isDisplayed();
	}

	public boolean validateBatchcolumn() {
		return batch_column.isDisplayed();
	}

	public boolean validateSkillcolumn() {
		return skill_column.isDisplayed();
	}

	public boolean validateEditDeletecolumn() {
		return edit_delete_column.isDisplayed();
	}
	
	
	public void click_header_checkbox() {
		
		header_checkbox.click();
		waitUtillelementSelected(header_checkbox);
		
	}
	
	public String validate_all_rows_selected() {
		System.out.println("Inside validatin all rows selected ");
		String attribute_value = "true";
		int total_rows = validateNumberOfrows();
		for (int i = 1; i <= total_rows; i++) {			
				//driver.findElement(By.xpath("//tbody[@class='p-datatable-tbody']/tr[" + i + "]"));
				//boolean selected_value = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).isSelected();
				//System.out.println("**** IN SIDE **********" + selected_value);
			attribute_value =  driver.findElement(By.xpath("//tbody[@class='p-datatable-tbody']/tr["+i+"]//div[@role='checkbox']")).getAttribute("aria-checked");
		}
		
		return attribute_value;
	}
	
	
	public void selectAllrows() {
		int total_rows = validateNumberOfrows();
		for (int i = 1; i <= total_rows; i++) {			
			WebElement select_rows = driver.findElement(By.xpath("//tbody[@class='p-datatable-tbody']/tr["+i+"]//div[@role='checkbox']"));
			select_rows.click();
			
			
			
	}

		
	}
	
	public String validate_all_rows_Unselected() {
		System.out.println("Inside validatin all rows selected ");
		String attribute_value = "false";
		int total_rows = validateNumberOfrows();
		for (int i = 1; i <= total_rows; i++) {			
			attribute_value =  driver.findElement(By.xpath("//tbody[@class='p-datatable-tbody']/tr["+i+"]//div[@role='checkbox']")).getAttribute("aria-checked");
		}

		return attribute_value;
	}
	
	public void unclick_header_checkbox() {
		driver.findElement(By.xpath("//div[@class='p-checkbox-box p-highlight']")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//header_checkbox.click();
		
		
	}
	
	public String validate_checkbox() {
		String value_after_select = driver.findElement(By.xpath("//div[@class='p-checkbox-box p-highlight']")).getAttribute("aria-checked");
		return value_after_select;
	}
	
	
	public void waitUtillelementSelected(WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		try {
			wait.until(ExpectedConditions.elementToBeSelected(element));
		}catch(Exception e) {
		}

	}
	
	
	public String validate_addNewUser() {
		
		return add_new_user.getText();
		
	}
	
	public void click_AddNewUser() {
		add_new_user.click();

	}
	
	public String validateTextAfterAddNewUser() {

		return afterClick_addNewUser.getText();

		
	}
	
	public void close_user_window() {
		
		cross_button.click();
		
	}
	
	public boolean validate_headerDeleteIcon() {
		return header_checkbox.isDisplayed();
		
	}
	
	public boolean validate_headerDeleteIconEnabled() {
		waitUntillElementSelected(header_delete);
		return header_delete.isEnabled();

		
	}
	
	public void isAttributePresent(WebElement element) {
		
		String attributeValue = element.getAttribute("disabled");
		System.out.println("DSYYYYYYYYYYYYYYYYYU" + attributeValue);
	}
	
	public boolean validate_headerIconAfterSelect() {
		return header_delete.isSelected();

		
	}
	
	public void click_headerdeleteIcon() {	
		driver.findElement(By.xpath("(//span[contains(@class,'p-button-icon pi')])[1]")).click();
	//	header_delete.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteTextDialogueBox() {
		waitUntillVisibilityOf(delete_confirm);
		String text = delete_confirm.getText();
		System.out.println("Text====================" + text);
		
	}
	
	public String verifyYesButton() {
		
		return btn_yes.getText();
	}
	
	public String verifyNoButton() {
		
		 return btn_No.getText();
	}

	
	
}
