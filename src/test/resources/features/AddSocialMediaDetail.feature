@DataTableWithSocialMedia @Regression
Feature: Add Social Medietaia Details features
  ​

  @Smoke
  Scenario: User adds social media details for an employee
    Given user is logged in with valid credentials
    And user navigate to PersonalDetails page
    When user clicks on the more button
    And selects the Social Media Detail option
    And user clicks on the + button
    And user enters the following detail for Twitter,Facebook,LinkedIn and clicks the allow in public and validate that i added social media details
      | Type     | Handle         | Link                         |
      | Twitter  | TwitterUser    | https://facebook.com/user123 |
      | Facebook | Facebook user  | https://facebook.com/user123 |
      | LinkedIn | Linkedlin User | https://facebook.com/user123 |
