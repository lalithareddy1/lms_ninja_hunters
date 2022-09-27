package com.lms.pages;
import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lms.util.TestBase;
public class ProgramPage extends TestBase {
	@FindBy(xpath = "//app-program//div[text()=' Manage Program']")
	WebElement heading;
	@FindBy(xpath = "//span[@class='p-paginator-current ng-star-inserted']")
	WebElement footertxt;
	@FindBy(xpath = "//div[@class='p-d-flex p-ai-center p-jc-between ng-star-inserted']")
	WebElement footer;
	@FindBy(xpath = "//span[@class='mat-button-wrapper' and text()='Program']")
	WebElement btn_program;
	List<WebElement> page_buttons;
	List <WebElement> currentpage_records;
	@FindBy(xpath = "//div[@class='box']//button[@icon='pi pi-trash']")
	WebElement btn_delete;
	@FindBy(xpath = "//tbody//tr")
	WebElement rows;
	@FindBy(xpath = "//span[@class='p-input-icon-left']//input")
	WebElement search_box;
	String namephrase="SDET";
	String descriptionphrase="JAVA";
	String statusphrase="ACTIVE";
	@FindBy(xpath = "//p-paginator//button/span[@class='p-paginator-icon pi pi-angle-right']/..")
	WebElement next_button;
	@FindBy(xpath = "//tbody/tr[1]/td[1]")
	WebElement firstrow_check_box;
	@FindBy(xpath = "//button[@id='new']")
	WebElement btn_newpgm;
	@FindBy(xpath = "//div[@role='dialog']")
	WebElement dialogbox;
	@FindBy(xpath = "//button[@label='Save']")
	WebElement btn_save;
	@FindBy(xpath = "//div//input[@id='programName']/../small")
	WebElement name_errormsg;
	@FindBy(id = "programName")
	WebElement txt_name_inform;
	@FindBy(id ="programDescription")
	WebElement txt_desc_inform;
	@FindBy(xpath ="//p-radiobutton//input[@id='Active']/../../..")
	WebElement radiobtn_activestatus;
	@FindBy(xpath = "//button[@label='Cancel']")
	WebElement btn_cancel;

	@FindBy(xpath = "//tbody/tr[1]/td[5]//button[1]")
	WebElement btn_edit;
	@FindBy(xpath ="//p-radiobutton//input[@id='Inactive']/../../..")
	WebElement radiobtn_inactivestatus;
	@FindBy(xpath = "//tbody/tr[1]/td[5]/div/span[2]/button")
	WebElement btn_deletepgm;

	@FindBy(xpath = "//div/span[text()='Confirm']")
	WebElement btn_confirm_deletion_dialogbox;

	@FindBy(xpath = "//button/span[text()='Yes']/..")
	WebElement btn_yes;

	@FindBy(xpath = "//button/span[text()='No']/..")
	WebElement btn_No;

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

	//buttons for ascorder
	@FindBy(xpath = "//th[text()='Program Name ']")
	WebElement btn_AscArrow_pgmname;

	@FindBy(xpath = "//thead//th[@psortablecolumn='programDescription']//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt']")
	WebElement btn_AscArrow_pgmdesc;
	@FindBy(xpath = "//thead//th[@psortablecolumn='programStatus']//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt']")
	WebElement btn_AscArrow_pgmstatus;

	
	public ProgramPage()
	{
		super();
	}
	public void click_on_programpage()
	{
		btn_program.click();
		System.out.println("Inside Program page");
	}

	public String validate_heading()
	{
		return heading.getText();

	}
	public String validate_footertext()
	{

		return footertxt.getText();

	}

	public String check_deletebutton_state() {
		String isDisabled=btn_delete.getAttribute("Disabled");
		System.out.println("Button is Disabled:"+isDisabled);
		return isDisabled;


	}
	public boolean check_displayofrecords() {
		return rows.isDisplayed();
	}
	public String validate_searchbox() {
		return search_box.getAttribute("placeholder");
	}
	public void enter_namephrase() throws InterruptedException {

		search_box.clear();
		search_box.sendKeys(namephrase+Keys.ENTER);
		Thread.sleep(2000);

	}
	public void enter_descriptionphrase() throws InterruptedException {
		search_box.clear();
		search_box.sendKeys(descriptionphrase+Keys.ENTER);
		Thread.sleep(2000);
	}
	public void enter_statusphrase() throws InterruptedException {
		search_box.clear();
		search_box.sendKeys(statusphrase+Keys.ENTER);
		Thread.sleep(2000);

	}

