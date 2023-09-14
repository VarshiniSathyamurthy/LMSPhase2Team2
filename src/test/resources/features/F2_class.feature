Feature: Class detail Popup window verification

  Background: Admin logged into LMS portal and clicks class button on the navigation bar
    Given Admin is on Manage Class Page

  @tag1
  Scenario: Verify class details popup window
    When Admin click +Add New Class button
    Then Admin should see a popup  with  heading "class details"

  @tag2
  Scenario Outline: Verify input fields in class details popup window
    When Admin click +Add New Class button
    Then Admin should see input fields 
    Examples:
    |Batch ID|
    |No of Classes|
    |Class Date| 
    |Class Topic| 
    |Staff Id| 
    |Class description| 
    |Comments| 
    |Notes| 
    |Recordings|
    
  @tag3
  Scenario: Verify text box present in class details popup window
    When Admin click +Add New Class button
    Then 6 textbox should be  present in Class details popup window

  @tag4
  Scenario: Verify drop down in Batch Id  in class details popup window
    When Admin click +Add New Class button
    Then Admin should see  dropdown option for Batch ID

  @tag5
  Scenario: Verify drop down in Staff Id  in class details popup window
    When Admin click +Add New Class button
    Then Admin should see  dropdown option for Staff Id

  @tag6
  Scenario: Verify calendar icon in class date  in class details popup window
    When Admin click +Add New Class button
    Then Admin should see  calendar icon for class date

  @tag7
  Scenario: Verify save button is present
    When Admin click +Add New Class button
    Then Admin should see  save button in the class detail popup window

  @tag8
  Scenario: Verify cancel button is present
    When Admin click +Add New Class button
    Then Admin should see  cancel button in the class detail popup window

  @tag9
  Scenario: Verify close button   in class details popup window
    When Admin click +Add New Class button
    Then Admin should see  close button on the class details popup window

  # Validate Search box functionality
  @tag10
  Scenario: Validate search box function
    When Admin enters batch id into search box
    Then Displays entries with that batch Id
    When Admin enters batch id which is not existing the table into search box
    Then Displays empty details in the data table
    When Admin enters class no into search box
    Then Displays entries with that class no
    When Admin enters class no which is not existing the table into search box
    Then Displays empty details in the data table
    When Admin enters class topic into search box
    Then Displays entries with that  class topic
    When Admin enters class topic which is not existing the table into search box
    Then Displays empty details in the data table
    When Admin enters staff id into search box
    Then Displays entries with that  staff id
    When Admin enters staff id which is not existing the table into search box
    Then Displays empty details in the data table
    When Admin enters class date into search box
    Then Displays entries with that  class date
    When Admin enters invalid class date into search box
    Then Displays empty details in the data table

  # Edit class Validation
  Scenario: Verify Edit class popup window
    When Admin clicks Edit button in data table
    Then Edit popup window appears with heading Class Details
    When Admin clicks Edit button from one of the row in data table
    Then Edit popup window appears with same row values in the all fields

  # Delete Class Validation
  Scenario: Verify Delete class alert
    When Admin clicks delete button in data table row level
    Then Admin should see alert

  Scenario: Verify  accept enabled in alert
    When Admin clicks delete button in data table row level
    Then Alert should have "yes" button to accept

  Scenario: Verify reject enabled in alert
    When Admin clicks delete button in data table row level
    Then Alert should have "No" button to reject

  # Delete Multiple Class Validation
  Scenario: Verify delete multiple class  button is enabled
    When Admin clicks single  row level check box in the data table
    Then Admin should see delete icon below the header is enabled

  Scenario: verify tick mark is visible after clicking on check box
    When Admin clicks single  row level check box in the data table
    Then Admin should see tick mark in check box

  Scenario: verify admin able to click multiple check box
    When Admin clicks multiple row level check box in the data table
    Then Admin should see tick mark in check box  of the selected rows

  # Verify sort function in manage class page
  Scenario: Verify sort function in data table for descending order
    When Admin click on Batch id column header to sort
    Then Admin should see data table sorted in descending order

  Scenario: Verify sort function in data table for ascending order
    When Admin double click on Batch id column header to sort
    Then Admin should see data table sorted in ascending  order

  # Navigation function validation from manage class page to other pages
  Scenario: Verify admin is able to navigate from manage class to student page
    When Admin clicks " Student" button in the navigation bar
    Then Admin should able to land on student page

  Scenario: Verify admin is able to navigate from manage class to program page
    When Admin clicks " Program" button in the navigation bar
    Then Admin should able to land on program page

  Scenario: Verify admin is able to navigate from manage class to batch page
    When Admin clicks " Batch" button in the navigation bar
    Then Admin should able to land on batch page

  Scenario: Verify admin is able to navigate from manage class to user page
    When Admin clicks " User" button in the navigation bar
    Then Admin should able to land on user page

  Scenario: Verify admin is able to navigate from manage class to assignment page
    When Admin clicks " Assignment" button in the navigation bar
    Then Admin should able to land on Assignment page

  Scenario: Verify admin is able to navigate from manage class to attendance page
    When Admin clicks " Attendance" button in the navigation bar
    Then Admin should able to land on Attendance page

  Scenario: Verify adminshould able to do logout function from manage class
    When Admin clicks "Logout" button in the navigation bar
    Then Admin should able to land on login page
