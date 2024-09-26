@addLanguage @Regression
Feature: Add Language

  Background: 
    Given I enter a valid username
    And I enter a valid password
    And I click on the login button
    And I validate that I logged in
    And User navigates to Employee List Page and click on the Employee "123TeamA"

  @Smoke
  Scenario: User adds language details
    When User clicks the more button and select the qualification and clicks the + button and Language
    And User clicks on language and selects Japanese
    And User clicks on skill and selects Reading
    And User clicks on Fluency Level and selects Basic
    And User clicks on Save button
    Then User see the details on Qualification page
