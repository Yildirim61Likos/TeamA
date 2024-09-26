package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class DashboardPageElements extends BaseClass{

	
	@FindBy (id="ohrm-small-logo")
	public WebElement logo;
	
	@FindBy(linkText = "Add Employee")
	public WebElement addEmployeeLink;
	
	@FindBy (xpath="//li[@class='page-title']")
	public WebElement dashboardTitle;
	
	@FindBy (id="menu_pim_viewPimModule")
	public WebElement PIM;
	
	@FindBy (linkText ="Employee List")
	public WebElement EmployeeList;
	
	
	
	
	
	
	
	
	
	
	
	public DashboardPageElements() {
		PageFactory.initElements(driver, this);
	}
	
	
}
