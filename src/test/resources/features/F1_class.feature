Feature: Manage Class Page Verification

  Background: Logged on the LMS portal as Admin
    Given Admin is on dashboard page after Login

  @tag1
  Scenario: Verify landing in class page
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see URL with "Manage Class"

  @tag2
  Scenario: Capture the response time to navigate to manage class page
    When Admin clicks "Class" button on the navigation bar
    Then Get the response time for navigation from dashboard page to manage class page

  @tag3
  Scenario: Verify Manage Class Page Header
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see header with "Manage Class"

  @tag4
  Scenario: Validate text in manage class page
    When Admin clicks "Class" button on the navigation bar and get all text from the portal page
    Then Admin should see correct spelling for the all the fields

  @tag5
  Scenario: Verify delete icon below the header
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see disabled delete icon below the "Manage Class"

  @tag6
  Scenario: Verify search bar on the class page
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see search bar on the class page

  @tag7
  Scenario: Verify add new class button  on class page
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see +Add New Class button on the class page

  @tag8
  Scenario Outline: Verify data table on the class page
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see data table on the Manage Class Page With following column headers. 
    Examples:
    |coulumn headers|
    |Check box symbol|
    |Batch Id|
    |Class No|
    |Class Date|
    |Class Topic|
    |Staff Id|
    |Description|
    |Comments|
    |Notes|
    |Recording|
    |Edit Delete|
    
  @tag9
  Scenario: Verify Edit icon in the data table
    When Admin clicks "Class" button on the navigation bar
    Then Edit Icon in each row of data table only  when entries are available

  @tag10
  Scenario: Verify Edit icon when no data in the table
    When Admin clicks "Class" button on the navigation bar
    Then Edit Icon will not be present in data table

  @tag11
  Scenario: Verify delete icon in the data table
    When Admin clicks "Class" button on the navigation bar
    Then Delete Icon in each row of data table only  when entries are available

  @tag12
  Scenario: Verify delete icon when no data in the table
    When Admin clicks "Class" button on the navigation bar
    Then Admin cant see delete  Icon in data table

  @tag13
  Scenario: Verify sort icon in the data table
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see sort icon near the column headers except for Edit and Delete

  @tag14
  Scenario: Verify check box in the data table
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see check box in the all rows  of data table

  @tag15
  Scenario: Validate the number entries displaying
    When Admin clicks "Class" button on the navigation bar
    Then Above the footer Admin should see the text as "Showing x to y of z entries" below the table. x- starting record number on that pagey-ending record number on that pagez-Total number of records  Note: with or without entries"

  @tag16
  Scenario: Verify Pagination control below the data table
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see the pagination controls under the data table

  @tag17
  Scenario: Validate footer  text
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see the text with total number classes in the data table. ( " In total there are number of classes")

  # Pagination
  @tag18
  Scenario: Verify sheet one is displayed on default in data table
    When Admin clicks "Class" button on the navigation bar
    Then Data table should display 1 page  when entries available

  Scenario: Verify  right arrow is enable when sheet one is displayed in data table
    When Admin clicks "Class" button on the navigation bar
    Then Right arrow should be enabled in page one  when entries are more than 5 available

  Scenario: Verify  left arrow is disable when sheet one is displayed in data table
    When Admin clicks "Class" button on the navigation bar
    Then Left arrow should be disabled in page one  when entries are more than 5 available

  Scenario: Verify  right arrow is enable when sheet two is displayed in data table when entries are more than 10
    When Admin clicks "Class" button on the navigation bar
    Then Right arrow should be enabled in page two when entries are more than 10 available

  Scenario: Verify  left arrow is enable when sheet two is displayed in data table
    When Admin clicks "Class" button on the navigation bar
    Then Left arrow should be enabled in page two

  Scenario: Verify  right arrow is disable when sheet two is displayed in data table when entries are less than 10
    When Admin clicks "Class" button on the navigation bar
    Then Data table should display  page 1  when entries available

  Scenario: Verify pagination controls enabled
    When Admin clicks "Class" button on the navigation bar
    Then when entries are more than 5 in data table pagination controls enabled

  Scenario: Verify pagination controls disabled
    When Admin clicks "Class" button on the navigation bar
    Then when entries are less than 5 in data table pagination controls disabled
 