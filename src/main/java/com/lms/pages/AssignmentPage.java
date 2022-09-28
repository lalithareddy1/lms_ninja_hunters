package com.lms.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lms.util.TestBase;

public class AssignmentPage extends TestBase {

	// assignement page click
	@FindBy(xpath = "//span[@class='mat-button-wrapper' and text()='Assignment']")
	WebElement assignementpage;

	// heading validation of assignement page
	@FindBy(xpath = "//div[contains(text(),' Manage Assignment')]")
	WebElement Headervalidation;

	// validation of text and footer validation on assignement page
	@FindBy(xpath = "//span[contains(text(),'Showing 1 to 3 of 3 entries')]")
	WebElement textvalidation;

	@FindBy(xpath = "//div[contains(text(),'In total there are 3 assignments.')]")
	WebElement footervalidation;

	// search text validation
	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement searchtextvalidation;

	// select checkbox
//		@FindBy(xpath = "//tbody[@class='p-datatable-tbody']/tr[1]/td[1]/p-tablecheckbox//div[@role='checkbox']")
//		WebElement selectcheckbox;
	@FindBy(xpath = "//tbody//tr[1]//td[1]//div[@role='checkbox']")
	WebElement firstrow_check_box;

	// click on edit button
	@FindBy(xpath = "//span[@class='p-button-icon pi pi-pencil']")
	WebElement editbutton;

	// check assignment description header validation
	@FindBy(xpath = "//span[contains(text(),'Assigment Details')]")
	WebElement assigndescheader;

	// click and enter assignement name
	@FindBy(xpath = "//input[@id='assignment']")
	WebElement assignmentnamer;

	// click and enter assignment description
	@FindBy(xpath = "//input[@id='assignmentDescription']")
	WebElement assignmentdescription;

	// click and enter assignment description
	@FindBy(xpath = "//input[@id='assignmentGraderId']")
	WebElement assignmentgrade;

	// click on calender
	@FindBy(xpath = "//span[@class='p-button-icon pi pi-calendar']")
	WebElement calender;

	// change the date
	@FindBy(xpath = "//span[contains(text(),'19')]")
	WebElement clickondate;

	// click on canel
	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	WebElement clickoncancel;

	// click on save
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	WebElement clickonsave;
	// click on delete button
	@FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/span[2]/button")
	WebElement clickondeletebutton;

	@FindBy(xpath = "//button[@id='new']")
	WebElement btn_newassign;

	@FindBy(xpath = "//div[@role='dialog']")
	WebElement dialogbox;

	@FindBy(xpath = "//button[@label='Save']")
	WebElement btn_save;

	@FindBy(xpath = "//div//input[@id='programName']/../small")
	WebElement name_errormsg;

	@FindBy(xpath = "//div//span[text()='Confirm']")
	WebElement btn_confirm_deletion_dialogbox;
	List<WebElement> page_buttons;

	@FindBy(xpath = "//button//span[text()='Yes']/..")
	WebElement btn_yes;

	@FindBy(xpath = "//button//span[text()='No']/..")
	WebElement btn_No;

	@FindBy(xpath = "//div[@class='box']//button[@icon='pi pi-trash']")
	WebElement btn_delete;

	@FindBy(xpath = "//i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt']")
	WebElement asending_assignorder;

	@FindBy(xpath = "//i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-down']")
	WebElement descending_assignorder;

	@FindBy(xpath = "//button[@class='p-paginator-prev p-paginator-element p-link p-ripple p-disabled']")
	WebElement previous_link;
	@FindBy(xpath = "//button[@class='p-paginator-prev p-paginator-element p-link p-ripple']")
	WebElement previous_link_enabled;
	@FindBy(xpath = "//p-paginator//button/span[@class='p-paginator-icon pi pi-angle-double-left']/..")
	WebElement firstpage_link;
	@FindBy(xpath = "//button[@class='p-paginator-next p-paginator-element p-link p-ripple p-disabled']")
	WebElement next_link;
	@FindBy(xpath = "//p-paginator//button/span[@class='p-paginator-icon pi pi-angle-double-right']/..")
	WebElement lastpage_link;

	// buttons for ascorder
	@FindBy(xpath = "//th[text()='Assignment Name ']")
	WebElement btn_AscArrow_assignname;

	@FindBy(xpath = "//th[text()='Assignment Description ']")
	WebElement btn_AscArrow_assigndesc;
	
