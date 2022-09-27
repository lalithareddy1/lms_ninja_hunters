@user_deleteicon
Feature: Delete icon

Scenario: Verifying the presence of Delete icon in manage user page
Given User is on any page after login
When User is on the Manage user page after clicking User Tab
Then User should see the delete icon at the top left corner of the user table


Scenario: Behaviour of delete icon when rows unchecked
Given User table is displayed in manage user page
When no rows is checked
Then Delete icon on the top left corner of the user table disabled

Scenario: Behaviour of delete icon when rows checked
Given User table is displayed in manage user page
When User checks rows in the user table
Then Delete icon on the top left corner of the user table enabled