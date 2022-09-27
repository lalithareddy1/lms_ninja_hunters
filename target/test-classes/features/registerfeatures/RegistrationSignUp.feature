@registrationSignup
Feature: Sing Up Button

Scenario: Validating the Sign Up button visibility
Given User is on LMS website
When User lands on Registration page
Then User sees a button with text 'Sign Up' on the form 