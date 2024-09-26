package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddLicenseSteps extends CommonMethods{
	@When("User clicks the more button and select the qualification and clicks the + button and License")
	public void user_clicks_the_more_button_and_select_the_qualification_and_clicks_the_button_and_license() {
		waitForVisibility(personalDetails.personalDetailsForm);
		click(personalDetails.more);
		click(personalDetails.qualificationsbutton);
		wait(1);
		waitForVisibility(qualification.moreButton);
		click(qualification.moreButton);
	    wait(1);
	    click(qualification.lincense);
	    wait(2);
	}
	
	@When("User clicks on License Type and selects MCSC")
	public void user_clicks_on_license_type_and_selects_mcsc() {
		selectDropdown(license.licenseTypeSelect, "MCSC");
	}
	@When("User sends date to issue date")
	public void user_sends_date_to_issue_date() {
		sendText(license.issued,"Mon, 16 Nov 2020");
	}
	@When("User sends date to expire date")
	public void user_sends_date_to_expire_date() {
		sendText(license.expired,"Fri, 16 Nov 2029");
	}
	@When("User clicks on the save button")
	public void user_clicks_on_the_save_button() {
		click(license.saveButton);
	    wait(5);
	}
	@Then("User see the details on Qualification page.")
	public void user_see_the_details_on_qualification_page() {
		boolean visible = true;
	    boolean isDisplayed = qualification.licenseDetails.isDisplayed();
	    
	    Assert.assertEquals("License didnt changed!", visible , isDisplayed);
	}
}