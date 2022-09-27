@user_footer
Feature: Table footer

Scenario: Verify table footer
Given User is logged on to the LMS website
When User lands on Manage User page
Then User should see the table footer as 'In total there are 4 users.'