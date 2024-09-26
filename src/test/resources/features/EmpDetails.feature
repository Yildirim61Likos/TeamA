@EmployeeDetails @Regression
Feature: Update Employee Personal Details

  @Smoke
  Scenario Outline: Add and Modify Employee Details
    Given user logged in to HRM website
    And user navigates to employee list and searches for employee with id and clicks it
    Then user is able to modify employee details "<DriverLicense>", "<ExpirationDate>", "<Smoker>", "<Gender>", "<Nationality>","<BloodGroup>","<Hobbies>", "<ShirtSize>","<VegOpt>", "<Sport>","<Aestethic>"
    And click on save

    Examples: 
      | FirstName | LastName  | DriverLicense | ExpirationDate | Smoker | Gender | Nationality | BloodGroup | Hobbies | ShirtSize | VegOpt | Sport    | Aestethic |
      | Alina     | Zhakypbek | CL87654438    | 2024-02-08     | No     | Female | Argentinean | AB         | Running | Large     | Veg    | Baseball | Dancing   |
