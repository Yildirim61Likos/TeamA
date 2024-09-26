package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class AddSocialMediaDetailsPageElements extends CommonMethods {

	@FindBy(xpath = "//button[@class='btn']//i[text()='arrow_drop_down']")
	public WebElement typeInput;

	@FindBy(xpath = "//select[@id='typeId']/..//ul//li//span[text()='Facebook']")
	public WebElement facebook;

	@FindBy(xpath = "//select[@id='typeId']/..//ul//li//span[text()='LinkedIn']")
	public WebElement linkedlin;

	@FindBy(xpath = "//select[@id='typeId']/..//ul//li//span[text()='Twitter']")
	public WebElement twitter;

	@FindBy(xpath = "//select[@id='typeId']/..//ul//li//span")
	public List<WebElement> typeOptions;

	@FindBy(xpath = "//input[@id='profileName']")
	public WebElement handleInput;

	@FindBy(xpath = "//input[@id='profileLink']")
	public WebElement linkInput;

	@FindBy(xpath = "//input[@id='allowShare']")
	public WebElement allowShareInPublicCheckbox;

	@FindBy(xpath = "//button[@id='modal-save-button']")
	public WebElement saveButton;
	
	@FindBy(xpath = "//*[@id='socialMediaDiv']/div/a/i")
	public WebElement plusButton;
	

	public AddSocialMediaDetailsPageElements() {
		PageFactory.initElements(driver, this);
	}
}
