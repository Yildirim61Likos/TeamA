package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DisciplinaryCaseSteps extends CommonMethods {

	@Given("I am logged in as an Admin")
	public void i_am_logged_in_as_an_admin() {
		login.adminLogin();

	}

	@When("I navigate to Discipline > Disciplinary Cases")
	public void i_navigate_to_discipline_disciplinary_cases() {
		click(discipline.disciplineTab);
		wait(1);
		click(discipline.disciplinaryCases);
		wait(10);
	}

	@When("I click to Add Disciplinary Case button, enter the Employee Name, Case Name, and Description and save")
	public void i_click_to_add_disciplinary_case_button() {

		switchToFrame(discipline.disciplinaryCaseFrame);
		jsClick(discipline.addButton);
		wait(2);
		click(discipline.cancelButton);
		driver.switchTo().defaultContent();
		wait(1);

		switchToFrame(discipline.disciplinaryCaseFrame);
		jsClick(discipline.addButton);
		wait(2);

		sendText(discipline.employeeNameBoxAddCase, "Pote Michael");
		wait(1);
		click(discipline.autoCompleteBar);
		wait(1);
		sendText(discipline.caseName, "<Pote Michael> Misuse of sick leave property");
		wait(1);
		sendText(discipline.description, "Pote Michael has been detected to misuse sick leave privilege");
		wait(1);
		jsClick(discipline.saveButton);
		wait(2);

	}

	@Given("I am logged in as a new user")
	public void i_am_logged_in_as_a_new_user() {
		sendText(login.username, "Potem");
		sendText(login.password, "MichaelPote123!");
		click(login.loginButton);

	}

	@Then("I click to the filter button")
	public void i_click_to_the_filter_button() {
		switchToFrame(discipline.disciplinaryCaseFrame);
		click(discipline.filterIcon);

	}

	@Then("I search by Employee Name for the previously created disciplinary case")
	public void i_search_filter_by_employee_name_for_the_previously_created_disciplinary_case() {
		sendText(discipline.employeeNameBox, "Pote Michael");
		wait(1);
		click(discipline.autoCompleteBar);
		wait(1);
		click(discipline.searchButton);
		waitForVisibility(discipline.table);

	}

	@Then("the relevant disciplinary case should be displayed")
	public void the_relevant_disciplinary_case_should_be_displayed() {
		waitForVisibility(discipline.table);
		wait(2);

	}

	@And("Click Add Disciplinary Case button, enter Employee Name, Case Name, Description and save")
	public void add_disciplinary_case_and_save() {

		switchToFrame(discipline.disciplinaryCaseFrame);
		jsClick(discipline.addButton);
		wait(2);

		sendText(discipline.employeeNameBoxAddCase, "Pote Michael");
		wait(1);
		click(discipline.autoCompleteBar);
		wait(1);
		sendText(discipline.caseName, "<Pote Michael> Harassment");
		wait(1);
		sendText(discipline.description, "Pote Michael has sent inappropriate text messages to co-workers.");
		wait(1);
		jsClick(discipline.saveButton);
		wait(2);

	}

	@Then("I click Take Disciplinary Action button")
	public void i_click_take_disciplinary_action_button() {
		jsClick(discipline.takeDisciplinaryActionButton);
		wait(1);
	}

	@Then("I select terminate")
	public void i_select_terminate() {
		jsClick(discipline.terminateButton);
		wait(1);
		jsClick(discipline.selectButton);
		wait(3);
		waitForVisibility(discipline.owner);
	}

	@Then("I fill out Owner, Status and Description fields and save")
	public void i_fill_out_owner_status_and_description_fields_and_save() {
		sendText(discipline.owner, "Jacqueline White");
		wait(1);
		jsClick(discipline.autoCompleteBar);
		wait(1);
		jsClick(discipline.statusArrow);
		wait(1);
		jsClick(discipline.completed);
		wait(1);
		sendText(discipline.addActionDescription,
				"As it’s clearly mentioned in company handbook, sexual harassment results with termination of employment.");
		wait(1);
		jsClick(discipline.saveButton);
		wait(4);
	}

}