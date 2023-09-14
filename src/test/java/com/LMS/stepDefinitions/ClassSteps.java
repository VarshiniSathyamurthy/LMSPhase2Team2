package com.LMS.stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.LMS.Utils.ExcelReader;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;

import com.LMS.DriverFactory.DriverFactory;
import com.LMS.Pages.ClassPage;
import com.LMS.Utils.LoggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClassSteps {
	
	private static final String String = null;
	ClassPage CP=new ClassPage();
	DriverFactory driver;
	ExcelReader reader=new ExcelReader();
	String text;;
///////// Feature 1- Manage Class Page Verification, Pagination////////////////////
	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
		DriverFactory.getDriver().get("https://lmsportalapp.herokuapp.com/login");
		/*rp.enterusername("pluton@gmail.com");
		lp.enterpassword("Nnsdet@115");
		lp.clicklogin();
		LoggerLoad.info("The user is in the Home page after logged in");*/
		DriverFactory.getDriver().get("https://lmsportalapp.herokuapp.com/dashboardprogram");
	}
	@When("Admin clicks {string} button on the navigation bar")
	public void admin_clicks_button_on_the_navigation_bar(String string) {
	    CP.ClickClass();
	}
	@Then("Admin should see URL with {string}")
	public void admin_should_see_url_with(String expectedurlstring) {
	   CP.validateurlstring();
	 	}

	@Then("Get the response time for navigation from dashboard page to manage class page")
	public void get_the_response_time_for_navigation_from_dashboard_page_to_manage_class_page() {
	    CP.LoadClass();
	}

	@Then("Admin should see header with {string}")
	public void admin_should_see_header_with(String header) {
		 String text= CP.header(header);
		  Assert.assertEquals(text,header);   
	}

	@When("Admin clicks {string} button on the navigation bar and get all text from the portal page")
	public void admin_clicks_button_on_the_navigation_bar_and_get_all_text_from_the_portal_page(String string) {
	    
	}

	@Then("Admin should see correct spelling for the all the fields")
	public void admin_should_see_correct_spelling_for_the_all_the_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see disabled delete icon below the {string}")
	public void admin_should_see_disabled_delete_icon_below_the(String header) {
		boolean value=CP.deletedisabled();
		Assert.assertFalse(value);
	}

	@Then("Admin should see search bar on the class page")
	public void admin_should_see_search_bar_on_the_class_page() {
	    CP.Search();
	}

	@Then("Admin should see +Add New Class button on the class page")
	public void admin_should_see_add_new_class_button_on_the_class_page() {
	   CP.AddNewClass();
	}

	@Then("Admin should see data table on the Manage Class Page With following column headers.")
	public void admin_should_see_data_table_on_the_manage_class_page_with_following_column_headers(String columnheaders) {
	CP.columnnames(columnheaders);
	}
	@Then("Edit Icon in each row of data table only  when entries are available")
	public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available() {
	   
	}

	@Then("Edit Icon will not be present in data table")
	public void edit_icon_will_not_be_present_in_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Delete Icon in each row of data table only  when entries are available")
	public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin cant see delete  Icon in data table")
	public void admin_cant_see_delete_icon_in_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see sort icon near the column headers except for Edit and Delete")
	public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete() {
	    CP.Sortarrowdisplaycheck();
	}

	@Then("Admin should see check box in the all rows  of data table")
	public void admin_should_see_check_box_in_the_all_rows_of_data_table() {
	    CP.Validaterowcheckbox();
	}

	@Then("Above the footer Admin should see the text as {string} below the table. x- starting record number on that pagey-ending record number on that pagez-Total number of records  Note: with or without entries\"")
	public void above_the_footer_admin_should_see_the_text_as_below_the_table_x_starting_record_number_on_that_pagey_ending_record_number_on_that_pagez_total_number_of_records_note_with_or_without_entries(String string) {
	    CP.VerifyPaginationText();
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
	   CP.VerifyPaginationarrows();
	}

	@Then("Admin should see the text with total number classes in the data table. \\( {string})")
	public void admin_should_see_the_text_with_total_number_classes_in_the_data_table(String string) {
	    CP.VerifyTotalClassText();
	}
	@Then("Data table should display {int} page  when entries available")
	public void data_table_should_display_page_when_entries_available(Integer int1) {
	    CP.findnofrowsintable();
	}

	@Then("Right arrow should be enabled in page one  when entries are more than {int} available")
	public void right_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_available(Integer int1) {
		CP.findnofrowsintable();
	}

	@Then("Left arrow should be disabled in page one  when entries are more than {int} available")
	public void left_arrow_should_be_disabled_in_page_one_when_entries_are_more_than_available(Integer int1) {
		CP.findnofrowsintable();
	}

	@Then("Right arrow should be enabled in page two when entries are more than {int} available")
	public void right_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_available(Integer int1) {
		CP.findnofrowsintable();
	}

	@Then("Left arrow should be enabled in page two")
	public void left_arrow_should_be_enabled_in_page_two() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

