@assign_delete 
Feature: Delete Assignment 

Scenario: 
	Given User is on Assignment page
	When User clicks on a <Delete> button after selecting an assignment 
	Then User lands on a Confirm Deletion form. 
	
Scenario: Click No 
	Given User is on a Confirm Deletion form 
	When User clicks on <No> button 
	Then User can see a Confirm Deletion form disappears 
	
Scenario: Click Yes 
	Given User is on a Confirm Deletion form 
	When User clicks on <Yes> button 
	Then User can see 'Successful Assignment Deleted' message 
