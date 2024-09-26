package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class WorkWeekPageElements extends CommonMethods{

	@FindBy(xpath = "//*[@id='work-week-form']//div[@class='switch']")
	public WebElement enableWorkWeek;
	
	@FindBy(xpath = "//*[text()='Successfully Saved']")
	public WebElement SuccessfullySaved;
	
	//@FindBy (xpath="//tbody/tr//td/div[@style='width:120px']//input")
	//@FindBy(xpath = "//tbody/tr//td/div[@style='width:120px']//div")
	//@FindBy(xpath = "//tbody/tr//td/div[@style='width:120px']//ul")
	//	@FindBy(xpath = "//tbody/tr//td/div[@style='width:120px']//div")
	//	public List <WebElement> workingDay;
	
	@FindBy(xpath = "//tbody/tr//td/div[@style='width:120px']//ul/li/span[text()='Working Day']")
	public List <WebElement> workingDay;
	
	
	@FindBy(xpath = "//input[contains(@name,'shiftIn')]")
	public List <WebElement> shifIn;
	
	@FindBy(xpath = "//input[contains(@name,'shiftOut')]")
	public List <WebElement> shifOut;
	
	@FindBy(xpath = "//input[contains(@name,'lunchIn')]")
	public List <WebElement> lunchIn;
	
	@FindBy(xpath = "//input[contains(@name,'lunchOut')]")
	public List <WebElement> lunchOut;
	
	@FindBy(xpath = "//input[@name='lunchIn-Saturday']")
	public WebElement lunchInSaturday;
	
	@FindBy(xpath = "//input[@name='lunchOut-Saturday']")
	public WebElement lunchOutSaturday;
	
	@FindBy(xpath = "//input[@name='lunchIn-Sunday']")
	public WebElement lunchInSunday;
	
	@FindBy(xpath = "//input[@name='lunchOut-Sunday']")
	public WebElement lunchOutSunday;
	
	@FindBy(xpath = "//a[@ng-click='vm.onSubmitWorkWeek(salaryDetailsForm);']")
	public WebElement Save;
	
	@FindBy(xpath = "(//*[text()='Invalid lunch out time'])[1]")
	public WebElement ErrorLunch;
	
	@FindBy(xpath = "(//*[text()='Invalid shift out time'])[1]")
	public WebElement ErrorShift;
	
	
	
	public WorkWeekPageElements() {
		PageFactory.initElements(driver, this);
		
	}
}
