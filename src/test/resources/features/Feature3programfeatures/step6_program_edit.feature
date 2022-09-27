@pgm_edit
Feature: Feature to Validate Edit Program of LMS UI Program Page
  
     
@selectpgm
Scenario: Select Program 
Given User is on Program page
When User selects Program using checkbox
Then Program gets selected


@edit_feature
Scenario: Edit Feature 
Given User is on Program page
When User clicks on <Edit> button in ProgramPage
Then User is on Program Details form.

@edit_pgmname
Scenario: Edit Program Name
Given User is on Program Details form
When User edits Name and selects the Save button in ProgramPage
Then User can see updated Name in ProgramPage

@edit_pgmdescription
Scenario: Edit Program Description
Given User is on Program Details form
When User edits Description and selects the Save button in ProgramPage
Then User can see updated Description in ProgramPage

@change_status
Scenario: Change Program Status
Given User is on Program Details form
When User changes status and selects the Save button in ProgramPage
Then User can see updated status in ProgramPage

@save
Scenario: Click Save
Given User is on Program Details form
When User clicks <Save> button in ProgramPage
Then User can see 'Successful Program Updated' message in ProgramPage


