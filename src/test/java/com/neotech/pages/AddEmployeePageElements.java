package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class AddEmployeePageElements extends BaseClass {
	
	@FindBy(id = "first-name-box")
	public WebElement firstName;

	@FindBy(id = "middle-name-box")
	public WebElement middleName;

	@FindBy(id = "last-name-box")
	public WebElement lastName;

	@FindBy(id = "employeeId")
	public WebElement employeeId;

	@FindBy(id = "location")
	public WebElement location;
	
	@FindBy(id = "modal-save-button")
	public WebElement saveButton;
	
	@FindBy(xpath = "//h5[@class='modal-title']")
	public WebElement addEmployeeTableTitle;
	
	public AddEmployeePageElements () {
		PageFactory.initElements(driver, this);
	}
}
