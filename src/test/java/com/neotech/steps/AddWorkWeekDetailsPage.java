package com.neotech.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddWorkWeekDetailsPage extends CommonMethods
{
	@Given("User clicks on more , Work Week and plus button.")
	public void user_clicks_on_more_work_week_and_plus_button() {
		wait(3);
		waitForClickability(personalDetails.more);
		jsClick(personalDetails.more);
		wait(3);
		waitForClickability(personalDetails.workWeek);
		jsClick(personalDetails.workWeek);
	}
	@When("User clicks on Enable Work Week")
	public void user_clicks_on_enable_work_week() {
//	    wait(2);
//	    waitForClickability(workWeek.enableWorkWeek);
//	    jsClick(workWeek.enableWorkWeek);
	    
	}
	@When("User selects working day for all days")
	public void user_selects_working_day_for_all_days() {
	    wait(3);
	
		List <WebElement> workDays = workWeek.workingDay;

	    	for(WebElement day : workDays) 
	    	{
	    		if(day.isEnabled()) {
	    		jsClick(day);
	    		}
	    	}

	    	
	    
	}
	@When("User fills shift in field with {string} for all days")
	public void user_fills_shift_in_field_with_for_all_days(String string) {
		List <WebElement> shifInDays = workWeek.shifIn;
		
		for(WebElement day : shifInDays) 
		{
//			scrollToElement(day);
			sendText(day,string);
			wait(1);
		}
	}
	@When("User fills shift out field with {string} for all days")
	public void user_fills_shift_out_field_with_for_all_days(String string) {
		List <WebElement> shifOutDays = workWeek.shifOut;
		
		for(WebElement day : shifOutDays) 
		{
//			scrollToElement(day);
			sendText(day,string);
//			wait(1);
		}
	}
	
	@When("User fills lunch in field with {string} for weekends")
	public void user_fills_lunch_in_field_with_for_weekends(String string) {
		sendText(workWeek.lunchInSaturday,string);
//		wait(1);
		sendText(workWeek.lunchInSunday,string);
//		wait(1);
	    	
	}
	@When("User fills lunch out field with {string} for weekends")
	public void user_fills_lunch_out_field_with_for_weekends(String string) {
		sendText(workWeek.lunchOutSaturday,string);
//		wait(1);
		sendText(workWeek.lunchOutSunday,string);
//		wait(1);
	}
	@When("User clicks on save button")
	public void user_clicks_on_save_button() {
		scrollToElement(workWeek.Save);
		jsClick(workWeek.Save);
	}
//	@Then("Duration should show {string}")
//	public void duration_should_show(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	@Then("Successfully Saved message should be displayed")
	public void successfully_saved_message_should_show() {
	 if(workWeek.SuccessfullySaved.isDisplayed()) 
	 {
		 
		
	 }
	 else 
	 {
		 Assert.assertEquals("Successfully Saved message not displayed", "1", "2");
	 }
	}
	
	@When("Error message should be displayed")
	public void error_message_should_be_displayed() {
		if(workWeek.ErrorLunch.isDisplayed()) 
		 {
			
			 
		 }
		 else 
		 {
			 Assert.assertEquals("Error message not displayed", "1", "2");
		 }
		}
	
	
	@When("Error2 message should be displayed")
	public void error2_message_should_be_displayed() {
		if(workWeek.ErrorShift.isDisplayed()) 
		 {
			 scrollToElement(workWeek.ErrorShift);
			 wait(1);
		 }
		 else 
		 {
			 Assert.assertEquals("Error message not displayed", "1", "2");
		 }
		}
}