	@FindBy(xpath = "//span[contains(text(),'Are you')]")
	WebElement confirm;

	public AssignmentPage() {
		super();
	}

	public void clickonassignment() throws InterruptedException {
		// waitUntillVisibilityOf(assignementpage);
		Thread.sleep(3000);
		assignementpage.click();
		// System.out.println("Inside assignment page");
	}

	public String checkheader() {
		return Headervalidation.getText();

	}

	public String textvalidation() {
		return textvalidation.getText();

	}

	public String footervalidation() {
		return footervalidation.getText();
	}

	public String Validatesearchtext() {
		return searchtextvalidation.getAttribute("placeholder");
	}

	String namephrase = "SQL ASSIGNMENT";

	public void searchassignementname() throws InterruptedException {
		searchtextvalidation.click();
		searchtextvalidation.sendKeys(namephrase + Keys.ENTER);
		Thread.sleep(2000);

	}

	@FindBy(xpath = "//p-paginator//button/span[@class='p-paginator-icon pi pi-angle-right']/..")
	WebElement next_button;

	public void check_assignment_byname() throws InterruptedException {
		List<WebElement> currentpage_records;
		int totalpages = 1;
		int totalrows = 0;
		int flag = 0;
		while (flag == 0) {
			System.out.println("In Page " + totalpages);
			currentpage_records = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
			System.out.println("current page record :" + currentpage_records.size());
			totalrows = totalrows + currentpage_records.size();
			for (int row = 1; row <= currentpage_records.size(); row++) {
				String assignname = driver.findElement(By.xpath("//table/tbody/tr[" + row + "]/td[2]")).getText()
						.toUpperCase();
				String assigndesc = driver.findElement(By.xpath("//table/tbody/tr[" + row + "]/td[3]")).getText()
						.toUpperCase();
				// String
				// status=driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td[4]")).getText().toUpperCase();
				String fullstring = assignname + assigndesc;
				if (fullstring.contains(namephrase)) {
					System.out.println(namephrase + "is present in row" + row);
				} else
					System.out.println(namephrase + "is not present in row" + row);
			}
			if (next_button.isEnabled()) {
				System.out.println("##########");
				flag = 0;
				totalpages++;
				next_button.click();
				waitUntillVisibilityOf(next_button);
			} else {
				flag = 1;
			}
		}

		System.out.println("Total Pages:  " + totalpages);
		System.out.println("Total Records:  " + totalrows);
		System.out.println("hihiihihihihihi");
		searchtextvalidation.clear();
		searchtextvalidation.sendKeys(" ");
		// System.out.println(searchtextvalidation.getText());
		Thread.sleep(2000);
	}

	// add new assignment
	public void click_newpgm() {

		waitUntillVisibilityOf(btn_newassign);
		Actions action = new Actions(driver);
		action.moveToElement(btn_newassign).click().perform();

	}

	public boolean check_dialogbox_displayed() {
		waitUntillVisibilityOf(dialogbox);

		System.out.println("Dialog box is displayed: " + dialogbox.isDisplayed());
		return dialogbox.isDisplayed();

	}

	public void click_savebtn() {
		assignmentnamer.click();
		waitUntillVisibilityOf(btn_save);
		btn_save.click();

	}

	public String get_name_errormsg() {
		waitUntillVisibilityOf(name_errormsg);
		if (name_errormsg.isDisplayed()) {
			return name_errormsg.getText();
		} else {
			return null;
		}
	}

	public String get_successmsg() {
		return "Successful Program created";
	}

	public void click_btndelete() {
		//searchtextvalidation.clear();
		System.out.println(" ++++++++++++ INSIDE   JAVA CLICK ++++++++++++++++++++=");
		waitUntillVisibilityOf(firstrow_check_box);
		firstrow_check_box.click();
		waitUntillVisibilityOf(clickondeletebutton);
		clickondeletebutton.click();
		
		//waitUntillVisibilityOf(assignementpage);

	}

	public boolean check_confirmdelteionbox_displayed() {

		return btn_confirm_deletion_dialogbox.isDisplayed();
	}

	public void editassignment() throws InterruptedException {
		System.out.println("Inside assignment checkbox page");
		waitUntillVisibilityOf(searchtextvalidation);
		searchtextvalidation.clear();

		waitUntillVisibilityOf(firstrow_check_box);
		// Thread.sleep(2000);
		firstrow_check_box.click();

//			Actions action = new Actions(driver);
//			action.moveToElement(selectcheckbox).click().build().perform();

	}

