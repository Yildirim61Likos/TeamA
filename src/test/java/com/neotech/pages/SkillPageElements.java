package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class SkillPageElements extends BaseClass{

	@FindBy(xpath="//div[@class='modal-content']")
	public WebElement skillTable;
	
	@FindBy(xpath="//button[@class='btn']//i[2]")
	public WebElement dropDown;
	
	@FindBy(xpath="//select[@id='skillId']//..//div[@class='dropdown-menu show']//ul/li[2]//span")
	public WebElement accounting;
	
	@FindBy(xpath="//input[@id='years_of_exp']")
	public WebElement yearsofexp;
	
	@FindBy(xpath="//button[@id='modal-save-button']")
	public WebElement saveButton;
	
	@FindBy(xpath="//span[text()='Programming']")
	public WebElement programmingvalidate;
	
	@FindBy(xpath="//span[normalize-space()='Accounting']")
	public WebElement accountValidate;
	
	
	public SkillPageElements() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
}
