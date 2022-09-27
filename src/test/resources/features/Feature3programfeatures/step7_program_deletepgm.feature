@pgm_delete
Feature: Feature to Validate Delete Functionality of LMS UI Program Page

@selectpgm
Scenario: Select Program
Given User is on Program page
When User selects Program using checkbox
Then Program gets selected

@delete_feature
Scenario: Delete Feature
Given User is on Program page
When User clicks on <Delete> button
Then User lands on Confirm Deletion form.

@clickyes
Scenario: Click Yes
Given User is on Confirm Deletion form
When User clicks <Yes> button
Then User can see 'Successful Program Deleted' message


@clickno
Scenario: Click No
Given User clicks on <Delete> button
When User clicks <No> button
Then User can see Confirm Deletion form disappears