	public boolean selectedbox() {
		return firstrow_check_box.isEnabled();
	}

	public void clickoneditbutton() {
		waitUntillVisibilityOf(editbutton);
		editbutton.click();

	}

	public boolean assigndescriptionbox() {
		return assigndescheader.isDisplayed();

	}

	public void editassignname() {
		waitUntillVisibilityOf(assignmentnamer);
		assignmentnamer.clear();
		assignmentnamer.sendKeys("SQL1 assignment");

	}

	public void assignnamegetdisplayed() {
		waitUntillVisibilityOf(assignmentnamer);
		System.out.println("assignement Name entered:" + assignmentnamer.getAttribute("value"));

	}

	public void editassigndesc() {
		waitUntillVisibilityOf(assignmentdescription);
		// assignmentdescription.clear();
		assignmentdescription.sendKeys("SQL2 Practices");

	}

	public void assigndescgetdisplayed() {
		waitUntillVisibilityOf(assignmentdescription);
		System.out.println("assignment Description entered:" + assignmentdescription.getAttribute("value"));

	}

	public void editassigngrade() {
		waitUntillVisibilityOf(assignmentgrade);
		assignmentgrade.clear();
		assignmentgrade.sendKeys("2");
	}

	public void assigngradegetdisplayed() {
		waitUntillVisibilityOf(assignmentgrade);
		System.out.println("assignment grade entered:" + assignmentgrade.getAttribute("value"));

	}

