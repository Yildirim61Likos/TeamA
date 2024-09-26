package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;


public class AddContactDetailsPageElements extends CommonMethods {

	@FindBy(id = "contact_details_tab")
	public WebElement contactDetailsForm;
	
	@FindBy(id="street1")
	public WebElement address1Input;
	
	@FindBy(id="street2")
	public WebElement address2Input;
	
	@FindBy(id="city")
	public WebElement cityInput;
	
	@FindBy(id="country_inputfileddiv")
	public WebElement countryInput;
	
	@FindBy(xpath = "//div[@id='country_inputfileddiv']//ul//li")
	public List<WebElement> countryOptions;
	
	@FindBy(xpath="//input[@id='province']")
	public WebElement stateProvidenceInput;
	
	@FindBy(xpath="//input[@id='emp_zipcode']")
	public WebElement zipCodeInput;
	
	@FindBy(xpath="//input[@id='emp_hm_telephone']")
	public WebElement homeTelephoneInput;
	
	@FindBy(xpath="//input[@id='emp_mobile']")
	public WebElement mobileInput;
	
	@FindBy(xpath="//input[@id='emp_work_telephone']")
	public WebElement workTelephoneExtentionInput;
	
	@FindBy(xpath="//input[@id='emp_work_email']")
	public WebElement workEmailInput;
	
	@FindBy(xpath="//input[@id='emp_oth_email']")
	public WebElement otherEmailInput;
	
	@FindBy(id = "modal-save-button")
	public WebElement saveButton;
	
	@FindBy(xpath="//div[@class='select-wrapper initialized']")
	public WebElement dropdown;
		
	public AddContactDetailsPageElements() {
		PageFactory.initElements(driver, this);
	}
}