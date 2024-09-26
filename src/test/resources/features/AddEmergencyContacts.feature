@addEmergency @Regression
Feature: Add Emergency Contacts Feature

  Background: 
    Given user logins as Admin
    And User navigates to Employee List Page and click on Employee "123TeamA"

  @Smoke
  Scenario Outline: Title of your scenario
    When user clicks on more tab
    And user clicks on Emergency Contacts option
    When user clicks on + sign
    And user enters the "<FirstName>", "<Relationship>", "<PhoneNumber>"
    And user clicks to the save button

    Examples: 
      | FirstName | Relationship | PhoneNumber |
      | Azumi     | Spouse       |  9876665544 |
      | Yuriko    | Friend       |  7774441122 |
