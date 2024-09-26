package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddWorkExperienceSteps  extends CommonMethods
{
	@Given("User clicks the more button and select the qualification and clicks the + button and Work Experience")
	public void user_clicks_the_more_button_and_select_the_qualification_and_clicks_the_button_and_education() 
	{
		waitForVisibility(personalDetails.personalDetailsForm);
		click(personalDetails.more);
		click(personalDetails.qualificationsbutton);
		wait(1);
		waitForVisibility(qualification.moreButton);
		click(qualification.moreButton);
	    wait(1);
	    click(qualification.workExperience);
	    wait(2);
	}
	
	@When("User Enters Company name {string} and Job Title {string}")
	public void user_enters_company_name_and_job_title(String string, String string2) {
	    sendText(workExperience.company, string);
	    sendText(workExperience.title, string2);
	}
	
	@When("User enters Valid dates and comment")
	public void user_enters_valid_dates() {
	    sendText(workExperience.from, "Sat, 17 Nov 2018");
	    sendText(workExperience.to, "Thu, 17 Nov 2022");
	    sendText(workExperience.comments, "This is a comment");
	}
	@When("User clicks Save and Creditable")
	public void user_clicks_save_and_creditable() {
	   jsClick(workExperience.creditable);
	   jsClick(workExperience.save);
	   
	   
	}
	
	@When("User enters Invalid dates and comment")
	public void user_enters_invalid_dates_and_comment() {
		 	sendText(workExperience.from, "Thu, 17 Nov 2022");
		    sendText(workExperience.to, "Sat, 17 Nov 2018");
		    sendText(workExperience.comments, "This is a comment");
	}
	@Then("Error Messages should be displayed \\(From date should be before to date AND To date should be after From date)")
	public void error_messages_should_be_displayed_from_date_should_be_before_to_date_and_to_date_should_be_after_from_date() {
		if(workExperience.fromDateShouldBeBeforeToDate.isDisplayed()&&workExperience.toDateShouldBeAfterFromDate.isDisplayed()) 
		 {
			 
			 
		 }
		 else 
		 {
			 Assert.assertEquals("Error message (date) is not displayed", "1", "2");
		 }
	}
	
	@Then("Error Message \\(Required) should be displayed")
	public void error_message_required_should_be_displayed() {
		wait(1);
		if(workExperience.required.isDisplayed()) 
		 {
			 
			 
		 }
		 else 
		 {
			 Assert.assertEquals("Error message (required) is not displayed", "1", "2");
		 }
	}
	
	

}
