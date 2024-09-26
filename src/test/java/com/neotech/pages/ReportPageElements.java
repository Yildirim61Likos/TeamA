package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class ReportPageElements extends BaseClass{

	
	@FindBy(xpath="//a[@class='btn-floating blue']//img[@class='tooltipped']")
	public WebElement supervisor;
	
	@FindBy(xpath="//a[@class='btn-floating yellow darken-1']")
	public WebElement subodinate;
	
	@FindBy(xpath="//div[@class='fixed-action-btn floating-add-btn']//i")
	public WebElement plusButton;
	
	
	public ReportPageElements() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
}
