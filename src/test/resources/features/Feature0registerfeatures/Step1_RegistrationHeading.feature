@registrationHeading
Feature: Heading

Scenario: Validating the heading of Registration form
Given User is on LMS website
When User lands on Registration page
Then User sees the registration heading on the form as 'Registration Form'
