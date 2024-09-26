package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEducationSteps extends CommonMethods{

	@Given("User clicks the more button and select the qualification and clicks the + button and Education")
	public void user_clicks_the_more_button_and_select_the_qualification_and_clicks_the_button_and_education() 
	{
		waitForVisibility(personalDetails.personalDetailsForm);
		click(personalDetails.more);
		click(personalDetails.qualificationsbutton);
		wait(1);
		waitForVisibility(qualification.moreButton);
		click(qualification.moreButton);
	    wait(1);
	    click(qualification.edecutaion);
	    wait(2);
	}
	@When("User provide education level , ebstitute , year ,major,GPA , startDate,endDate and clicks save button")
	public void user_provide_education_level_ebstitute_year_major_gpa_start_date_end_date_and_clicks_save_button() 
	{
		wait(5);
	    waitForVisibility(addEducation.modalBody);
	    click(addEducation.dropDown);
	    wait(1);
	    click(addEducation.collage);
	    wait(1);
	    sendText(addEducation.enstitue,"Canakkale 18 Mart University");
	    wait(1);
		sendText(addEducation.major,"Economics");
		wait(1);
		sendText(addEducation.year,"4");
		wait(1);
		sendText(addEducation.GPA,"3.35");
		wait(1);
		sendText(addEducation.startDate,"Mon, 10 Sep 2012");
		wait(1);
		sendText(addEducation.endDate,"Tue, 14 Jun 2016");
		wait(1);
		click(addEducation.saveButton);
		wait(3);
		
	}
	@Then("i validate that user provided details")
	public void i_validate_that_user_provided_details()
	{
		wait(2);
	    boolean educations=addEducation.validateCollage.isDisplayed();
	    
	    Assert.assertTrue(educations);
	    
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
