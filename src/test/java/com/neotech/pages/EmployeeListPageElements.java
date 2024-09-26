package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;



public class EmployeeListPageElements extends CommonMethods{
	
		@FindBy (id = "employee_name_quick_filter_employee_list_value")
		public WebElement employeeSearchField;
		
		@FindBy(id = "quick_search_icon")
		public WebElement employeeSearchButton;
		
		@FindBy (xpath="//td[text()='123TeamA']")
		public WebElement uniqueEmployee;
		
		@FindBy (xpath = "//img[@class='circle list-photo']")
		public WebElement EmployeeName;
		
		@FindBy(id = "pim.navbar.employeeName")
		public WebElement EmployeeFullName;
		
		@FindBy(xpath="//td[text()='0044']")
		public WebElement odisAldavis;
		
		
		@FindBy(xpath="//tbody/tr[1]/td[1]/img[1]")
		public WebElement employeetoclick;
		
		
		
		
		
		
		
		
		public EmployeeListPageElements()
		{
			PageFactory.initElements(driver, this);
		}
}

