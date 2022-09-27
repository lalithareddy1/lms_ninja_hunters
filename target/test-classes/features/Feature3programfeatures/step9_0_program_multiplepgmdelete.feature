@multi_delete
Feature: Feature to Validate Muliple program Deletion Functionality of LMS UI Program Page

@select_multiplepgm
Scenario: Select multiple Program
Given User is on Program page
When User selects more than one Program using checkbox
Then multiple Program gets selected

@delete_feature
Scenario: Delete Feature
Given User is on Program page
When User clicks on <Delete> button on top left corner
Then User lands on Confirm Deletion form.

@clickyes
Scenario: Click Yes
Given User is on Confirm Deletion form
When User clicks <Yes> button
Then User can see 'Successful Programs Deleted' message


@clickno
Scenario: Click No
Given User is on Program page
When User selects more than one Program using checkbox
When User clicks on <Delete> button on top left corner
When User clicks <No> button
Then User can see Confirm Deletion form disappears

