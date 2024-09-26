@discipline @Regression
Feature: Disciplinary Cases Management

  @sc1 @Smoke
  Scenario: Add new disciplinary case for a new employee (Ticket 17)
    Given I am logged in as an Admin
    When I navigate to Discipline > Disciplinary Cases
    And I click to Add Disciplinary Case button, enter the Employee Name, Case Name, and Description and save

  @sc2 @Smoke
  Scenario: Search and filter disciplinary case by Employee Name (Ticket 18)
    Given I am logged in as a new user
    When I navigate to Discipline > Disciplinary Cases
    Then I click to the filter button
    And I search by Employee Name for the previously created disciplinary case
    Then the relevant disciplinary case should be displayed

  @sc3 @Smoke
  Scenario: Create new disciplinary action for the employee (Ticket 19)
    Given I am logged in as an Admin
    Then I navigate to Discipline > Disciplinary Cases
    And Click Add Disciplinary Case button, enter Employee Name, Case Name, Description and save
    Then I click Take Disciplinary Action button
    And I select terminate
    Then I fill out Owner, Status and Description fields and save
