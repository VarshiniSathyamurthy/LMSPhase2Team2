package com.LMS.Pages;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.LMS.DriverFactory.DriverFactory;
import com.LMS.Utils.ConfigReader;

public class ClassPage {
	
	public static WebDriver driver=DriverFactory.getDriver();
	String LMSportal="https://lmsportalapp.herokuapp.com";
	   // WebElement batchid;
	    boolean checkvalue;
		@FindBy (name="Class") WebElement ClassLink;
		@FindBy (xpath="contains text('Manage Class')") WebElement PageHeader;
		@FindBy(tagName = "body")WebElement TextsinClasspage;
		@FindBy (name="Delete") WebElement Deleteicon;
		@FindBy (name="Search") WebElement Searchbar;
		@FindBy (name="newclass") WebElement AddNewClass;
		@FindBy (id="DataTable") WebElement DataTable;
		@FindBy(tagName = "CheckBox") WebElement Headercheckbox;
		@FindBy(tagName = "BatchId") WebElement Headerbatchid;
		@FindBy(tagName = "ClassNo") WebElement Headerclassno;
		@FindBy(tagName = "ClassDate") WebElement Headerclassdate;
		@FindBy(tagName = "ClassTopic") WebElement Headerclasstopic;
		@FindBy(tagName = "StaffId") WebElement Headersatffid;
		@FindBy(tagName = "Description") WebElement Headerdescription;
		@FindBy(tagName = "Comments") WebElement Headercomments;
		@FindBy(tagName = "Notes") WebElement Headernotes;
		@FindBy(tagName = "Recording") WebElement Headerrecording;
		@FindBy(tagName = "EditDelete") WebElement Headereditdelete;
		@FindBy(xpath="//div[3]/@text()=batchid")WebElement batchidarrow;
		@FindBy(xpath="//div[3]/@text()=classno")WebElement classnoarrow;
		@FindBy(xpath="//div[3]/@text()=classdate")WebElement classdatearrow;
		@FindBy(xpath="//div[3]/@text()=classtopic")WebElement classtopicarrow;
		@FindBy(xpath="//div[3]/@text()=staffid")WebElement staffidarrow;
		@FindBy(xpath="//div[3]/@text()=description")WebElement descriptionarrow;
		@FindBy(xpath="//div[3]/@text()=comments")WebElement commentsarrow;
		@FindBy(xpath="//div[3]/@text()=notes")WebElement notesarrow;
		@FindBy(xpath="//div[3]/@text()=recording")WebElement recordingarrow;
		@FindBy(name="Edit") WebElement RowEdit;
		@FindBy(name="Delete") WebElement RowDelete;
		@FindBy (xpath="contains text('Sort')") WebElement Sortarrow;
		@FindBy(name="CheckBox") WebElement RowcehckBox;
		@FindBy (xpath="contains text('Showing Page')") WebElement PaginationText;
		@FindBy (name="paginationcontrol")WebElement paginationcontrol;
		@FindBy (name="rightarrow")WebElement rightarrow;
		@FindBy (name="leftarrow")WebElement leftarrow;
		@FindBy (xpath="div[5]/t[1]")WebElement page1;
		@FindBy (xpath="contains text('TotalClass')") WebElement TotalClass;
		@FindBy (xpath="contains text('Class Details')") WebElement NewclassPopup;
		@FindBy (name="FieldBatchId")WebElement FieldBatchid;
		@FindBy (xpath="")WebElement FieldBatchidValue;
		@FindBy (name="FieldNoOfClasses")WebElement FieldNoOfClasses;
		@FindBy (name="FieldClassDate")WebElement FieldClassDate;
		@FindBy (xpath="")WebElement FieldClassDateValue;
		@FindBy (name="FieldClassTopic")WebElement FieldClassTopic;
		@FindBy (name="FieldStaffId")WebElement FieldStaffid;
		@FindBy (xpath="")WebElement FieldStaffidValue;
		@FindBy (name="FieldClassDescription")WebElement FieldClassDescription;
		@FindBy (name="FieldComments")WebElement FieldComments;
		@FindBy (name="FieldNotes")WebElement FieldNotes;
		@FindBy (name="FieldRecordings")WebElement FieldRecordings;
		@FindBy (xpath="//button/div/contains text('Save')") WebElement SavebtnClasspopup;
		@FindBy (xpath="//button/div/contains text('Cancel')") WebElement CancelbtnClasspopup;
		@FindBy (xpath="//button/div/contains text('Close')") WebElement ClosebtnClasspopup;
		@FindBy(xpath="//tab[@id='table']/tbody/tr/td[2]") List<WebElement> batchidtablerows;
		@FindBy(xpath="//tab[@id='table']/tbody/tr/td[3]") List<WebElement> classnotablerows;
		@FindBy(xpath="//tab[@id='table']/tbody/tr/td[4]") List<WebElement> classtopictablerows;
		@FindBy(xpath="//tab[@id='table']/tbody/tr/td[4]") List<WebElement> staffidtablerows;
		@FindBy(xpath="//tab[@id='table']/tbody/tr/td[4]") List<WebElement> classdatetablerows;
	
		
		public ClassPage()
		{
			PageFactory.initElements(driver,this);
		}
		public void ClickClass() {
			ClassLink.click();
			}
		public void validateurlstring() {
			 String expectedurlstring="Manage class";
			 String Actualurl=driver.getCurrentUrl();
			 Assert.assertEquals(expectedurlstring,Actualurl.contains(expectedurlstring));
		}
		public void LoadClass() {
			 long startTime = System.currentTimeMillis();
			 ClassLink.click();
			 // Wait for the new page to fully load
			 // Calculate and print the response time
			 long endTime = System.currentTimeMillis();
			 long pageLoadTime = endTime - startTime;
			 System.out.println("Page load time: " + pageLoadTime + " milliseconds");
				}
				
