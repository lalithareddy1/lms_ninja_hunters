@addpgm
Feature: Feature to Validate Add Program Functionality of LMS UI Program Page
  
     
@add_newpgm
Scenario: Validate Add New Program
Given User is on Program page
When User clicks <A New Program> button
Then User is on Program Details form

@emptysubmission
Scenario: Empty form submission
Given User is on Program Details form
When User clicks <Save> button without entering data in Programdetailsform
Then User gets message 'Name is required.' in PgmPage


@enter_name
Scenario: Enter Program Name
Given User is on Program Details form
When User enters <Name> in text box in Programdetailsform
Then User can see name entered in PgmPage

@enter_description
Scenario: Enter Program Description
Given User is on Program Details form
When User enters <Description> in text box in Programdetailsform
Then User can see Description entered in PgmPage

@select_status
Scenario: Select Status
Given User is on Program Details form
When User selects <Status> using radiobutton in Programdetailsform
Then User can see status selected in PgmPage

@click_save
Scenario: Click Save
Given User is on Program Details form
When User clicks <Save> button in Programdetailsform
Then User gets message 'Successful Program created' in PgmPage



