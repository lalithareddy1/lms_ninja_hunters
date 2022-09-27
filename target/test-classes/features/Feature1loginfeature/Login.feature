@login
Feature: Login Page

Scenario: Validating the url
Given User is on the browser
When User opens the LMS website
Then User should see the Login Page

Scenario: Validating Login functionality with invalid password field
Given User is on the Login Page
When User clicks the Login Button after entering invalid password 'test'
Then User should receive the message 'Invalid username and password Please try again'

Scenario: Validating Login functionality with invalid username field
Given User is on the Login Page
When User clicks the Login Button after entering invalid username 'testing'
Then User should receive the message 'Invalid username and password Please try again'

Scenario: Validating Login functionality with valid username and password
Given User is on the Login Page
When User clicks the Login Button after entering valid 'LSM' and 'LMS'
Then User should see the LMS HomePage
