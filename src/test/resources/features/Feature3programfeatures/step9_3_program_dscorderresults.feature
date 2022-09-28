@desc_orderresults
Feature: Validate the Results are displayed in descending order

@name_descorder
Scenario: Verify that the results are displayed in descending order of Program name
Given User is on first page of Manage Program
When User clicks on the descending arrow (down ) near to the Program name 
Then User can see the results in descending order of Program name


@description_desccorder
Scenario: Verify that the results are displayed in descending order of Program Description
Given User is on first page of Manage Program
When User clicks on the descending arrow (down ) near to the Program Description 
Then User can see the results in descending order of Program Description

@status_descorder
Scenario: Verify that the results are displayed in descending order of Program Status
Given User is on first page of Manage Program
When User clicks on the descending arrow (down ) near to the Program status 
Then User can see the results in descending order of Program status