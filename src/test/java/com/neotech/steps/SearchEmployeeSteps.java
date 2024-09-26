package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;

public class SearchEmployeeSteps extends CommonMethods{

	@Given("user is logged in with valid credentials")
	public void user_is_logged_in_with_valid_credentials() {
		login.adminLogin();
	}
	
}
