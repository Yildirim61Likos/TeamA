@ReportDetails @Regression
Feature: Add Report Details

  @supervisor @Smoke
  Scenario: Add supervisor report details
    Given user is logged in with valid credentials
    And User navigates to Employee List Page and click on the Employee "123TeamA"
    When User clicks the more button and select the report and clicks the plus button
    And Select the add supervisor
    And provide the name "c" and click the employee and slects the reporting method as direct
    Then i validate that i added the report as supervisor

  @subordinate @Smoke
  Scenario: Add subordinate report details
    Given user is logged in with valid credentials
    And User navigates to Employee List Page and click on the Employee "123TeamA"
    When User clicks the more button and select the report and clicks the plus button
    And Select the add subordinate
    And provide the name "c" and click the employee and selects the reporting method as direct for subordinate
    Then i validate that i added the report as subordinate
