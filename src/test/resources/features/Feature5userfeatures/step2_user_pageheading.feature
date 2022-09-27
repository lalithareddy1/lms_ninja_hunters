@user_pageHeading
Feature: User Page Heading

Scenario: Verify the manage user page heading
Given User is on any page after login
When User is on Manage user page after clicking User Tab
Then User should see the page heading as 'Manage User'
