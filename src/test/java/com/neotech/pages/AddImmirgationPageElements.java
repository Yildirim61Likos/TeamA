package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class AddImmirgationPageElements extends CommonMethods{

	@FindBy (id="number")
	public WebElement number;
	
	@FindBy (xpath="//button[@data-id='countryCode']")
	public WebElement issuedByButton;
	
	@FindBy (id="countryCode")
	public WebElement issuedBySelect;
	

	@FindBy (id="issuedDate")
	public WebElement issuedDate;
	
	@FindBy (id="expiryDate")
	public WebElement expiryDate;
	
	@FindBy (id="reviewDate")
	public WebElement reviewDate;
	
	@FindBy (id="status")
	public WebElement status;
	
	@FindBy (id="notes")
	public WebElement notes;
	
	@FindBy (id="modal-save-button")
	public WebElement save;
	
	@FindBy (xpath="//div[text()='Expiry date should be after issued date']")
	public WebElement expriyDateError;
	
//	@FindBy (xpath="//*[@id=\"modal-holder\"]/div/div/div/div[2]/form/oxd-decorator[3]/div/div[1]/div/div[1]/div/button")
//	public WebElement calendar1click;
//	
//	@FindBy (xpath="//*[@id=\"P1870962265_root\"]/div/div/div/div/div[2]/div/div[2]/div")
//	public List<WebElement> calendar1SelectYears;
	
	public AddImmirgationPageElements() {
		PageFactory.initElements(driver, this);
	}
}
