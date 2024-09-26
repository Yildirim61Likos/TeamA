package com.neotech.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EmployeeDetailsValidationSteps extends CommonMethods {
	@Given("user logged in to HRM website")
	public void user_logged_in_to_hrm_website() {
		login.adminLogin();
		
	}
	@And("user navigates to employee list and searches for employee with id and clicks it")
	public void user_navigates_to_employee_list_and_searches_for_employee_with_id_and_clicks_it() {
		click(dash.PIM);
	    click(dash.addEmployeeLink);
	    click(employeeList.employeeSearchButton);
	    sendText(employeeList.employeeSearchField, "123TeamA");
	    wait(3);
	    click(employeeList.EmployeeName);
	    wait(5);
	}

	@Then("user is able to modify employee details {string}, {string}, {string}, {string}, {string},{string},{string}, {string},{string}, {string},{string}")
	public void user_is_able_to_modify_employee_details(String driverLicense, String expirationDate, String Smoker, String Gender, 
			String Nationality, String BloodGroup, String Hobbies, String ShirtSize, String VegOpt, String Sport, String Aestethic) {
	   
		waitForVisibility(personalDetails.personalDetailsForm);

		sendText(empDetails.licenseNo, driverLicense);

		if (Smoker.equals("Yes")) {
			click(empDetails.smokerCheck);
		}
		wait(2);
		click(empDetails.genderInput);
		List<WebElement> genderOptions = empDetails.genderOptions;
		clickOnElement(genderOptions, Gender);
		wait(2);

		click(empDetails.nationalityInput);
		
		List<WebElement> nationalityOptions = empDetails.nationalityOptions;
		clickOnElement(nationalityOptions, Nationality);

		wait(2);
		click(empDetails.licExpDate);

		// Date parameter: 2023-05-10
		// Select year
		String[] dateParts = expirationDate.split("-");
		String year = dateParts[0];
		click(empDetails.licExpYearInput);
		clickOnElement(empDetails.licExpYearOptions, year);
		wait(2);

	
		int month = Integer.parseInt(dateParts[1]); 
		click(empDetails.licExpMonthInput);
		click(empDetails.licExpMonthOptions.get(month - 1));
		wait(2);

		int day = Integer.parseInt(dateParts[2]);
		selectCalenderDate(empDetails.licExpDayOptions, day + "");

		wait(2);
		click(empDetails.BloodInput);
		List<WebElement> BloodOptions = empDetails.BloodOptions;
		clickOnElement(BloodOptions, BloodGroup);
		wait(2);
		sendText(empDetails.HobbyOptions, Hobbies);
		wait(2);
		
		scrollDown(200);
		
		click(empDetails.ShirtInput);
		List<WebElement> ShirtOptions = empDetails.ShirtOptions;
		clickOnElement(ShirtOptions, ShirtSize);
		wait(2);
		scrollDown(400);
		List<WebElement>listVegOptions = empDetails.listVegOptions;
		click(empDetails.VegOption);
		wait(3);
		
		List<WebElement>AestehticOptions =empDetails.AestehticOptions;
		click(empDetails.dancing);
		wait(3);
		List<WebElement>SportOptions =empDetails.SportOptions;
		click(empDetails.baseball);
		wait(2);
		
		click(empDetails.optionsForm);
		scrollDown(300);
		click(empDetails.addAttachmentBtn);
		String filePath = System.getProperty("user.dir") + "/screenshots/passed/Add Employee Page Validation2023_23_09_04_23_07.png";
		
		sendText(driver.findElement(By.id("filename")), filePath);
		
		wait(4);
		
		click(driver.findElement(By.xpath("//button[@id='modal-save-button']")));
		
	wait(2);	
		
	}
		
		
	
	@Then("click on save")
	public void click_on_save() {
		jsClick(empDetails.detailsSaveBtn);
		wait(3);
		jsClick(empDetails.importantSaveBtn);
		wait(2);
	
	}
}
