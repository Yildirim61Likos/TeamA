@addMembershipdetails @Regression
Feature: Add Membership Deatils

  @Smoke
  Scenario: Add Membership
    Given user is logged in with valid credentials
    And User navigates to Employee List Page and click on the Employee "123TeamA"
    When User clicks the more button and select the membership and clicks the plus button
    And User selcets membership , subscription , amount of subscription ,currency
    And User provides commence date and renewal date
    Then I validate that i added assinged memberships and all the information
