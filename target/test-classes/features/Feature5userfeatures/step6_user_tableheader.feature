@user_header
Feature: Table header

Scenario: Verify Table header
Given User is on any page after login
When User is on the Manage user page after clicking User Tab
Then User should see the table header as Empty checkbox-icon and all the fields with sorticon, edit and delete as column name


Scenario: Verify the functionality of sort icon present in table header
Given User table is displayed in manage user page
When User clicks sort icon in table header
Then Table rows should be sorted

Scenario: User checks Checkbox in table header
Given User table is displayed in manage user page
When User checks empty checkbox in header
Then check box in all rows of user table should be checked

Scenario: User unchecks Checkbox in table header
Given User table is displayed in manage user page
When User unchecks empty checkbox in header
Then check box in all rows of user table should be unchecked
