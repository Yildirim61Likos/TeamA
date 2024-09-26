package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class SupervisorPageElements extends BaseClass{

	
	@FindBy(xpath="//input[@id='selectedEmployee_value']")
	public WebElement supervisorName;
	
	@FindBy(xpath="//button[@class='btn']//i[text()='arrow_drop_down']")
	public WebElement dropDown;
	
	@FindBy(xpath="//ul[@class='dropdown-menu inner show']//li//span[text()='Direct']")
	public WebElement direct;
	
	@FindBy(xpath="//button[@id='modal-save-button']")
	public WebElement saveButton;
	
	@FindBy(xpath="//span[@class='angucomplete-title']")
	public WebElement clickNamepopUp;
	
	@FindBy(xpath="//span[text()='Assigned Supervisors']//../following-sibling::div//table")
	public WebElement validateSupervisor;
	
	
	
	
	public SupervisorPageElements() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
}
