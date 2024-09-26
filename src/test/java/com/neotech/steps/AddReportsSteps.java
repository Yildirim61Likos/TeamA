package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddReportsSteps extends CommonMethods{

	
	@When("User clicks the more button and select the report and clicks the plus button")
	public void user_clicks_the_more_button_and_select_the_report_and_clicks_the_plus_button() 
	{
	    click(personalDetails.more);
	    wait(1);
	    click(personalDetails.reportButton);
	    wait(1);
	    click(report.plusButton);
	    wait(1);
	}
	@When("Select the add supervisor")
	public void select_the_add_supervisor() 
	{
	    click(report.supervisor);
	    wait(5);
	}
	@When("provide the name {string} and click the employee and slects the reporting method as direct")
	public void provide_the_name_and_click_the_employee_and_slects_the_reporting_method_as_direct(String name) 
	{
	    sendText(supervisor.supervisorName,name);
	    wait(1);
	    click(supervisor.clickNamepopUp);
	    wait(1);
	    click(supervisor.dropDown);
	    wait(1);
	    click(supervisor.direct);
	    wait(1);
	    click(supervisor.saveButton);
	    wait(2);
	    
	}
	@Then("i validate that i added the report as supervisor")
	public void i_validate_that_i_added_the_report_as_supervisor()
	{
		wait(2);
	    boolean isnamewright=supervisor.validateSupervisor.isDisplayed();
	    Assert.assertTrue(isnamewright);
	    
	}
	
	
	
	@When("Select the add subordinate")
	public void select_the_add_subordinate() 
	{
	    click(report.subodinate);
	    wait(4);
	}
	@When("provide the name {string} and click the employee and selects the reporting method as direct for subordinate")
	public void provide_the_name_and_click_the_employee_and_selects_the_reporting_method_as_direct_for_subordinate(String name) 
	{
		sendText(subordinate.subordinateName,name);
	    wait(1);
	    jsClick(subordinate.clicknamepopup);
	    wait(1);
	    click(subordinate.dropDown);
	    wait(1);
	    click(subordinate.direct);
	    wait(1);
	    click(subordinate.saveButton);
	    wait(2);
	}
	
	
	
	@Then("i validate that i added the report as subordinate")
	public void i_validate_that_i_added_the_report_as_subordinate() 
	{
		wait(2);
	    boolean isnamewright=subordinate.validatesubordinate.isDisplayed();
	    Assert.assertTrue(isnamewright);
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
