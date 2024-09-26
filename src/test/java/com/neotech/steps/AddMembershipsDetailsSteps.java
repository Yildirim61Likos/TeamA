package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddMembershipsDetailsSteps extends CommonMethods{

	
	
	@When("User clicks the more button and select the membership and clicks the plus button")
	public void user_clicks_the_more_button_and_select_the_membership_and_clicks_the_plus_button() 
	{
	    click(personalDetails.more);
	    click(personalDetails.memberships);
	    wait(2);
	    click(membership.plusButton);
	    
	    wait(3);
	}
	@When("User selcets membership , subscription , amount of subscription ,currency")
	public void user_selcets_membership_subscription_amount_of_subscription_currency() 
	{
	   click(membership.membershipdropDown);
	   wait(1);
	   click(membership.aellMembership);
	   wait(1);
	   click(membership.subscriptionDropdown);
	   wait(1);
	   click(membership.subscriptionCompany);
	   wait(1);
	   sendText(membership.subscriptionAmount, "200");
	   wait(1);
	   click(membership.currencyDropDown);
	   wait(1);
	   click(membership.turkishLiras);
	   wait(1);
	  
	}
	   
	   
	@When("User provides commence date and renewal date")
	public void user_provides_commence_date_and_renewal_date() 
	{
	    sendText(membership.subscriptionCommenceDate,"Tue, 07 Nov 2017");
	    wait(1);
	    sendText(membership.subscriptionRenewalDate,"Wed, 08 Nov 2023");
	    wait(1);
	}
	@Then("I validate that i added assinged memberships and all the information")
	public void i_validate_that_i_added_assinged_memberships_and_all_the_information()
	{
	    
		wait(1);
		boolean assingedMembership=membership.assingedMembership.isDisplayed();
		
		Assert.assertTrue(assingedMembership);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
