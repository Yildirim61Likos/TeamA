package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddContactDetailsSteps extends CommonMethods {

	@Given("user navigate to PersonalDetails page")
	public void user_navigate_to_personal_details_page() {
		click(dash.PIM);
		click(dash.addEmployeeLink);
		click(employeeList.employeeSearchButton);
		sendText(employeeList.employeeSearchField, "123TeamA");
		click(employeeList.EmployeeName);
		wait(3);

	}

	@When("user clicks on the more button")
	public void user_clicks_on_the_more_button() 
	{
		click(personalDetails.more);

		wait(3);
	}
	
	@When("selects the Contact Detail option")
	public void selects_the_contact_detail_option() 
	{
		click(personalDetails.contactDetails);

		wait(3);
	}

	
	
	@When("user modifies the contact details Address1 {string}  Address2 {string} City  {string}")
	public void user_modifies_the_contact_details_address1_address2_city(String address1Input, String address2Input, String cityInput) {
		waitForVisibility(contactDetails.contactDetailsForm);
		
		sendText(contactDetails.address1Input,address1Input );
		wait(1);
		sendText(contactDetails.address2Input, address2Input);
		wait(1);
		sendText(contactDetails.cityInput, cityInput);
		wait(1);
	}
	
	@When("user modifies Country {string} State  {string}  ZipCode {string}  HomeTelephone  {string}")
	public void user_modifies_country_state_zip_code_home_telephone(String countryInput, String stateProvidenceInput, String zipCodeInput, String homeTelephoneInput) {
		
		click(contactDetails.dropdown);
		wait(1);
		clickOnElement(contactDetails.countryOptions,countryInput);
		wait(1);
		
		sendText(contactDetails.stateProvidenceInput, stateProvidenceInput);
		wait(1);
		
		sendText(contactDetails.zipCodeInput,zipCodeInput);
		wait(1);
		sendText(contactDetails.homeTelephoneInput, homeTelephoneInput);
		wait(1);
	}
	
	@When("user modifies Mobile {string}   WorkTelephone {string} WorkEmail {string} OtherEmail  {string}")
	public void user_modifies_mobile_work_telephone_work_email_other_email(String mobileInput, String workTelephoneExtentionInput, String workEmailInput, String otherEmailInput) {
		sendText(contactDetails.mobileInput, mobileInput);
		wait(1);
		sendText(contactDetails.workTelephoneExtentionInput, workTelephoneExtentionInput);
		wait(1);
		sendText(contactDetails.workEmailInput, workEmailInput);
		wait(1);
		sendText(contactDetails.otherEmailInput, otherEmailInput);
		
		wait(1);
	}



	@When("user saves the changes")
	public void user_saves_the_changes() {
		wait(1);
		click(contactDetails.saveButton);

	}

	@Then("the changes are reflected in the employees profile")
	public void the_changes_are_reflected_in_the_employees_profile() {

		waitForVisibility(contactDetails.contactDetailsForm);

		boolean isDisplayed = contactDetails.contactDetailsForm.isDisplayed();
		Assert.assertTrue(isDisplayed);

	}

}

