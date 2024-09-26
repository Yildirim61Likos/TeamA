package com.neotech.steps;


import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ImmigrationDetailsSteps extends CommonMethods{
	
	@Given("User navigates to Employee List Page and click on the Employee {string}")
	public void user_navigates_to_employee_list_page_and_click_on_the_employee(String string) {
		 click(dash.PIM);
		 click(dash.EmployeeList);
		 wait(1);
		 sendText(employeeList.employeeSearchField, string);
		 wait(2);
		 click(employeeList.employeeSearchButton);
		 wait(3);
		 click(employeeList.uniqueEmployee);
	}
	@Given("User clicks on more , Immirgation and plus button.")
	public void user_clicks_on_more_immirgation_and_plus_button() 
	{
		wait(3);
		waitForClickability(personalDetails.more);
		jsClick(personalDetails.more);
		wait(3);
		jsClick(personalDetails.immirgation);
		wait(3);
		waitForClickability(immirgation.plus);
		jsClick(immirgation.plus);
		wait(2);
		
		
		
	}
	@When("User enters Document number")
	public void user_enters_document_number() {
	    sendText(addImmirgation.number, "666");
	}
	@When("User selects a country")
	public void user_selects_a_country() {
			wait(2);
			selectDropdown(addImmirgation.issuedBySelect, "Turkey");
			
	}
	@When("User selects a valid Issued Date")
	public void user_selects_a_valid_issued_date() {
		
	sendText(addImmirgation.issuedDate,"Thu, 16 Nov 2023");
	}
	
	@When("User selects a valid Expriy Date")
	public void user_selects_a_valid_expriy_date() {
	   sendText(addImmirgation.expiryDate, "Mon, 16 Nov 2026");
	}
	@When("User selects a valid Eligible Review Date")
	public void user_selects_a_valid_eligible_review_date() {
	  sendText(addImmirgation.reviewDate, "Sun, 16 Nov 2025");
	}
	@When("User enters Eligible status and comment")
	public void user_enters_eligible_status_and_comment() {
		sendText(addImmirgation.status, "EXAMPLE");
		sendText(addImmirgation.notes, "This is a comment");
	}
	
	@When("User Clicks save")
	public void user_clicks_save() {
		waitForClickability(addImmirgation.save);
		jsClick(addImmirgation.save);
	    
	}
	@Then("User validates the document")
	public void user_validates_the_document() {
	    	waitForVisibility(immirgation.documentIdValidation);
	    	if(immirgation.documentIdValidation.isDisplayed()) 
	    	{
	    		
	    	}
	    	else 
	    	{
	    		Assert.assertEquals("User Could not add the document", "1", "2");
	    	}
	}
	
	@When("User selects a invalid Expriy Date")
	public void user_selects_a_invalid_expriy_date() {
		   sendText(addImmirgation.expiryDate, "Mon, 16 Nov 2020");

	}
	
	@Then("User validates the Error message")
	public void user_validates_the_error_message() {
		waitForVisibility(addImmirgation.expriyDateError);
		if(addImmirgation.expriyDateError.isDisplayed()) 
    	{
    		
    	}
    	else 
    	{
    		Assert.assertEquals("Error not displayed", "1", "2");
    	}
	}


}
