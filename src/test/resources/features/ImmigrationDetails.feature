@ImmigrationDetails @Regression
Feature: PersonalDetails

  Background: 
    Given I enter a valid username
    And I enter a valid password
    And I click on the login button
    And I validate that I logged in
    And User navigates to Employee List Page and click on the Employee "123TeamA"

  @Smoke
  Scenario: Add Immigration Details Page Validation Positive
    When User clicks on more , Immirgation and plus button.
    And User enters Document number
    And User selects a country
    And User selects a valid Issued Date
    And User selects a valid Expriy Date
    And User selects a valid Eligible Review Date
    And User enters Eligible status and comment

  @Smoke
  Scenario: Add Immigration Details Page Validation Negative
    When User clicks on more , Immirgation and plus button.
    And User enters Document number
    And User selects a country
    And User selects a valid Issued Date
    And User selects a invalid Expriy Date
    And User selects a valid Eligible Review Date
    And User enters Eligible status and comment