		public String header(String heading) //PageHeader
		{
			String value = null;
			
			switch(heading) {
			case "Manage Class" : value= PageHeader.getText();
			}
			return value;
		}
			public boolean deletedisabled() //Deleteicon
			{
				return  Deleteicon.isEnabled();
		}
			
		public void Search() ////Searchbar;
		{
			boolean search=Searchbar.isDisplayed();
			if(search) {
				System.out.println("Search bar is present");
			}
			else {
				System.out.println("No Search bar");
			}
		}
		public void AddNewClass()//AddNewClass
		{
			boolean addNewClass=AddNewClass.isDisplayed();
			if(addNewClass) {
				System.out.println("AddNewClass button is present");
			}
			else {
				System.out.println("No AddNewClass");
			}
		}
		public void  findnofrowsintable() //DataTable
		{
			List<WebElement> totalrows =DataTable.findElements(By.tagName("tr"));
			int totalnoofrows=totalrows.size();
			
			
			if(totalnoofrows==5) {
				rightarrow.click();
				leftarrow.isEnabled();
			}else if(totalnoofrows<5&&rightarrow.isEnabled()){
			{
				 checkvalue=true;
				Assert.assertFalse(checkvalue);
			}
			}
			
		}
		public void columnnames(String headername) // columnnames
		{
			
			switch(headername) {
			
			case "Check box symbol": Headercheckbox.isDisplayed();break;
			case "Batch Id": Headerbatchid.isDisplayed();break;
			case "Class No": Headerclassno.isDisplayed();break;
			case "Class Date":Headerclassdate.isDisplayed();break;
			case "Class Topic": Headerclasstopic.isDisplayed();break;
			case "Staff Id":  Headersatffid.isDisplayed();break;
			case "Description":  Headerdescription.isDisplayed();break;
			case "Comments":  Headercomments.isDisplayed();break;
			case "Notes":  Headernotes.isDisplayed();break;
			case "Recording":  Headerrecording.isDisplayed();break;
			case "Edit Delete":  Headereditdelete.isDisplayed();
			}		
		}
		public boolean Sortarrowdisplaycheck() //sort arrow
		{
			if(batchidarrow.isDisplayed() && classnoarrow.isDisplayed() && classdatearrow.isDisplayed()&& classtopicarrow.isDisplayed()&&staffidarrow.isDisplayed()
					&& descriptionarrow.isDisplayed()&& commentsarrow.isDisplayed()&& notesarrow.isDisplayed()&& recordingarrow.isDisplayed()) {
				return true;
			}
				else 
				return false;
			}
		//RowcehckBox
		public boolean Validaterowcheckbox() {
			int rows =DataTable.findElements(By.tagName("tr")).size();
		   
		    for(int i=1;i<rows;i++) {
		    	if(RowcehckBox.get(i).isDisplayed())
		    	{
		    		
		    		checkvalue=true;
		    	}
		    	else
		    		checkvalue=false;
		    	break;
		}
		    return checkvalue;
		}
		public boolean validaterowedit() //RowEdit
		{
			int rows =DataTable.findElements(By.tagName("tr")).size();
			for(int i=1;i<rows;i++) {
		    	if(RowEdit.get(i).isDisplayed()) {
		    		
		    		checkvalue=true;
		    	}
		    	else
		    		checkvalue=false;
		    	break;
		}
		    return checkvalue;	
		    	}
		
		public void VerifyPaginationText() //PaginationText
		{
			
			if (PaginationText.isDisplayed()) {
				String paginationText=PaginationText.getText();
				System.out.println("PaginationText Present:"+ paginationText);
			}
			 }
		
