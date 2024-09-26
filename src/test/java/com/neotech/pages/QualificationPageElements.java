package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class QualificationPageElements extends BaseClass{

	
	
	@FindBy(xpath="//span[text()='add']")
	public WebElement moreButton;
	
	@FindBy(xpath="//a[text()='Skill']")
	public WebElement skill;
	
	@FindBy(xpath="//a[contains(text(),'Language')]")
	public WebElement language;
	
	@FindBy(xpath="//a[contains(text(),'License')]")
	public WebElement lincense;
	
	@FindBy(xpath="//a[contains(text(),'Education')]")
	public WebElement edecutaion;
	
	@FindBy(xpath="//a[contains(text(),'Work Experience')]")
	public WebElement workExperience;
	
	@FindBy (xpath="//*[@id='content']/div[2]/ui-view/div[2]/div/div[4]/crud-panel/div/div[2]/list/table/tbody")
	public WebElement languageDetails;
	
	
	@FindBy (xpath="//*[@id='content']/div[2]/ui-view/div[2]/div/div[5]/crud-panel/div/div[2]/list/table/tbody")
	public WebElement licenseDetails;
	
	
	
	public QualificationPageElements() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
}
