package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddSkillsSteps extends CommonMethods{

	
	@Given("User navigates to Employee List Page and click on the Employee Odis Aldavis {string}")
	public void user_navigates_to_employee_list_page_and_click_on_the_employee_odis_aldavis(String string)
	{
		 click(dash.PIM);
		 click(dash.EmployeeList);
		 wait(1);
		 sendText(employeeList.employeeSearchField, string);
		 wait(2);
		 click(employeeList.employeeSearchButton);
		 wait(3);
		 click(employeeList.odisAldavis);
	}
	
	
	
	
	
	
	@Given("User clicks the more button and select the qualification and clicks the + button and Skills")
	public void user_clicks_the_more_button_and_select_the_qualification_and_clicks_the_button_and_skills()
	{
		waitForVisibility(personalDetails.personalDetailsForm);
		click(personalDetails.more);
		click(personalDetails.qualificationsbutton);
		wait(1);
		waitForVisibility(qualification.moreButton);
		click(qualification.moreButton);
	    wait(1);
	    click(qualification.skill);
	}
	
	
	
	@When("User provides a skill , years and clicks the save button")
	public void user_provides_a_skill_years_and_clicks_the_save_button() 
	{
		
		wait(3);
		waitForVisibility(skill.skillTable);
		jsClick(skill.dropDown);
		wait(1);
		jsClick(skill.accounting);
		wait(1);
		sendText(skill.yearsofexp,"5");
		wait(1);
		jsClick(skill.saveButton);
		wait(2);
	}
	@Then("I validate that user provide the skills")
	public void i_validate_that_user_provide_the_skills() 
	{
		wait(2);
	   boolean programming=skill.accountValidate.isDisplayed();
	   Assert.assertTrue(programming);
	   
	}
	
	
	
	
	
	
	
	
	
}
