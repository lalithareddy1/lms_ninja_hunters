@pgm_records
Feature: Feature to Validate No.of.Records in LMS UI Program Page
  
     
@verify_pgmpage_records
Scenario: Validate that number of records displayed  
Given User is logged on to LMS website
When User is on Program page
Then Verify that number of records  displayed on the programpage 


