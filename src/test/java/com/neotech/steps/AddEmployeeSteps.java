package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeSteps extends CommonMethods {

	@Given("user navigates to AddEmployee page")
	public void user_navigates_to_add_employee_page() {
		click(dash.PIM);
		click(dash.addEmployeeLink);

		wait(3);
	}

	@When("user enters employee first name and last name")
	public void user_enters_employee_first_name_and_last_name() {
		sendText(addEmployee.firstName, "Michael");
		sendText(addEmployee.lastName, "Jackson");
	}

	@When("user selects a location")
	public void user_selects_a_location() {
		selectDropdown(addEmployee.location, "HQ - CA, USA");
	}

	@When("user clicks on save button")
	public void user_clicks_on_save_button() {
		wait(1);
		click(addEmployee.saveButton);

	}

	@Then("validate that employee is added successfully")
	public void validate_that_employee_is_added_successfully() {
		waitForVisibility(personalDetails.personalDetailsForm);

		String expected = "Michael Jackson";
		String actual = personalDetails.employeeName.getText();

		Assert.assertEquals("Employee name DOES NOT match!", expected, actual);
	}

	@Then("validate that employee page is displayed successfully")
	public void validate_that_employee_page_is_displayed_successfully() {
		waitForVisibility(addEmployee.addEmployeeTableTitle);

		boolean isDisplayed = addEmployee.addEmployeeTableTitle.isDisplayed();
		Assert.assertTrue(isDisplayed);
		
	}

}
