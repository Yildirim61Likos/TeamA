@ContactDetails @Regression 
Feature: Adding changes to an employees contact details

  @Smoke
  Scenario: User changes employee details using the more dropdown and selecting contact details option
    Given user is logged in with valid credentials
    And user navigate to PersonalDetails page
    When user clicks on the more button
    And selects the Contact Detail option
    And user modifies the contact details Address1 "1234 Brook Street"  Address2 "345 Beverly road" City  "Cleveland"
    And user modifies Country "Albania" State  "Tirana"  ZipCode "12345"  HomeTelephone  "12345765334"
    And user modifies Mobile "18475647383"   WorkTelephone "23449372792" WorkEmail "tvgsj@gmail.com" OtherEmail  "vsgfhayeg@gmail.com"
    When user saves the changes
    Then the changes are reflected in the employees profile
