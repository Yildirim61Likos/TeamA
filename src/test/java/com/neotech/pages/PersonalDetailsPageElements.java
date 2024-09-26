package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;


public class PersonalDetailsPageElements extends BaseClass {

	@FindBy(id = "pimPersonalDetailsForm")
	public WebElement personalDetailsForm;

	@FindBy(id = "pim.navbar.employeeName")
	public WebElement employeeName;
  
   @FindBy (id="top-menu-trigger")
	public WebElement more;
	
   @FindBy (xpath="//span[@translate=\"Work Week\"]")
	public WebElement workWeek;
  
	@FindBy (xpath="//*[@id=\"top-menu-overflow\"]/li[5]/a")
	public WebElement immirgation;
	
	@FindBy (xpath="//span[@translate='Social Media Details']")
	public WebElement socialMediaDetails;
	
	@FindBy(xpath = "//span[@translate='Contact Details']")
	public WebElement contactDetails;
	
	@FindBy(xpath="//span[@translate='Qualifications']")
	public WebElement qualificationsbutton;
	
	@FindBy(xpath="//a[@class='truncate pim_employees_profile_report_to']")
	public WebElement reportButton;
	
	
	@FindBy(xpath = "//span[@translate='Memberships']")
	public WebElement memberships;
	
	
	
	public PersonalDetailsPageElements() {
		PageFactory.initElements(driver, this);
		
	}


}