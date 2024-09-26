package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class AddLanguagePageElements extends BaseClass{

	@FindBy (xpath ="//*[@id=\"modal-holder\"]/div/div/div/div[2]/form/oxd-decorator[1]/div/div[1]/div/div[2]/div/button/i[2]")
	public WebElement languageArrow;
	
	@FindBy (xpath="//span[contains(text(),'Japanese')]")
	public WebElement japanese;
	
	@FindBy (xpath ="//*[@id=\"modal-holder\"]/div/div/div/div[2]/form/oxd-decorator[1]/div/div[2]/div/div[2]/div/button/i[2]")
	public WebElement skillArrow;
	
	@FindBy (xpath="//span[contains(text(),'Reading')]")
	public WebElement reading;
	
	@FindBy (xpath ="//*[@id=\"modal-holder\"]/div/div/div/div[2]/form/oxd-decorator[2]/div/div/div/div[2]/div/button/i[2]")
	public WebElement fluencyArrow;
	
	@FindBy (xpath="//span[contains(text(),'Basic')]")
	public WebElement basic;
	
	@FindBy (id ="modal-save-button")
	public WebElement saveButton;
	
	@FindBy (id ="langId")
	public WebElement languageSelect;
	
	@FindBy (id ="fluency")
	public WebElement skillSelect;
	
	
	@FindBy (id ="competency")
	public WebElement fluencySelect;
	
	public AddLanguagePageElements() {
		PageFactory.initElements(driver, this);
	}
	}