        public void VerifyPaginationarrows() //rightarrow, leftarrow
        {
	 Boolean paginationarrows = rightarrow.isEnabled()&&leftarrow.isEnabled();
		 System.out.println("paginationarrows present is " );
		}
        public void VerifyTotalClassText()  //TotalClass
        {
        	
        	if (TotalClass.isDisplayed())
        	{
        		String TotlclassText=TotalClass.getText();
        		System.out.println(TotlclassText);
        	}
        	
        	}
		public void ClickAddClass() {
			AddNewClass.click();
    		
				}
		public Boolean parentWindowHandleVerificationAddClass() {

			// Get the current window handle (parent window)
			String parentWindowHandle = driver.getWindowHandle();

			// Locate and click the link that opens a new window
			AddNewClass.click();
			// Find all window handles currently open by the WebDriver
			Set<String> windowHandles = driver.getWindowHandles();

			// Switch to the new window
			for (String windowHandle : windowHandles) {
				if (!windowHandle.equals(parentWindowHandle)) {
					driver.switchTo().window(windowHandle);
					break;
				}
			}
			
			String PopupName=NewclassPopup.getText();
			System.out.println(PopupName);
			
			return true;
		}
		public void FieldnamesClass(String fieldnames) // columnnames
		{
			
			switch(fieldnames) {
			
			case "Batch ID": FieldBatchid.isDisplayed();break;
			case "No of Classes": FieldNoOfClasses.isDisplayed();break;
			case "Class Date": FieldClassDate.isDisplayed();break;
			case "Class Topic": FieldClassTopic.isDisplayed();break;
			case "Staff Id":  FieldStaffid.isDisplayed();break;
			case "Class Description":  FieldClassDescription.isDisplayed();break;
			case "Comments":  FieldComments.isDisplayed();break;
			case "Notes":  FieldNotes.isDisplayed();break;
			case "Recording":  FieldRecordings.isDisplayed();
			
			}
			}	
			public void BtachIdDropdown() //dropdown
			{
				FieldBatchid.click();
				FieldBatchidValue.click();
							
			}
			public void ClassDateDropdown()
			{
				FieldClassDate.click();
				FieldClassDateValue.click();
			}
			public void StaffIdDropdown()
			{
				FieldStaffid.click();
				FieldStaffidValue.click();
				
			}
			public void TextFields() { //Textbox
				FieldNoOfClasses.click();
				FieldClassTopic.click();
				FieldClassDescription.click();
				FieldComments.click();
				FieldNotes.click();
				FieldRecordings.click();
				
			}
			public void SaveButtonExist() //Save
			{
				SavebtnClasspopup.isDisplayed();
			}
			public void CancelButtonExist() //Cancel
			{
				CancelbtnClasspopup.isDisplayed();
			}
			public void CloseButtonExist() //close
			{
				ClosebtnClasspopup.isDisplayed();
				
			}
			public void ValidateSearch(String data)//Search functionality
						{
				Searchbar.sendKeys(data);
						
			}
			public boolean batchidsearch() {
											
				for( int i=0;i<batchidtablerows.size();i++) {
					
					if(batchidtablerows.get(i).getText().contains(Searchbar.getText())) {
						checkvalue=true;
					}
					else
						checkvalue=false;
					break;
			    }
				return true;
				
				}
			public boolean invalidsearch() {
				
				int rows =DataTable.findElements(By.tagName("tr")).size();
				if(rows==0) 
				return true;
				else
					return false;
			    }
			public boolean classnosearch() {
							
				for( int i=0;i<batchidtablerows.size();i++) {
					
					if(classnotablerows.get(i).getText().contains(Searchbar.getText())) {
						checkvalue=true;
					}
					else
						checkvalue=false;
					break;
			    }
				return true;
				
				}
			public boolean classtopicsearch() {
				
				for( int i=0;i<classtopictablerows.size();i++) {
					
					if(classtopictablerows.get(i).getText().contains(Searchbar.getText())) {
						checkvalue=true;
					}
					else
						checkvalue=false;
					break;
			    }
				return true;
				
				}
public boolean staffidsearch() {
				
				for( int i=0;i<staffidtablerows.size();i++) {
					
					if(staffidtablerows.get(i).getText().contains(Searchbar.getText())) {
						checkvalue=true;
					}
					else
						checkvalue=false;
					break;
			    }
				return true;
				
				}
public boolean classdatesearch() {
	
	for( int i=0;i<classdatetablerows.size();i++) {
		
		if(classdatetablerows.get(i).getText().contains(Searchbar.getText())) {
			checkvalue=true;
		}
		else
			checkvalue=false;
		break;
    }
	return true;
	
	}
                      //RowEdit
			
			}
		
		
		


			 
		
		
		


