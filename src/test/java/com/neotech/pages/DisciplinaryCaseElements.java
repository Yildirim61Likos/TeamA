package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class DisciplinaryCaseElements extends CommonMethods {

	@FindBy(id = "menu_discipline_defaultDisciplinaryView")
	public WebElement disciplineTab;

	@FindBy(id = "menu_discipline_viewDisciplinaryCases")
	public WebElement disciplinaryCases;
	
	@FindBy(id = "noncoreIframe")
	public WebElement disciplinaryCaseFrame;
	
	@FindBy(xpath = "//*[@id='addItemBtn']/i")
	public WebElement addButton;
	
	@FindBy(id = "addCase_employeeName_empName")
	public WebElement employeeNameBoxAddCase;
	
	@FindBy(id = "addCase_caseName")
	public WebElement caseName;
	
	@FindBy(id = "addCase_description")
	public WebElement description;
	
	@FindBy(id = "btnBack")
	public WebElement cancelButton;
	
	@FindBy(id = "btnSave")
	public WebElement saveButton;


	
	


	@FindBy(xpath = "//i[normalize-space()='ohrm_filter']")
	public WebElement filterIcon;

	@FindBy(id = "DisciplinaryCaseSearch_empName_empName")
	public WebElement employeeNameBox;

	@FindBy(xpath = "//div[@class='autoComplete-title']")
	public WebElement autoCompleteBar;

	@FindBy(id = "searchBtn")
	public WebElement searchButton;

	@FindBy(xpath = "//table[@id='resultTable']//tr[1]/td[2]")
	public WebElement caseNameInTable;
	
	@FindBy(id = "resultTable")
	public WebElement table;

	
	
	
	@FindBy(id = "actionButtons")
	public WebElement takeDisciplinaryActionButton;
	
	@FindBy(xpath = "//label[@for='390']")
	public WebElement terminateButton;
	
	@FindBy(id = "selectDisciplinaryAction")
	public WebElement selectButton;
	
	@FindBy(id = "defaultAction_owner_empName")
	public WebElement owner;
	
	@FindBy(xpath = "//input[@value='-- Select --']")
	public WebElement statusArrow;
	
	@FindBy(xpath = "//div/ul/li[4]/span")
	public WebElement completed;
	
	@FindBy(id = "defaultAction_description")
	public WebElement addActionDescription;
	
	
	public DisciplinaryCaseElements () {
		PageFactory.initElements(driver, this);
	
	
	}
}
