@assign_edit
Feature: Edit Assignment Details

  Scenario: Select Assignment
    Given User is on the Assignment page
    When User selects Assignment using checkbox on assignement page
    Then Assignment gets selected on assignement page

  Scenario: Edit Feature
    Given User is on the Assignment page
    When User clicks on <Edit> button on assignement page
    Then User lands on Assignment Details form of assignement page

  Scenario: Edit Assignment Name
    Given User is on Assignment Details form
    When User edits assignment Name
    Then User can see updated assignment Name

  Scenario: Edit Assignment Description
    Given User is on Assignment Details form
    When User edits Assignment Description
    Then User can see updated Assignment Description

  Scenario: Edit Assignment Grade
    Given User is on Assignment Details form
    When User edits  Assignment Grade
    Then User can see updated Assignment Grade

  Scenario: Edit Assignment Due Date
    Given User is on Assignment Details form
    When User edits Assignment Due Date
    Then User can see updated Assignment Due Date

  Scenario: Click Cancel
    Given User is on Assignment Details form
    When User clicks <Cancel> button on form
    Then User can see Assignment Details form disappears

  Scenario: Click Save
    Given User is on Assignment Details form
    When User clicks <Save> button on form
    Then User can see a 'Successful Assignment Updated' message
