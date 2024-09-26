package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class ImmirgationPageElements extends CommonMethods{

	@FindBy (xpath="//a[@ng-click='immigrations.addImmigrations()']")
	public WebElement plus;
	
	@FindBy (xpath="//span[text()='666']")
	public WebElement documentIdValidation;
	
	public ImmirgationPageElements() {
		PageFactory.initElements(driver, this);
	}
}
