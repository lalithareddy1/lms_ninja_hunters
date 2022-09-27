@pgm_footer
Feature: Feature to Validate Footer of LMS UI Program Page
  
Background:
Given User is logged on to LMS website
When User is on Program page

@verify_pgmpage_footertxt
Scenario: Validate the text below the table
Then User should see the text as "Showing {x} to {y} of {z} entries" below the table in ProgramPage.

@verify_pgmpage_footer
Scenario: Validate the footer
Then User should see the footer as "In total there are {z}  programs" in ProgramPage.


