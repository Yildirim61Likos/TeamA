package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class AddEducationPageElements extends BaseClass{

	
	@FindBy(xpath="//div[@id='modal-holder']//div[@class='modal-body']")
	public WebElement modalBody;
	
	@FindBy(xpath="//button[@class='btn']/i[2]")
	public WebElement dropDown;
	
	@FindBy(xpath="//select[@id='educationId']//..//div[@class='dropdown-menu show']//ul//li//span[text()='College Undergraduate']")
	public WebElement collage;
	
	@FindBy(xpath="//input[@id='institute']")
	public WebElement enstitue;
	
	@FindBy(xpath="//input[@id='major']")
	public WebElement major;
	
	
	@FindBy(xpath="//input[@id='year']")
	public WebElement year;
	
	@FindBy(xpath="//input[@id='score']")
	public WebElement GPA;
	
	@FindBy(xpath="//input[@id='startDate']")
	public WebElement startDate;
	
	@FindBy(xpath="//input[@id='endDate']")
	public WebElement endDate;
	
	
	@FindBy(xpath="//span[normalize-space()='College Undergraduate']")
	public WebElement validateCollage;
	
	@FindBy(xpath="//form[@name='oxdModalForm']")
	public WebElement educationTable;
	
	@FindBy(xpath="//button[@id='modal-save-button']")
	public WebElement saveButton;
	
	public AddEducationPageElements()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
