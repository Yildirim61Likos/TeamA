@AddSkills @Regression
Feature: Personal Deatils Add skills

  @Smoke
  Scenario: Add skills
    Given user is logged in with valid credentials
    And User navigates to Employee List Page and click on the Employee Odis Aldavis "0044"
    And User clicks the more button and select the qualification and clicks the + button and Skills
    When User provides a skill , years and clicks the save button
    Then I validate that user provide the skills
