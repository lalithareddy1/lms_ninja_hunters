@logout
Feature: Logout
Scenario: Logging out
Given User has completed all the workflows
When User clicks on logout 
Then LMS login page should be landed