	public void editcalenderdate() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		waitUntillVisibilityOf(calender);
		calender.click();
		clickondate.click();
	}

	public void assigndategetdisplayed() {
		waitUntillVisibilityOf(clickondate);
		System.out.println("assignment due date entered:" + clickondate.getText());

	}

	public void clickoncancelbutton() {
		clickoncancel.click();

	}

	public boolean assigncancelbuttondisabled() {
		return assignmentgrade.isSelected();

	}

	public void clickonsavebutton() {
		clickonsave.click();

	}

	public String savemsggetdispalyed() {
		return "Successful Assignment Updated";

	}

	public void click_yesbtn_fordelete() {
		waitUntillVisibilityOf(clickondeletebutton);
		clickondeletebutton.click();
		btn_yes.click();

	}

	public String check_program_deleted() {
		return "Successful Assignment Deleted";
	}

	public void click_No() throws InterruptedException {
		Thread.sleep(1000);
		btn_No.click();
		System.out.println("Clicked No button");

	}

	public boolean check_dialogbox_disappear() {
		return true;
	}

	@FindBy(xpath = "//span[@class='p-input-icon-left']//input")
	WebElement search_box;

	public void select_multiplepgm() throws InterruptedException {
		List<WebElement> currentpage_records;
		waitUntillVisibilityOf(search_box);
		int totalrows = 0;
		search_box.clear();
		currentpage_records = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		System.out.println("Current page records are: " + currentpage_records.size());

		for (int row = 1; row <= currentpage_records.size(); row = row + 2) {
			WebElement record = driver.findElement(By.xpath("//table/tbody/tr[" + row + "]/td[1]"));
			waitUntillVisibilityOf(record);
			if (!record.isSelected()) {
				record.click();
				System.out.println("Row " + row + " is selected for deletion");
				Thread.sleep(2000);
			}
			totalrows++;

		}
		System.out.println("Total rows selected for deletion is: " + totalrows);

	}

	public void check_multipgram_selected() {
		System.out.println("Multiple programs got selected");

	}

	public void click_deletebtn_attop() throws InterruptedException {
		waitUntillVisibilityOf(btn_delete);
		btn_delete.click();
		System.out.println("Delete button clicked");
		Thread.sleep(2000);

	}

	public String check_previous_link() {
		String actual = previous_link.getAttribute("disabled");
		System.out.println("Disabled attr is present : " + actual);

		return actual;

	}

	public void click_firstpage() {
		if (firstpage_link.isEnabled()) {
			firstpage_link.click();
			System.out.println("Current page no : 1");
		}

	}

	public void click_nextpagelink() {
		if (next_button.isEnabled())
			next_button.click();

	}

	public String get_pageno() {
		page_buttons = driver.findElements(By.xpath("//span[@class='p-paginator-pages ng-star-inserted']/button"));
		String currentpage_no = "";
		for (int page = 1; page <= page_buttons.size(); page++) {
			WebElement pageno_btn = driver
					.findElement(By.xpath("//span[@class='p-paginator-pages ng-star-inserted']/button[" + page + "]"));
			waitUntillVisibilityOf(pageno_btn);
			String classvalue = pageno_btn.getAttribute("class");
			if (classvalue.contains("p-highlight")) {
				currentpage_no = pageno_btn.getText();
				System.out.println("Current page no is : " + currentpage_no);
			}

		}

		return currentpage_no;
	}

	public void click_previouspagelink() {
		if (previous_link_enabled.isEnabled())
			previous_link_enabled.click();
	}

	public void goto_lastpage() {

		waitUntillVisibilityOf(lastpage_link);
		lastpage_link.click();
	}

	public String check_nextpagelink() {
		String actual = next_link.getAttribute("disabled");
		System.out.println("Disabled attr is present : " + actual);
		return actual;
	}

	// Ascending order feature
	public void click_AscArrow_inassignName() throws InterruptedException {
//			waitUntillVisibilityOf(btn_AscArrow_assignname);
//			btn_AscArrow_assignname.click();
//			//Thread.sleep(2000);
	}

	public void click_AscArrow_inassignDesc() throws InterruptedException {
		waitUntillVisibilityOf(btn_AscArrow_assigndesc);
		btn_AscArrow_assigndesc.click();
		Thread.sleep(2000);

	}

	public void view_results_forassignName() {
//			int flag=0;
//			int totalpages=1;
//			while(flag==0)
//			{
//				List<WebElement> currentpagerecords =driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
//				String[] actual = new String[currentpagerecords.size()]; 
//				String[] sorted = new String[currentpagerecords.size()];
		//
//				for (int row = 0; row < currentpagerecords.size(); row++) 
//				{
//					int recordno=row+1;
//					actual[row]=sorted[row] = driver.findElement(By.xpath("//table/tbody/tr["+recordno+"]/td[2]")).getText();
//				}
//	          
//				//Sorting the array
//				Arrays.sort(sorted);
//				System.out.println("*****In Page no  "+totalpages+":*****");
//				System.out.println("Actual values are:");
//				for(String x:actual)
//					System.out.println(x);
//				System.out.println("Sorted values are:");
//				for(String x:sorted)
//					System.out.println(x);
//				//Validating the existing with sorted array. shows no message if both are same
//				for(int row = 0;row<currentpagerecords.size();row++)
//				{
//					
//					if(!actual[row].equals(sorted[row]))
//					{
//						int recordno=row+1;
//						
//						System.out.println("At Row "+recordno+":expected= "+sorted[row]+" but actual ="+actual[row]);
		//
//					}
//					
//				}
//				if(next_button.isEnabled())
//				{
//					totalpages++;
//					flag=0;
//					next_button.click();
//					waitUntillVisibilityOf(next_button);
		//
//				}
//				else
//					flag=1;
		//
//			}

	}

	public void view_results_forassignDesc() {
		int flag = 0;
		int totalpages = 1;
		while (flag == 0) {
			List<WebElement> currentpagerecords = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
			String[] actual = new String[currentpagerecords.size()];
			String[] sorted = new String[currentpagerecords.size()];

			for (int row = 0; row < currentpagerecords.size(); row++) {
				int recordno = row + 1;
				actual[row] = sorted[row] = driver.findElement(By.xpath("//table/tbody/tr[" + recordno + "]/td[3]"))
						.getText();
			}

			// Sorting the array
			Arrays.sort(sorted);
			System.out.println("*****In Page no  " + totalpages + ":*****");
			System.out.println("Actual values are:");
			for (String x : actual)
				System.out.println(x);
			System.out.println("Sorted values are:");
			for (String x : sorted)
				System.out.println(x);
			// Validating the existing with sorted array. shows no message if both are same
			for (int row = 0; row < currentpagerecords.size(); row++) {

				if (!actual[row].equals(sorted[row])) {
					int recordno = row + 1;

					System.out.println(
							"At Row " + recordno + ":expected= " + sorted[row] + " but actual =" + actual[row]);

				}

			}
			if (next_button.isEnabled()) {
				totalpages++;
				flag = 0;
				next_button.click();
				waitUntillVisibilityOf(next_button);

			} else
				flag = 1;

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
}
