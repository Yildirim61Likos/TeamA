@addWorkDetails @Regression
Feature: Add Work Week Details Page Validation
  I want to use this template for my feature file

  Background: 
    Given I enter a valid username
    And I enter a valid password
    And I click on the login button
    And I validate that I logged in
    And User navigates to Employee List Page and click on the Employee "123TeamA"

  @Smoke
  Scenario: Positive Test Case
    Given User clicks on more , Work Week and plus button.
    When User clicks on Enable Work Week
    And User selects working day for all days
    And User fills shift in field with "09:00" for all days
    And User fills shift out field with "17:00" for all days
    And User fills lunch in field with "12:00" for weekends
    And User fills lunch out field with "13:00" for weekends
    And User clicks on save button
    #Then Duration should show "07.00"
    Then Successfully Saved message should be displayed

  @Smoke
  Scenario: Negative Test Case
    Given User clicks on more , Work Week and plus button.
    When User clicks on Enable Work Week
    And User selects working day for all days
    And User fills shift in field with "09:00" for all days
    And User fills shift out field with "17:00" for all days
    And User fills lunch in field with "12:00" for weekends
    And User fills lunch out field with "11:00" for weekends
    #Then Duration should show "07.00"
    Then Error message should be displayed

  @Smoke
  Scenario: Negative Test Case
    Given User clicks on more , Work Week and plus button.
    When User clicks on Enable Work Week
    And User selects working day for all days
    And User fills shift in field with "19:00" for all days
    And User fills shift out field with "17:00" for all days
    #Then Duration should show "07.00"
    Then Error2 message should be displayed
