@login @Regression
Feature: Login Functionality

  @Smoke
  Scenario: Valid Login
    When I enter a valid username
    And I enter a valid password
    And I click on the login button
    Then I validate that I logged in
    And I validate OrangeHRM logo is visible

  @Smoke
  Scenario: Valid Login2
    When I enter a valid username
    And I enter a valid password
    And I click on the login button
    Then I validate that I logged in
    And I validate OrangeHRM logo is visible
    And I validate that the current url has dashbboard extension

  @Smoke
  Scenario: Invalid Login
    When I enter a valid username
    And I enter an invalid password
    And I click on the login button
    Then I validate invalid credentials
