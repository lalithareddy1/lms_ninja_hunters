@assign_heading
Feature: Assignment Heading

  Scenario: Validate the heading
    Given User is logged on to LMS website
    When User is on Manage Assignment page
    Then User should see a heading with text 'Manage Assignment' on the Assignment page
