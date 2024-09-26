package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class SubordinatePageElements extends BaseClass{

	
	@FindBy(xpath="//input[@id='selectedEmployee_value']")
	public WebElement subordinateName;
	
	@FindBy(xpath="//button[@class='btn']//i[text()='arrow_drop_down']")
	public WebElement dropDown;
	
	@FindBy(xpath="//ul[@class='dropdown-menu inner show']//li//span[text()='Direct']")
	public WebElement direct;
	
	@FindBy(xpath="//button[@id='modal-save-button']")
	public WebElement saveButton;
	
	@FindBy(xpath="//span[@class='angucomplete-title']")
	public WebElement clicknamepopup;
	
	@FindBy(xpath="//span[text()='Assigned Subordinates']")
	public WebElement validatesubordinate;
	
	public SubordinatePageElements() 
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	
}
