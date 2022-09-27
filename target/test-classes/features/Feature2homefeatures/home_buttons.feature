@home_btn
Feature: Feature to Validate MenuBarButtons of LMS UI HomePage
  
      Background:
       Given User opens browser
       When User landed on the Home page after logging into the LMS website



@verify_btn_program
Scenario: Verify Visibility of ProgramButton in HomePage
Then User should see a button with text "Program" on the menu bar
  
@verify_btn_batch
Scenario: Verify Visibility of BatchButton in HomePage
Then User should see a button with text "Batch" on the menu bar

@verify_btn_user
Scenario: Verify Visibility of UserButton in HomePage
Then User should see a button with text "User" on the menu bar

@verify_btn_assignment
Scenario: Verify Visibility of AssignmentButton in HomePage
Then User should see a button with text "Assignment" on the menu bar

@verify_btn_attendance
Scenario: Verify Visibility of AttendanceButton in HomePage
Then User should see a button with text "Attendance" on the menu bar

@verify_btn_logout
Scenario: Verify Visibility of LogoutButton in HomePage
Then User should see a button with text "Logout" on the menu bar