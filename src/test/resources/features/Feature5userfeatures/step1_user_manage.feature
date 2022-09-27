@user_manage
Feature: Manage User page

Scenario: Verify landing in Manage user page
Given User is on any page after login
When User clicks the Tab 'User'
Then User should see the Manage user page