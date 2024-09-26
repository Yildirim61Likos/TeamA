package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddLanguageSteps extends CommonMethods{
	@When("User clicks the more button and select the qualification and clicks the + button and Language")
	public void user_clicks_the_more_button_and_select_the_qualification_and_clicks_the_button_and_language() {
		waitForVisibility(personalDetails.personalDetailsForm);
		click(personalDetails.more);
		click(personalDetails.qualificationsbutton);
		wait(1);
		waitForVisibility(qualification.moreButton);
		click(qualification.moreButton);
	    wait(1);
	    click(qualification.language);
	    wait(2);
	}
	@When("User clicks on more and Language button")
	public void user_clicks_on_more_and_language_button() {
		waitForVisibility(personalDetails.personalDetailsForm);
		click(personalDetails.more);
		click(personalDetails.qualificationsbutton);
		wait(1);
		waitForVisibility(qualification.moreButton);
		click(qualification.moreButton);
	    wait(1);
	    click(qualification.language);
	    wait(2);
	}
	@When("User clicks on language and selects Japanese")
	public void user_clicks_on_language_and_selects_japanese() {
		selectDropdown(language.languageSelect, "Japanese");
	}
	@When("User clicks on skill and selects Reading")
	public void user_clicks_on_skill_and_selects_reading() {
		selectDropdown(language.skillSelect, "Reading");
	}
	@When("User clicks on Fluency Level and selects Basic")
	public void user_clicks_on_fluency_level_and_selects_basic() {
		selectDropdown(language.fluencySelect, "Basic");
	}
	@When("User clicks on Save button")
	public void user_click_on_save_button() {
	    click(language.saveButton);
	    wait(5);
	}
	@Then("User see the details on Qualification page")
	public void user_see_the_details_on_qualification_page() {
	    boolean visible = true;
	    boolean isDisplayed = qualification.languageDetails.isDisplayed();
	    
	    Assert.assertEquals("Language didnt changed!", visible , isDisplayed);
		
}}