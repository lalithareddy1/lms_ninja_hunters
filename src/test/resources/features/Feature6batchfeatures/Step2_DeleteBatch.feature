@delete_batch
Feature: Delete Batch

Scenario: delete feature
Given User is on Batch page
When user clicks delete  button for any batch
Then user will get confirm deletion popup

Scenario: click yes
Given user is on Batch Confirm Deletion page
When User clicks Yes button
Then User can see 'Successful BatchDeleted' message

Scenario: Verify deleted batch
Given user is on Batch page
When User Searches for "Deleted Batch name"
Then There should be zero results.

Scenario: click no
Given User is on Batch Confirm Deletion Page after selecting a batch to delete
When User clicks No button
Then User can see Batch is not deleted.
