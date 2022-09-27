@pgm_heading
Feature: Feature to Validate Heading of LMS UI Program Page
  
     
@verify_pgmpage_heading
Scenario: Verify  the heading of the Program page
Given User is logged into LMS website
When User is on Program page
Then User should see a heading with text "Manage Program" on the Program page


