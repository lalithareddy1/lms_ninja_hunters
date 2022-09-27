@pgm_search
Feature: Feature to Validate SearchProgram of LMS UI Program Page
  
     
@verify_search
Scenario: Validate Search Feature 
Given User is logged on to LMS website
When User is on Program page
Then Text box used for search has text as 'Search...' in ProgramPage


@search_byname
Scenario: Search Program By Name 
Given User is on Program page
When User enters <name phrase> into search box from ProgramPage.
Then Entries for <name phrase> are shown in ProgramPage.

@search_bydescription
Scenario: Search Program By Description
Given User is on Program page
When User enters <description phrase> into search box from ProgramPage.
Then Entries for <description phrase> are shown in ProgramPage.

@search_bystatus

Scenario: Search Program By Status
Given User is on Program page
When User enters <status phrase> into search box in ProgramPage.
Then Entries for <status phrase> are shown in ProgramPage.