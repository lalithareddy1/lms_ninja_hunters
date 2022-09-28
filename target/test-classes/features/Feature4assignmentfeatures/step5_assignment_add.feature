@assign_add
Feature: Add new assignment 

Scenario: validate add new assignment 
	Given User is on Manage Assignment page 
	When User clicks A New Assignment button 
	Then User can see Assignment details form 
	
Scenario: Empty form submission 
	Given User is on Assignment Details form 
	When User clicks Save button without entering data 
	Then User gets message 'Name is required' 
	
Scenario: Enter Assignment Name 
	Given User is on Assignment Details form 
	When User enters Assignment name 
	Then User can see Name entered 
	
Scenario: Enter Assignment Description 
	Given User is on Assignment Details form 
	When User enters Assignment description 
	Then User can see Description entered 
	
Scenario: Enter assignment grade 
	Given User is on Assignment Details form 
	When User enters assignment grade 
	Then User can see Grade entered 
	
Scenario: Enter assignment due date 
	Given User is on Assignment Details form 
	When User enters assignment due date 
	Then User can see Assignment due date 
	
Scenario: Click Cancel 
	Given User is on Assignment Details form 
	When User clicks Cancel button 
	Then User can get assignment Details form disappears 
	
	
Scenario: Click Save 
	Given User is on Assignment Details form 
	When User clicks Save button 
	Then User can get 'Successful assignment created' message 
	
	
	
