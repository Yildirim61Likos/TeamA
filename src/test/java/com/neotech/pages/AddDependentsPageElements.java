package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class AddDependentsPageElements extends CommonMethods {

	
	@FindBy (xpath = "//*[@id='top-menu-overflow']/li[4]/a")
	public WebElement dependentsSelect;
	
	@FindBy (xpath = "//a[@ng-click='dependents.addDependent()']")
	public WebElement plusButton;
	
	@FindBy (id = "name")
	public WebElement name;
	
	@FindBy (id = "date_of_birth")
	public WebElement dateOfBirth;
	
	@FindBy (xpath = "//button[@type='button']//i[@class='material-icons'][normalize-space()='arrow_drop_down']" )
	public WebElement relationshipArrow;
	
	@FindBy (id = "bs-select-1-1")
	public WebElement childOption;
	
	@FindBy (id = "bs-select-1-2")
	public WebElement otherOption;
	
	@FindBy (id = "modal-save-button")
	public WebElement saveButton;
	
	@FindBy (id = "3")
	public WebElement certificateNo;
	
	@FindBy (id = "4")
	public WebElement dateOfRegister;
	
	@FindBy (xpath = "//button[@type='submit']")
	public WebElement greenBoxSaveButton;
	
	
	public AddDependentsPageElements () {
		PageFactory.initElements(driver, this);
	
	}
	
}