/*	@Then("Data table should display  page {int}  when entries available")
	public void data_table_should_display_page_when_entries_available(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/

	@Then("when entries are more than {int} in data table pagination controls enabled")
	public void when_entries_are_more_than_in_data_table_pagination_controls_enabled(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("when entries are less than {int} in data table pagination controls disabled")
	public void when_entries_are_less_than_in_data_table_pagination_controls_disabled(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

//Feature 2- Class detail Popup ,Search box , Edit Class, Delete Class and Multiple Class, Sort, Navigation ////////////////////
	
	@When("Admin click +Add New Class button")
	public void admin_click_add_new_class_button() {
	    CP.ClickAddClass();
	}

	@Then("Admin should see a popup  with  heading {string}")
	public void admin_should_see_a_popup_with_heading(String string) {
	    CP.parentWindowHandleVerificationAddClass();
	}

	@Then("Admin should see input fields")
	public void admin_should_see_input_fields() {
	    CP.FieldnamesClass(String);
	}


	@Then("{int} textbox should be  present in Class details popup window")
	public void textbox_should_be_present_in_class_details_popup_window(Integer int1) {
	   CP.TextFields();
	}

	@Then("Admin should see  dropdown option for Batch ID")
	public void admin_should_see_dropdown_option_for_batch_id() {
	    CP.BtachIdDropdown();
	}

	@Then("Admin should see  dropdown option for Staff Id")
	public void admin_should_see_dropdown_option_for_staff_id() {
	   CP.StaffIdDropdown();
	}

	@Then("Admin should see  calendar icon for class date")
	public void admin_should_see_calendar_icon_for_class_date() {
        CP.ClassDateDropdown();
	}

	@Then("Admin should see save button in the class detail popup window")
	public void admin_should_see_save_button_in_the_class_detail_popup_window() {
	    CP.SaveButtonExist();
	}

	@Then("Admin should see cancel button in the class detail popup window")
	public void admin_should_see_cancel_button_in_the_class_detail_popup_window() {
		CP.CancelButtonExist();
	}

	@Then("Admin should see  close button on the class details popup window")
	public void admin_should_see_close_button_on_the_class_details_popup_window() {
		CP.CloseButtonExist();
	}
	@When("Admin enters batch id into search box")
	public void admin_enters_batch_id_into_search_box(String sheetname,int rownumber) throws InvalidFormatException, IOException {
		List<Map<String,String>> data=reader.getData("./LMSPhase2Team2/src/test/resources/TestData/dsalgoTestData.xlsx" , sheetname);
		String cellvalue1=data.get(rownumber).get("testData");
		CP.ValidateSearch(cellvalue1);
		LoggerLoad.info("The user gets input from sheet {string} and {int}"); 
	}

	@Then("Displays entries with that batch Id")
	public void displays_entries_with_that_batch_id() {
	    boolean value=CP.batchidsearch();
	    Assert.assertEquals(value,true);
	}

	@When("Admin enters batch id which is not existing the table into search box")
	public void admin_enters_batch_id_which_is_not_existing_the_table_into_search_box(String sheetname,int rownumber) throws InvalidFormatException, IOException {
		List<Map<String,String>> data=reader.getData("./LMSPhase2Team2/src/test/resources/TestData/dsalgoTestData.xlsx" , sheetname);
		String cellvalue1=data.get(rownumber).get("testData");
		CP.ValidateSearch(cellvalue1);
		LoggerLoad.info("The user gets input from sheet {string} and {int}"); 
	}

	@Then("Displays empty details in the data table")
	public void displays_empty_details_in_the_data_table() {
	    CP.invalidsearch();
	}

	@When("Admin enters class no into search box")
	public void admin_enters_class_no_into_search_box(String sheetname,int rownumber) throws InvalidFormatException, IOException {
		List<Map<String,String>> data=reader.getData("./LMSPhase2Team2/src/test/resources/TestData/dsalgoTestData.xlsx" , sheetname);
		String cellvalue1=data.get(rownumber).get("testData");
		CP.ValidateSearch(cellvalue1);
		LoggerLoad.info("The user gets input from sheet {string} and {int}");
	}

	@Then("Displays entries with that class no")
	public void displays_entries_with_that_class_no() {
	    boolean value=CP.classnosearch();
	    Assert.assertEquals(value,true);
	}

	@When("Admin enters class no which is not existing the table into search box")
	public void admin_enters_class_no_which_is_not_existing_the_table_into_search_box(String sheetname,int rownumber) throws InvalidFormatException, IOException {
		List<Map<String,String>> data=reader.getData("./LMSPhase2Team2/src/test/resources/TestData/dsalgoTestData.xlsx" , sheetname);
		String cellvalue1=data.get(rownumber).get("testData");
		CP.ValidateSearch(cellvalue1);
		LoggerLoad.info("The user gets input from sheet {string} and {int}"); 
	}

	@When("Admin enters class topic into search box")
	public void admin_enters_class_topic_into_search_box(String sheetname,int rownumber) throws InvalidFormatException, IOException {
		List<Map<String,String>> data=reader.getData("./LMSPhase2Team2/src/test/resources/TestData/dsalgoTestData.xlsx" , sheetname);
		String cellvalue1=data.get(rownumber).get("testData");
		CP.ValidateSearch(cellvalue1);
		LoggerLoad.info("The user gets input from sheet {string} and {int}");
	}
	

	@Then("Displays entries with that  class topic")
	public void displays_entries_with_that_class_topic() {
	    boolean value=CP.classtopicsearch();
	    Assert.assertEquals(value,true);
	}

	@When("Admin enters class topic which is not existing the table into search box")
	public void admin_enters_class_topic_which_is_not_existing_the_table_into_search_box(String sheetname,int rownumber) throws InvalidFormatException, IOException {
		List<Map<String,String>> data=reader.getData("./LMSPhase2Team2/src/test/resources/TestData/dsalgoTestData.xlsx" , sheetname);
		String cellvalue1=data.get(rownumber).get("testData");
		CP.ValidateSearch(cellvalue1);
		LoggerLoad.info("The user gets input from sheet {string} and {int}");
	}

	@When("Admin enters staff id into search box")
	public void admin_enters_staff_id_into_search_box(String sheetname,int rownumber) throws InvalidFormatException, IOException {
		List<Map<String,String>> data=reader.getData("./LMSPhase2Team2/src/test/resources/TestData/dsalgoTestData.xlsx" , sheetname);
		String cellvalue1=data.get(rownumber).get("testData");
		CP.ValidateSearch(cellvalue1);
		LoggerLoad.info("The user gets input from sheet {string} and {int}");
	}

	@Then("Displays entries with that  staff id")
	public void displays_entries_with_that_staff_id() {
	    boolean value=CP.staffidsearch();
	    Assert.assertEquals(value,true);
	}

	@When("Admin enters staff id which is not existing the table into search box")
	public void admin_enters_staff_id_which_is_not_existing_the_table_into_search_box(String sheetname,int rownumber) throws InvalidFormatException, IOException {
		List<Map<String,String>> data=reader.getData("./LMSPhase2Team2/src/test/resources/TestData/dsalgoTestData.xlsx" , sheetname);
		String cellvalue1=data.get(rownumber).get("testData");
		CP.ValidateSearch(cellvalue1);
		LoggerLoad.info("The user gets input from sheet {string} and {int}");
	}
	
	@When("Admin enters class date into search box")
	public void admin_enters_class_date_into_search_box(String sheetname,int rownumber) throws InvalidFormatException, IOException {
		List<Map<String,String>> data=reader.getData("./LMSPhase2Team2/src/test/resources/TestData/dsalgoTestData.xlsx" , sheetname);
		String cellvalue1=data.get(rownumber).get("testData");
		CP.ValidateSearch(cellvalue1);
		LoggerLoad.info("The user gets input from sheet {string} and {int}");
	}

	@Then("Displays entries with that  class date")
	public void displays_entries_with_that_class_date() {
	  boolean value= CP.classdatesearch();
	  Assert.assertEquals(value,true);
	   
	}

	@When("Admin enters invalid class date into search box")
	public void admin_enters_invalid_class_date_into_search_box(String sheetname,int rownumber) throws InvalidFormatException, IOException {
		List<Map<String,String>> data=reader.getData("./LMSPhase2Team2/src/test/resources/TestData/dsalgoTestData.xlsx" , sheetname);
		String cellvalue1=data.get(rownumber).get("testData");
		CP.ValidateSearch(cellvalue1);
		LoggerLoad.info("The user gets input from sheet {string} and {int}");
	
	}

	@When("Admin clicks Edit button in data table")
	public void admin_clicks_edit_button_in_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Edit popup window appears with heading Class Details")
	public void edit_popup_window_appears_with_heading_class_details() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks Edit button from one of the row in data table")
	public void admin_clicks_edit_button_from_one_of_the_row_in_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Edit popup window appears with same row values in the all fields")
	public void edit_popup_window_appears_with_same_row_values_in_the_all_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Admin clicks delete button in data table row level")
	public void admin_clicks_delete_button_in_data_table_row_level() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see alert")
	public void admin_should_see_alert() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Alert should have {string} button to accept")
	public void alert_should_have_button_to_accept(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Alert should have {string} button to reject")
	public void alert_should_have_button_to_reject(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


@When("Admin clicks single  row level check box in the data table")
public void admin_clicks_single_row_level_check_box_in_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see delete icon below the header is enabled")
public void admin_should_see_delete_icon_below_the_header_is_enabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see tick mark in check box")
public void admin_should_see_tick_mark_in_check_box() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks multiple row level check box in the data table")
public void admin_clicks_multiple_row_level_check_box_in_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see tick mark in check box  of the selected rows")
public void admin_should_see_tick_mark_in_check_box_of_the_selected_rows() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin click on Batch id column header to sort")
public void admin_click_on_batch_id_column_header_to_sort() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see data table sorted in descending order")
public void admin_should_see_data_table_sorted_in_descending_order() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin double click on Batch id column header to sort")
public void admin_double_click_on_batch_id_column_header_to_sort() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see data table sorted in ascending  order")
public void admin_should_see_data_table_sorted_in_ascending_order() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("Admin clicks {string} button in the navigation bar")
public void admin_clicks_button_in_the_navigation_bar(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should able to land on student page")
public void admin_should_able_to_land_on_student_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should able to land on program page")
public void admin_should_able_to_land_on_program_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should able to land on batch page")
public void admin_should_able_to_land_on_batch_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should able to land on user page")
public void admin_should_able_to_land_on_user_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should able to land on Assignment page")
public void admin_should_able_to_land_on_assignment_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should able to land on Attendance page")
public void admin_should_able_to_land_on_attendance_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should able to land on login page")
public void admin_should_able_to_land_on_login_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

	////////////////////Feature 3-Add New Class ////////////////////////////////
	
	@Given("Admin is in  class detail popup window")
	public void admin_is_in_class_detail_popup_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks  Batch ID dropdown")
	public void admin_clicks_batch_id_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Batch id in the drop down should match with Batch id manage batch page table")
	public void batch_id_in_the_drop_down_should_match_with_batch_id_manage_batch_page_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters all mandatory field values with valid data and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id)")
	public void admin_enters_all_mandatory_field_values_with_valid_data_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see new class details is added in the data table")
	public void admin_should_see_new_class_details_is_added_in_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters all mandatory field values with invalid data and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id, )")
	public void admin_enters_all_mandatory_field_values_with_invalid_data_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Error message should appear in alert")
	public void error_message_should_appear_in_alert() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
//Then is above
	@When("Admin enters values in all fields with valid data and clicks save button \\(Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)")
	public void admin_enters_values_in_all_fields_with_valid_data_and_clicks_save_button_batch_id_no_of_classes_class_date_class_topic_staff_id_class_description_comments_notes_recordings() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
//Then is Above
     @When("Admin enters with invalid data in optional fields and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id)")
	public void admin_enters_with_invalid_data_in_optional_fields_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters  data missing value in Batch ID and clicks save button \\(No of Classes, Class Date, Staff Id)")
	public void admin_enters_data_missing_value_in_batch_id_and_clicks_save_button_no_of_classes_class_date_staff_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Batch Id is missing")
	public void batch_id_is_missing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters data missing value in No of class and clicks save button \\(Batch ID ,  Class Date, Staff Id, )")
	public void admin_enters_data_missing_value_in_no_of_class_and_clicks_save_button_batch_id_class_date_staff_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("No of classes is missing")
	public void no_of_classes_is_missing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters data missing value in  class date and clicks save button \\(Batch ID , No of Classes, Staff Id, )")
	public void admin_enters_data_missing_value_in_class_date_and_clicks_save_button_batch_id_no_of_classes_staff_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("class date is missing")
	public void class_date_is_missing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters data missing value in staff id and clicks save button \\(Batch ID , No of Classes, Class Date )")
	public void admin_enters_data_missing_value_in_staff_id_and_clicks_save_button_batch_id_no_of_classes_class_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("staff id is missing")
	public void staff_id_is_missing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters passed date in the class date field and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id)")
	public void admin_enters_passed_date_in_the_class_date_field_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("class cannot be  created for the passed date")
	public void class_cannot_be_created_for_the_passed_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks date from date picker")
	public void admin_clicks_date_from_date_picker() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
//same when condition for the below 2 Then
	
	@Then("selected date should be their in class date text box")
	public void selected_date_should_be_their_in_class_date_text_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("selected date should be in  mm\\/dd\\/yyyy format")
	public void selected_date_should_be_in_mm_dd_yyyy_format() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks right arrow in the date picker near month")
	public void admin_clicks_right_arrow_in_the_date_picker_near_month() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Next month calender should visible")
	public void next_month_calender_should_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks left arrow in the date picker near month")
	public void admin_clicks_left_arrow_in_the_date_picker_near_month() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("previous month calender should visible")
	public void previous_month_calender_should_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks date picker button")
	public void admin_clicks_date_picker_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see current date is highled in the date picker")
	public void admin_should_see_current_date_is_highled_in_the_date_picker() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks date picker button and selects future date")
	public void admin_clicks_date_picker_button_and_selects_future_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see selected date is highled in the date picker")
	public void admin_should_see_selected_date_is_highled_in_the_date_picker() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks Cancel button without entering values in the fields")
	public void admin_clicks_cancel_button_without_entering_values_in_the_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should land on Manage Class page")
	public void admin_should_land_on_manage_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks Cancel button entering values in the fields")
	public void admin_clicks_cancel_button_entering_values_in_the_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should land on Manage Class Page and validate new class is not created in the data table")
	public void admin_should_land_on_manage_class_page_and_validate_new_class_is_not_created_in_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Admin creates {int} new class")
	public void admin_creates_new_class(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("when total class entries above {int} next page is enabled \\( On multiples of {int} new page will be enabled)")
	public void when_total_class_entries_above_next_page_is_enabled_on_multiples_of_new_page_will_be_enabled(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin creates less than or equal to {int} new class")
	public void admin_creates_less_than_or_equal_to_new_class(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("when total class entries  {int} or below next page is disabled")
	public void when_total_class_entries_or_below_next_page_is_disabled(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	///////////////////////////Feature 4-Edit class Validation///////////////////////////////
	

@Given("Admin is in  Edit class detail popup window")
public void admin_is_in_edit_class_detail_popup_window() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

/////////All  the missing when conditions and then condition are there in previous feature-Map with that.

@Then("Admin should see particular class details is updated in the data table")
public void admin_should_see_particular_class_details_is_updated_in_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("class cannot be updated for the passed date")
public void class_cannot_be_updated_for_the_passed_date() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

////////////////////////////Feature5- Delete Class validation////////////////

@Given("Admin is in delete alert")
public void admin_is_in_delete_alert() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks yes button")
public void admin_clicks_yes_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Success message and validate particular class details are deleted from the data table")
public void success_message_and_validate_particular_class_details_are_deleted_from_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks no button")
public void admin_clicks_no_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should land on manage class page and validate particular class details are not deleted from the data table")
public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_not_deleted_from_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


@Then("Admin should land on Manage Class Page and validate particular class details are not changed  in the data table")
public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_not_changed_in_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
	////////////////Feature 6-Delete multiple class validation///////////////

/////////All  the missing when conditions and then condition are there in previous feature-Map with that.

@Then("Admin should land on manage class page and validate particular class details are deleted from the data table")
public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_deleted_from_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

	
	
	
	
	

}
