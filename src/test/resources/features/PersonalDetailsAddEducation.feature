@AddEducation @Regression
Feature: Personal Details Add Education

  @Smoke
  Scenario: Add Education
    Given user is logged in with valid credentials
    And User navigates to Employee List Page and click on the Employee Odis Aldavis "0044"
    And User clicks the more button and select the qualification and clicks the + button and Education
    When User provide education level , ebstitute , year ,major,GPA , startDate,endDate and clicks save button
    Then i validate that user provided details
