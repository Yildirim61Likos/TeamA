@EmployeeListValidation @Regression
Feature: Search Employee

  @Smoke
  Scenario: Search for Employee by ID
    Given user is logged in with valid credentials
    And user navigates to employee list page
    When user enters valid employee id
    And clicks on search button
    Then employee information is displayed