	public void waitUntillVisibilityOf(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
		}catch(Exception e) {

		}

	}
	public void check_records_byname() {
		int totalpages=1;
		int totalrows=0;
		int flag=0;
		while(flag==0)
		{
			System.out.println("In Page "+totalpages);
			currentpage_records=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
			totalrows=totalrows+currentpage_records.size();
			for(int row=1;row<=currentpage_records.size();row++)
			{
				String pgmname=driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td[2]")).getText().toUpperCase();
				String pgmdesc=driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td[3]")).getText().toUpperCase();
				String status=driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td[4]")).getText().toUpperCase();
				String fullstring=pgmname+pgmdesc+status;
				if(fullstring.contains(namephrase))
				{
					System.out.println(namephrase+"is present in row"+row );
				}
				else
					System.out.println(namephrase+"is not present in row"+row );

			}

			if(next_button.isEnabled())
			{
				flag=0;
				totalpages++;
				next_button.click();
				waitUntillVisibilityOf(next_button);

			}
			else
				flag=1;
		}
		System.out.println("Total Pages:  "+totalpages);
		System.out.println("Total Records:  "+totalrows);	

	}
	public void check_records_bydescription() {
		int totalpages=1;
		int totalrows=0;
		int flag=0;
		while(flag==0)
		{
			System.out.println("In Page "+totalpages);
			currentpage_records=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
			totalrows=totalrows+currentpage_records.size();
			for(int row=1;row<=currentpage_records.size();row++)
			{
				String pgmname=driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td[2]")).getText().toUpperCase();
				String pgmdesc=driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td[3]")).getText().toUpperCase();
				String status=driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td[4]")).getText().toUpperCase();
				String fullstring=pgmname+pgmdesc+status;
				if(fullstring.contains(descriptionphrase))
				{
					System.out.println(descriptionphrase+"is present in row"+row );
				}
				else
					System.out.println(descriptionphrase+"is not present in row"+row );

			}

			if(next_button.isEnabled())
			{
				flag=0;
				totalpages++;
				next_button.click();
				waitUntillVisibilityOf(next_button);

			}
			else
				flag=1;
		}
		System.out.println("Total Pages:  "+totalpages);
		System.out.println("Total Records:  "+totalrows);
	}
	public void check_records_bystatus() {
		int totalpages=1;
		int totalrows=0;
		int flag=0;
		while(flag==0)
		{
			System.out.println("In Page "+totalpages);
			currentpage_records=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
			totalrows=totalrows+currentpage_records.size();
			for(int row=1;row<=currentpage_records.size();row++)
			{
				String pgmname=driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td[2]")).getText().toUpperCase();
				String pgmdesc=driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td[3]")).getText().toUpperCase();
				String status=driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td[4]")).getText().toUpperCase();
				String fullstring=pgmname+pgmdesc+status;
				if(fullstring.contains(statusphrase))
				{
					System.out.println(statusphrase+"is present in row"+row );
				}
				else
					System.out.println(statusphrase+"is not present in row"+row );

			}

			if(next_button.isEnabled())
			{
				flag=0;
				totalpages++;
				next_button.click();
				waitUntillVisibilityOf(next_button);

			}
			else
				flag=1;
		}
		System.out.println("Total Pages:  "+totalpages);
		System.out.println("Total Records:  "+totalrows);
	}
	public void selectpgm() throws InterruptedException {
		waitUntillVisibilityOf(firstrow_check_box);
		firstrow_check_box.click();
		Thread.sleep(2000);

	}
	public boolean check_program_selected() 
	{

		return firstrow_check_box.isEnabled();

	}

	public void click_cancelbtn() {
		waitUntillVisibilityOf(btn_cancel);
		btn_cancel.click();

	}

	public int gettotalrows() {
		search_box.clear();
		click_firstpage();
		
		//int totalpages=1;
		int flag=0;
		int totalrows=0;
		while(flag==0)
		{

			currentpage_records=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
			totalrows=totalrows+currentpage_records.size();
			if(next_button.isEnabled())
			{
				flag=0;
				//totalpages++;
				next_button.click();
				waitUntillVisibilityOf(next_button);

			}
			else
				flag=1;
		}
		return totalrows;
	}
	public String getfooterstring() {
		return footer.getText();
	}
	public void click_newpgm() {
		btn_newpgm.click();


	}
	public boolean check_dialogbox_displayed() {
		waitUntillVisibilityOf(dialogbox);

		System.out.println("Dialog box is displayed: "+dialogbox.isDisplayed());
		return dialogbox.isDisplayed();

	}
	public void click_savebtn() {
		waitUntillVisibilityOf(btn_save);
		btn_save.click();

	}
	public String get_name_errormsg() {
		waitUntillVisibilityOf(name_errormsg);
		if(name_errormsg.isDisplayed())
		{
			return name_errormsg.getText();
		}
		else
		{
			return null;
		}
	}
	public void entername_inform() throws InterruptedException {
		txt_name_inform.sendKeys(namephrase);
		Thread.sleep(2000);
	}
	public void enterdescription_inform() throws InterruptedException {
		txt_desc_inform.sendKeys(descriptionphrase);
		Thread.sleep(2000);
	}
	public void get_name_inform() {
		waitUntillVisibilityOf(txt_name_inform);
		System.out.println("Program Name entered:"+txt_name_inform.getText());

	}
	public void get_desc_inform() {
		waitUntillVisibilityOf(txt_desc_inform);
		System.out.println("Program Description entered:"+txt_desc_inform.getText());

	}
	public void selectstatus_inform() throws InterruptedException {
		waitUntillVisibilityOf(radiobtn_activestatus);
		radiobtn_activestatus.click();
		Thread.sleep(2000);


	}
	public boolean getselectedstatus() {
		return radiobtn_activestatus.isEnabled();
	}
	public String get_successmsg() {
		return "Successful Program created";
	}
	public void click_editbtn() {
		btn_edit.click();
	}

	public void check_pgmdetailsform_display() {

	}
	public void editname() throws InterruptedException {
		txt_name_inform.clear();
		txt_name_inform.sendKeys("updatedname");
		Thread.sleep(2000);

	}
	public boolean check_updatedname() {

		return txt_name_inform.isDisplayed();
	}
	public void editdescription() throws InterruptedException {
		txt_desc_inform.clear();
		txt_desc_inform.sendKeys("updateddesc");
		Thread.sleep(2000);
	}
	public boolean check_updateddescription() {
		return txt_desc_inform.isDisplayed();
	}
	public void change_status() throws InterruptedException {
		waitUntillVisibilityOf(radiobtn_inactivestatus);
		radiobtn_inactivestatus.click();
		Thread.sleep(2000);
	}
	public boolean check_updatedstatus() {
		return radiobtn_inactivestatus.isEnabled();
	}
	public void check_pgm_detailsform_disappear() {

	}
	public String checkmsg() {
		return "Successful Program Updated";

	}
	public void click_btndelete() {
		btn_deletepgm.click();

	}
	public boolean check_confirmdelteionbox_displayed() {

		return btn_confirm_deletion_dialogbox.isDisplayed();
	}
	public void click_yesbtn_fordelete() {
		btn_yes.click();

	}
	public String check_program_deleted() {
		return "Successful Program Deleted";
	}
	public void click_No() throws InterruptedException {
		Thread.sleep(2000);
		btn_No.click();
		System.out.println("Clicked No button");

	}
	public boolean check_dialogbox_disappear() {
		return true;
	}
	public String check_programs_deleted() {
		return "Successful Programs Deleted";
	}
	public void select_multiplepgm() throws InterruptedException {
		waitUntillVisibilityOf(search_box);
		int totalrows=0;
		search_box.clear();
		currentpage_records=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		System.out.println("Current page records are: "+currentpage_records.size());

		for(int row=1;row<=currentpage_records.size();row=row+1)
		{
			WebElement record=driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td[1]"));
			waitUntillVisibilityOf(record);
			if(!record.isSelected())
			{
				record.click();
				System.out.println("Row "+row+" is selected for deletion");
				Thread.sleep(2000);
			}
			totalrows++;


		}
		System.out.println("Total rows selected for deletion is: "+totalrows);


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
		String actual=previous_link.getAttribute("disabled");
		System.out.println("Disabled attr is present : "+actual);

		return actual;

	}
	public void click_firstpage() {
		if(firstpage_link.isEnabled())
		{
			firstpage_link.click();
			System.out.println("Current page no : 1");
		}

	}
	public void click_nextpagelink() {
		if(next_button.isEnabled())
			next_button.click();

	}
	public String get_pageno() {
		page_buttons=driver.findElements(By.xpath("//span[@class='p-paginator-pages ng-star-inserted']/button"));
		String currentpage_no="";
		for(int page=1;page<=page_buttons.size();page++)
		{
			WebElement pageno_btn=driver.findElement(By.xpath("//span[@class='p-paginator-pages ng-star-inserted']/button["+page+"]"));
			waitUntillVisibilityOf(pageno_btn);
			String classvalue=pageno_btn.getAttribute("class");
			if(classvalue.contains("p-highlight"))
			{
				currentpage_no=pageno_btn.getText();
				System.out.println("Current page no is : "+currentpage_no);
			}

		}


		return currentpage_no;
	}
	public void click_previouspagelink() {
		if(previous_link_enabled.isEnabled())
			previous_link_enabled.click();
	}
	public void goto_lastpage() {

		waitUntillVisibilityOf(lastpage_link);
		lastpage_link.click();
	}
	public String check_nextpagelink() {
		String actual=next_link.getAttribute("disabled");
		System.out.println("Disabled attr is present : "+actual);
		return actual;
	}

	//Ascending order feature
	public void click_AscArrow_inpgmName() throws InterruptedException {
		waitUntillVisibilityOf(btn_AscArrow_pgmname);
		btn_AscArrow_pgmname.click();
		Thread.sleep(2000);
	}
	public void click_AscArrow_inpgmDesc() throws InterruptedException {
		waitUntillVisibilityOf(btn_AscArrow_pgmdesc);
		btn_AscArrow_pgmdesc.click();
		Thread.sleep(2000);

	}
	public void click_AscArrow_inpgmStatus() throws InterruptedException {
		waitUntillVisibilityOf(btn_AscArrow_pgmstatus);
		btn_AscArrow_pgmstatus.click();
		Thread.sleep(2000);

	}
	//descorder feature
	public void click_descArrow_inpgmName() throws InterruptedException {
		waitUntillVisibilityOf(btn_AscArrow_pgmname);
		btn_AscArrow_pgmname.click();
		btn_AscArrow_pgmname.click();

		Thread.sleep(2000);
	}
	public void click_descArrow_inpgmDesc() throws InterruptedException {
		waitUntillVisibilityOf(btn_AscArrow_pgmdesc);
		btn_AscArrow_pgmdesc.click();
		btn_AscArrow_pgmdesc.click();
		Thread.sleep(2000);

	}
	public void click_descArrow_inpgmStatus() throws InterruptedException {
		waitUntillVisibilityOf(btn_AscArrow_pgmstatus);
		btn_AscArrow_pgmstatus.click();
		btn_AscArrow_pgmstatus.click();

		Thread.sleep(2000);

	}
	
	public void view_results_forpgmName() {
		
		
		int flag=0;
		int totalpages=1;
		while(flag==0)
		{
			List<WebElement> currentpagerecords =driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
			String[] actual = new String[currentpagerecords.size()]; 
			String[] sorted = new String[currentpagerecords.size()];

			for (int row = 0; row < currentpagerecords.size(); row++) 
			{
				int recordno=row+1;
				actual[row]=sorted[row] = driver.findElement(By.xpath("//table/tbody/tr["+recordno+"]/td[2]")).getText();
			}
          
			//Sorting the array
			Arrays.sort(sorted,Collator.getInstance());
			System.out.println("*****In Page no  "+totalpages+":*****");
			System.out.println("Actual values are:");
			for(String x:actual)
				System.out.println(x);
			System.out.println("Expected values are:");
			for(String x:sorted)
				System.out.println(x);
			//Validating the existing with sorted array. shows no message if both are same
			for(int row = 0;row<currentpagerecords.size();row++)
			{
				
				if(!actual[row].equals(sorted[row]))
				{
					int recordno=row+1;
					
					System.out.println("At Row "+recordno+":expected= "+sorted[row]+" but actual ="+actual[row]);

				}
				
			}
			if(next_button.isEnabled())
			{
				totalpages++;
				flag=0;
				next_button.click();
				waitUntillVisibilityOf(next_button);

			}
			else
				flag=1;

		}
		
		
	}
	
	
