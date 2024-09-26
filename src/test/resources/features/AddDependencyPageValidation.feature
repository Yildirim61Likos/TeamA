@dependency @Regression
Feature: Add Dependency

  Background: 
    Given user logins as Admin
    And User navigates to Employee List Page and click on Employee "123TeamA"

  @Smoke
  Scenario: Add Dependency Page Validation
    When user clicks on more tab
    And user clicks on Dependents option
    When user clicks on green + sign
    And user enters the name and date of birth
    And user selects relationship and clicks to the save button
    And user enters the certificate no and the date of registration
    Then user clicks save button
