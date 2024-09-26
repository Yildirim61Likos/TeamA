package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeListValidations extends CommonMethods {


	@Given("user navigates to employee list page")
	public void user_navigates_to_employee_list_page() 
	{
	    click(dash.PIM);
	    click(dash.addEmployeeLink);
	}
	

	@When("user enters valid employee id")
	public void user_enters_valid_employee_id()
	{
	    sendText(employeeList.employeeSearchField, "123TeamA");
	    wait(2);
	}
	
	
	@When("clicks on search button")
	public void clicks_on_search_button() 
	{
	    click(employeeList.employeeSearchButton);
	    wait(2);
	}


	@Then("employee information is displayed")
	public void employee_information_is_displayed() 
	{
	    click(employeeList.employeetoclick);
	    wait(2);
	    waitForVisibility(employeeList.EmployeeFullName);

		boolean isDisplayed = employeeList.EmployeeFullName.isDisplayed();
		Assert.assertTrue(isDisplayed);
	}
	
}
