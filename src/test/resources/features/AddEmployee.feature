@addEmployee @Regression
Feature: Add Employee Feature

  Background: 
    Given user is logged in with valid credentials
    Given user navigates to AddEmployee page

  #AddEmployeePageValidation
  @Smoke
  Scenario: Add Employee Page Validation
    When validate that employee page is displayed successfully

  #AddNewemployeeFunctionalityValidation
  @Smoke
  Scenario: Add Employee with first and last name
    When user enters employee first name and last name
    And user selects a location
    And user clicks on save button
    Then validate that employee is added successfully
