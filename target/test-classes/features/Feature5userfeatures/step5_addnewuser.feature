@add_newUser
Feature: Add new user

Scenario: Verify the presence of Add new user button
Given User is on Manage User page
When User is on the Manage user page after clicking Uset tab
Then User should see a button with the text + 'Add New User'

Scenario: Verify the functionality of Add new user button
Given User is on Manage User page
When User clicks Add New User button
Then User should see the "User Details" dialog box
