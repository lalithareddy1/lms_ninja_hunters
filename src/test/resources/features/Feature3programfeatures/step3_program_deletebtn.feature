@pgm_deletebtn
Feature: Feature to Validate state of DeleteButton of LMS UI Program Page
  
     
@verify_pgmpage_deletebtn
Scenario: Validating the default state of Delete button 
Given User is logged on to LMS website
When User is on Program page
Then User should see the Delete button on the top left hand side as Disabled in ProgramPage


