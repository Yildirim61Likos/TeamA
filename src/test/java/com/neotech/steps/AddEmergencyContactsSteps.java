package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

public class AddEmergencyContactsSteps extends CommonMethods {

	@Given("user logins as Admin")
	public void user_logins_as_admin() {
		login.adminLogin();
	}

	@Given("User navigates to Employee List Page and click on Employee {string}")
	public void user_navigates_to_employee_list_page_and_click_on_employee(String string) {
		click(dash.PIM);
		click(dash.EmployeeList);
		wait(1);
		sendText(employeeList.employeeSearchField, string);
		wait(2);
		click(employeeList.employeeSearchButton);
		wait(5);
		
		click(emergency.teamAEmployee);
		waitForVisibility(personalDetails.personalDetailsForm);
	}

	@When("user clicks on more tab")
	public void user_clicks_on_more_tab() {
		click(personalDetails.more);
		wait(1);
	}

	@When("user clicks on Emergency Contacts option")
	public void user_clicks_on_emergency_contacts_option() {
		click(emergency.emergencyContacts);
		wait(4);
	}

	@When("user clicks on + sign")
	public void user_clicks_on_sign() {
		click(emergency.plusButton);
	}

	@When("user enters the {string}, {string}, {string}")
	public void user_enters_the_and(String firstName, String relationship, String phoneNumber) {
		waitForVisibility(emergency.nameBox);
		sendText(emergency.nameBox, firstName);
		wait(1);
		sendText(emergency.relationshipBox, relationship);
		wait(1);
		sendText(emergency.homePhone, phoneNumber);
		wait(1);

	}

	@When("user clicks to the save button")
	public void user_clicks_to_the_save_button() {
		click(emergency.saveButton);
		wait(2);

	}

}
