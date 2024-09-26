package com.neotech.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class EmergencyContactsPageElements extends CommonMethods {

	@FindBy (id="top-menu-trigger")
	public WebElement more;
	
	
	@FindBy (xpath="//td[text()='123TeamA']")
	public WebElement teamAEmployee;
	
	@FindBy (xpath = "//*[@id='top-menu-overflow']/li[3]/a")
	public WebElement emergencyContacts;
	
	
	@FindBy (xpath = "//div[@ng-if='emergencyContact.permissions.create && emergencyContact.loaded']")
	public WebElement plusButton;
	
	@FindBy (id = "name")
	public WebElement nameBox;
	
	@FindBy (id = "relationship")
	public WebElement relationshipBox;
	
	@FindBy (id = "home_phone")
	public WebElement homePhone;
	
	@FindBy (id = "mobile_phone")
	public WebElement mobilePhone;
	
	@FindBy (id = "office_phone")
	public WebElement workPhone;
	
	@FindBy (id = "modal-save-button")
	public WebElement saveButton;
	
	
	public EmergencyContactsPageElements () {
		PageFactory.initElements(driver, this);
	
//	@FindBy (xpath = "//table[@style='position: relative;']/tbody[1]/tr/td[2]")
//	public WebElement validateName;
	
	
	}
	
}
