package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class AddMembershipPageElements extends BaseClass{

	
	@FindBy(xpath="//*[@id='socialMediaDiv']/div/a")
	public WebElement plusButton;
	
	@FindBy(xpath="//*[@id='modal-holder']/div/div/div/div[2]/form/oxd-decorator[1]/div/div/div/div[1]/button/div/div/div")
	public WebElement membershipdropDown;
	
	@FindBy(xpath="//span[text()='Gym Membership']")
	public WebElement aellMembership;
	
	@FindBy(xpath="//*[@id='modal-holder']/div/div/div/div[2]/form/oxd-decorator[2]/div/div/div/div[1]/button/div/div/div")
	public WebElement subscriptionDropdown;
	
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div[2]/form/oxd-decorator[2]/div/div/div/div[1]/div/div/ul/li[2]/a/span")
	public WebElement subscriptionCompany;
	
	@FindBy(xpath="//input[@id='subscriptionFee']")
	public WebElement subscriptionAmount;
	
	
	@FindBy(xpath="//*[@id='modal-holder']/div/div/div/div[2]/form/oxd-decorator[3]/div/div[2]/div/div[1]/button/div/div/div")
	public WebElement currencyDropDown;
	
	@FindBy(xpath="//span[text()='Turkish Lira']")
	public WebElement turkishLiras;
	
	
	@FindBy(xpath="//*[@id='subscriptionCommenceDate']")
	public WebElement subscriptionCommenceDate;
	
	
	@FindBy(xpath="//*[@id='subscriptionRenewalDate']")
	public WebElement subscriptionRenewalDate;
	
	
   @FindBy(xpath = "//*[@id='modal-save-button]")
   public WebElement memberSaveButton;
	
	
	@FindBy(xpath="//crud-panel[@objs='memberships.membership']")
	public WebElement assingedMembership;
	
	public AddMembershipPageElements() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
