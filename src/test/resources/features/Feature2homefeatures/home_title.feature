@home_title
Feature: Feature to Validate Title of LMS UI HomePage
  
     
@verify_homepage_title
Scenario: Verify  the title of the Home page
Given User opens browser
When User landed on the Home page after logging into the LMS website
Then verify that title of the page is "LMS"


