package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps extends CommonMethods{


	@When("I enter a valid username")
	public void i_enter_a_valid_username()
	{
		System.out.println("This is the URL COMING FROM jENKINS !!!  "+System.getProperty("WebUrl"));
		sendText(login.username,ConfigsReader.getProperty("username"));
	}

	@When("I enter a valid password")
	public void i_enter_a_valid_password() {
		sendText(login.password, ConfigsReader.getProperty("password"));
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		click(login.loginButton);
	}

	@Then("I validate that I logged in")
	public void i_validate_that_i_logged_in() {
		boolean isDisplayed= dash.dashboardTitle.isDisplayed();
	    boolean displayed = true;
	    
	   Assert.assertEquals("User could not log in!", isDisplayed, displayed);
	}

	@Then("I validate OrangeHRM logo is visible")
	public void i_validate_orange_hrm_logo_is_visible() {
	    boolean isDisplayed= dash.logo.isDisplayed();
	    boolean displayed = true;
	    
	   Assert.assertEquals("Logo is not visible!", isDisplayed, displayed);
	}

	@Then("I validate that the current url has dashbboard extension")
	public void i_validate_that_the_current_url_has_dashbboard_extension() {
	   
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.endsWith("dashboard")) {
			System.out.println("Test passed");
		}
	}

	@When("I enter an invalid password")
	public void i_enter_an_invalid_password() {
	   sendText(login.password,"Neotech");
	}

	@Then("I validate invalid credentials")
	public void i_validate_invalid_credentials() {
	   if(login.wrongCredentialsMessage.isDisplayed()) {
		   System.out.println("Test Passed");
	   }
	}
	
	
	
}
