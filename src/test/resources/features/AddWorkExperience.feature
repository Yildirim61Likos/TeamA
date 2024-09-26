@addWorkDetails2 @Regression
Feature: Add Work Experience

  Background: 
    Given I enter a valid username
    And I enter a valid password
    And I click on the login button
    And I validate that I logged in
    And User navigates to Employee List Page and click on the Employee "123TeamA"
    And User clicks the more button and select the qualification and clicks the + button and Work Experience

  @Smoke1
  Scenario: Positive Test Case
    When User Enters Company name "Neotech" and Job Title "QA"
    And User enters Valid dates and comment
    And User clicks Save and Creditable
    Then Successfully Saved message should be displayed

  @Smoke
  Scenario: Negative Test Case
    When User Enters Company name "Neotech" and Job Title "QA"
    And User enters Invalid dates and comment
    And User clicks Save and Creditable
    Then Error Messages should be displayed (From date should be before to date AND To date should be after From date)

  @Smoke 
  Scenario: Negative Test Case
    And User enters Valid dates and comment
    And User clicks Save and Creditable
    Then Error Message (Required) should be displayed
