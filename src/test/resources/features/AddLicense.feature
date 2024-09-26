@addLicense @Regression 
Feature: Add License

  Background: 
    Given I enter a valid username
    And I enter a valid password
    And I click on the login button
    And I validate that I logged in
    And User navigates to Employee List Page and click on the Employee "123TeamA"

  @Smoke
  Scenario: User adds license details
    When User clicks the more button and select the qualification and clicks the + button and License
    And User clicks on License Type and selects MCSC
    And User sends date to issue date
    And User sends date to expire date
    And User clicks on the save button
    Then User see the details on Qualification page.
