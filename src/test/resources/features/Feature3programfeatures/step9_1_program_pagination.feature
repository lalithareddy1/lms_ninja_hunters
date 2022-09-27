@pagination
Feature: Validate pagination functionality of LMS UI Program Page

@verify_previouslink_infirstpage
Scenario: Verify previous link on the first page
Given User is logged on to LMS website
When User is on first page of Manage Program 
Then Verify that previous link is disabled

@verify_nextlink
Scenario: Verify next link 
Given User is on first page
When User clicks navigate > button 
Then User is on page number '2'

@verify_previouslink
Scenario: Verify previous link on the first page
Given User is on page number '2'
When User clicks navigate < button
Then User is on page number '1'

@verify_nextlink_inlasttpage
Scenario: Verify next link on the last page
Given User is logged on to LMS website
When User is on last page of Manage Program 
Then Verify that next link is disabled