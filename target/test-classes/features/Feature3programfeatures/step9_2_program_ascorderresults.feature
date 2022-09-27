@asc_orderresults
Feature: Validate the Results are displayed in ascending order

@name_ascorder
Scenario: Verify that the results are displayed in Ascending order of Program name
Given User is on first page of Manage Program
When User clicks on the Ascending arrow (down ) near to the Program name 
Then User can see the results in Ascending order of Program name


@description_ascorder
Scenario: Verify that the results are displayed in Ascending order of Program Description
Given User is on first page of Manage Program
When User clicks on the Ascending arrow (down ) near to the Program Description 
Then User can see the results in Ascending order of Program Description

@status_ascorder
Scenario: Verify that the results are displayed in Ascending order of Program Status
Given User is on first page of Manage Program
When User clicks on the Ascending arrow (down ) near to the Program status 
Then User can see the results in Ascending order of Program status