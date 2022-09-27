
@assign_footer
Feature: Assignment Footer



  Background: 
    Given User is logged on to LMS website
    When User is on Manage Assignment page

  Scenario: Validate the text below the table
    Then User should see the text as 'Showing 1 to 3 of 3 entries' below the table on Assignment Page

  Scenario: Validate the footer
    Then User should see the footer as 'In total there are 3 assignments.' on Assignment Page
