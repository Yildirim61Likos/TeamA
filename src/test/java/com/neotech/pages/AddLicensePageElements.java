package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class AddLicensePageElements extends BaseClass{

	@FindBy (xpath="//*[@id=\"modal-holder\"]/div/div/div/div[2]/form/oxd-decorator[1]/div/div[1]/div/div[2]/div/button/i[2]")
	public WebElement type;
	
	@FindBy (id= "bs-select-4-1")
	public WebElement MCSC;
	
	@FindBy (xpath="//*[@id=\"modal-holder\"]/div/div/div/div[2]/form/oxd-decorator[2]/div/div[1]/div/div[1]/div/button")
	public WebElement calender;
	
	@FindBy (id="licenseIssuedDate")
	public WebElement issued;
	
	@FindBy (id="licenseExpiryDate")
	public WebElement expired;
	
	@FindBy (id="modal-save-button")
	public WebElement saveButton;
	
	@FindBy (id="licenseId")
	public WebElement licenseTypeSelect;
	
	public AddLicensePageElements() {
		PageFactory.initElements(driver, this);
	}
}
