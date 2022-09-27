@user_pagination
Feature: Pagination

Scenario: Verify the presence of pagination
Given User is on any page after login
When User is on Manage user page after clicking User Tab
Then user should see the pagination controls below the data table

Scenario: Verify the pagination control with less rows
Given User is on Manage user page
When Manage user table has less than or equals to 5 rows
Then Pagination control should be disabled