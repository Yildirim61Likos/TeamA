package com.neotech.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class AddSocialMediaDetailsSteps extends CommonMethods {

	@When("selects the Social Media Detail option")
	public void selects_the_social_media_detail_option() {
		click(personalDetails.socialMediaDetails);
		wait(1);
	}


	@When("user clicks on the + button")
	public void user_clicks_on_the_button() {
		click(social.plusButton);
		wait(3);
	}

	@When("user enters the following detail for Twitter,Facebook,LinkedIn and clicks the allow in public and validate that i added social media details")
	public void user_enters_the_following_detail_for_twitter_facebook_linked_in_and_clicks_the_allow_in_public_and_validate_that_i_added_social_media_details(
			DataTable dataTable) {

		List<Map<String, String>> maplist = dataTable.asMaps();
		for (Map<String, String> map : maplist) {
			wait(3);
			jsClick(social.typeInput);
			wait(1);
			clickOnElement(social.typeOptions, map.get("Type"));
			wait(1);
			sendText(social.handleInput, map.get("Handle"));
			wait(1);
			sendText(social.linkInput, map.get("Link"));
			wait(1);
            jsClick(social.allowShareInPublicCheckbox);     
            wait(1);
			click(social.saveButton);

			wait(3);

			WebElement type = driver.findElement(
					By.xpath("//div[@id='socialMediaDiv']//tbody//tr/td[2]//span[text()='" + map.get("Type") + "']"));

			String expected = map.get("Type");
			String actual = type.getText();

			Assert.assertEquals(expected, actual);
			wait(3);
			
            click(social.plusButton);   
            wait(2);
		    
		}

	}

}
