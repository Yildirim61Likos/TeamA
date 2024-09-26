package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class AddWorkExperiencePageElements extends BaseClass{

	@FindBy (id="employer")
	public WebElement company;
	
	@FindBy (id="jobtitle")
	public WebElement title;
	
	@FindBy (id="from_date")
	public WebElement from;
	
	@FindBy (id="to_date")
	public WebElement to;
	
	@FindBy (id="creditable")
	public WebElement creditable;
	
	@FindBy (id="comments")
	public WebElement comments;
	
	@FindBy (id="modal-save-button")
	public WebElement save;
	
	
	@FindBy(xpath = "//*[text()='Successfully Saved']")
	public WebElement SuccessfullySaved;
	
	@FindBy(xpath = "(//span[text()='Required'])[1]")
	public WebElement required;
	
	@FindBy(xpath = "//*[text()='From date should be before to date']")
	public WebElement fromDateShouldBeBeforeToDate;
	

	@FindBy(xpath = "//*[text()='To date should be after From date']")
	public WebElement toDateShouldBeAfterFromDate;
	
	
	
	
	
	
	public AddWorkExperiencePageElements() 
	{
		PageFactory.initElements(driver, this);
	}
}
