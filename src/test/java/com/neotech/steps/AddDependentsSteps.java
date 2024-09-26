package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class AddDependentsSteps extends CommonMethods {

	@When("user clicks on Dependents option")
	public void user_clicks_on_dependents_option() {
		click(dependency.dependentsSelect);
		wait(5);
	    
	}
	@When("user clicks on green + sign")
	public void user_clicks_on_green_sign() {
	    click(dependency.plusButton);
	    wait(3);
	}
	
	@When("user enters the name and date of birth")
	public void user_enters_the_name_and_date_of_birth() {
		sendText(dependency.name, "Mario");
		sendText(dependency.dateOfBirth, "Wed, 26 Nov 2003");
		wait(1);
	    
	}
	
	@When("user selects relationship and clicks to the save button")
	public void user_selects_relationship_and_clicks_to_the_save_button() {
		click(dependency.relationshipArrow);
		wait(1);
		
		String expected1 = "Child";
		String actual1 = dependency.childOption.getText();
		Assert.assertEquals("Child relationship option does NOT match!",expected1, actual1);
		
		String expected2 = "Other";
		String actual2 = dependency.otherOption.getText();
		Assert.assertEquals("Other relationship option does NOT match!",expected2, actual2);
				
		click(dependency.childOption);
		wait(1);
		click(dependency.saveButton);
		wait(2);
	    
	}
	
	@When("user enters the certificate no and the date of registration")
	public void user_enters_the_certificate_no_and_the_date_of_registration() {
	    sendText(dependency.dateOfRegister, "Wed, 17 Nov 2021");
	    wait(1);
	}
	
	@Then("user clicks save button")
	public void user_clicks_save_button() {
	    click(dependency.greenBoxSaveButton);
	}
	
	
	
	
}
