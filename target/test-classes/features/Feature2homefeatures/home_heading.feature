@home_heading
Feature: Feature to Validate Heading of LMS UI HomePage
  
     
@verify_homepage_heading
Scenario: Verify  the heading of the Home page
Given User opens browser
When User landed on the Home page after logging into the LMS website
Then User should see heading with text "LMS - Learning Management System" on the Home page