public void view_descresults_forpgmName() {
		
		
		int flag=0;
		int totalpages=1;
		while(flag==0)
		{
			List<WebElement> currentpagerecords =driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
			String[] actual = new String[currentpagerecords.size()]; 
			String[] sorted = new String[currentpagerecords.size()];

			for (int row = 0; row < currentpagerecords.size(); row++) 
			{
				int recordno=row+1;
				actual[row]=sorted[row] = driver.findElement(By.xpath("//table/tbody/tr["+recordno+"]/td[2]")).getText();
			}
          
			//Sorting the array
			Arrays.sort(sorted,Collections.reverseOrder());
			System.out.println("*****In Page no  "+totalpages+":*****");
			System.out.println("Actual values are:");
			for(String x:actual)
				System.out.println(x);
			System.out.println("Expected values are:");
			for(String x:sorted)
				System.out.println(x);
			//Validating the existing with sorted array. shows no message if both are same
			for(int row = 0;row<currentpagerecords.size();row++)
			{
				
				if(!actual[row].equals(sorted[row]))
				{
					int recordno=row+1;
					
					System.out.println("At Row "+recordno+":expected= "+sorted[row]+" but actual ="+actual[row]);

				}
				
			}
			if(next_button.isEnabled())
			{
				totalpages++;
				flag=0;
				next_button.click();
				waitUntillVisibilityOf(next_button);

			}
			else
				flag=1;

		}
		
		
	}
	
	
	
	
	
	public void view_results_forpgmDesc() {
		int flag=0;
		int totalpages=1;
		while(flag==0)
		{
			List<WebElement> currentpagerecords =driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
			String[] actual = new String[currentpagerecords.size()]; 
			String[] sorted = new String[currentpagerecords.size()];

			for (int row = 0; row < currentpagerecords.size(); row++) 
			{
				int recordno=row+1;
				actual[row]=sorted[row] = driver.findElement(By.xpath("//table/tbody/tr["+recordno+"]/td[3]")).getText();
			}
          
			//Sorting the array
			Arrays.sort(sorted,Collator.getInstance());
			System.out.println("*****In Page no  "+totalpages+":*****");
			System.out.println("Actual values are:");
			for(String x:actual)
				System.out.println(x);
			System.out.println("Expected values are:");
			for(String x:sorted)
				System.out.println(x);
			//Validating the existing with sorted array. shows no message if both are same
			for(int row = 0;row<currentpagerecords.size();row++)
			{
				
				if(!actual[row].equals(sorted[row]))
				{
					int recordno=row+1;
					
					System.out.println("At Row "+recordno+":expected= "+sorted[row]+" but actual ="+actual[row]);

				}
				
			}
			if(next_button.isEnabled())
			{
				totalpages++;
				flag=0;
				next_button.click();
				waitUntillVisibilityOf(next_button);

			}
			else
				flag=1;

		}

	}
	
	
	public void view_descresults_forpgmDesc() {
		int flag=0;
		int totalpages=1;
		while(flag==0)
		{
			List<WebElement> currentpagerecords =driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
			String[] actual = new String[currentpagerecords.size()]; 
			String[] sorted = new String[currentpagerecords.size()];

			for (int row = 0; row < currentpagerecords.size(); row++) 
			{
				int recordno=row+1;
				actual[row]=sorted[row] = driver.findElement(By.xpath("//table/tbody/tr["+recordno+"]/td[3]")).getText();
			}
          
			//Sorting the array
			Arrays.sort(sorted,Collections.reverseOrder());
			System.out.println("*****In Page no  "+totalpages+":*****");
			System.out.println("Actual values are:");
			for(String x:actual)
				System.out.println(x);
			System.out.println("Expected values are:");
			for(String x:sorted)
				System.out.println(x);
			//Validating the existing with sorted array. shows no message if both are same
			for(int row = 0;row<currentpagerecords.size();row++)
			{
				
				if(!actual[row].equals(sorted[row]))
				{
					int recordno=row+1;
					
					System.out.println("At Row "+recordno+":expected= "+sorted[row]+" but actual ="+actual[row]);

				}
				
			}
			if(next_button.isEnabled())
			{
				totalpages++;
				flag=0;
				next_button.click();
				waitUntillVisibilityOf(next_button);

			}
			else
				flag=1;

		}

	}
	public void view_results_forpgmStatus() {
		int flag=0;
		int totalpages=1;
		while(flag==0)
		{
			List<WebElement> currentpagerecords =driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
			String[] actual = new String[currentpagerecords.size()]; 
			String[] sorted = new String[currentpagerecords.size()];

			for (int row = 0; row < currentpagerecords.size(); row++) 
			{
				int recordno=row+1;
				actual[row]=sorted[row] = driver.findElement(By.xpath("//table/tbody/tr["+recordno+"]/td[4]")).getText();
			}
          
			//Sorting the array
			Arrays.sort(sorted,Collator.getInstance());
			System.out.println("*****In Page no  "+totalpages+":*****");
			System.out.println("Actual values are:");
			for(String x:actual)
				System.out.println(x);
			System.out.println("Expected values are:");
			for(String x:sorted)
				System.out.println(x);
			//Validating the existing with sorted array. shows no message if both are same
			for(int row = 0;row<currentpagerecords.size();row++)
			{
				
				if(!actual[row].equals(sorted[row]))
				{
					int recordno=row+1;
					
					System.out.println("At Row "+recordno+":expected= "+sorted[row]+" but actual ="+actual[row]);

				}
				
			}
			if(next_button.isEnabled())
			{
				totalpages++;
				flag=0;
				next_button.click();
				waitUntillVisibilityOf(next_button);

			}
			else
				flag=1;

		}

	}

	
	
	public void view_descresults_forpgmStatus() {
		int flag=0;
		int totalpages=1;
		while(flag==0)
		{
			List<WebElement> currentpagerecords =driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
			String[] actual = new String[currentpagerecords.size()]; 
			String[] sorted = new String[currentpagerecords.size()];

			for (int row = 0; row < currentpagerecords.size(); row++) 
			{
				int recordno=row+1;
				actual[row]=sorted[row] = driver.findElement(By.xpath("//table/tbody/tr["+recordno+"]/td[4]")).getText();
			}
          
			//Sorting the array
			Arrays.sort(sorted,Collections.reverseOrder());
			System.out.println("*****In Page no  "+totalpages+":*****");
			System.out.println("Actual values are:");
			for(String x:actual)
				System.out.println(x);
			System.out.println("Expected values are:");
			for(String x:sorted)
				System.out.println(x);
			//Validating the existing with sorted array. shows no message if both are same
			for(int row = 0;row<currentpagerecords.size();row++)
			{
				
				if(!actual[row].equals(sorted[row]))
				{
					int recordno=row+1;
					
					System.out.println("At Row "+recordno+":expected= "+sorted[row]+" but actual ="+actual[row]);

				}
				
			}
			if(next_button.isEnabled())
			{
				totalpages++;
				flag=0;
				next_button.click();
				waitUntillVisibilityOf(next_button);

			}
			else
				flag=1;

		}

	}

}




























