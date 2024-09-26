package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class EmployeeDetailPageElements extends CommonMethods {
	@FindBy(id = "pimPersonalDetailsForm")
	public WebElement personalDetailsForm;

	@FindBy(id = "employeeId")
	public WebElement employeeId;

	@FindBy(id = "pim.navbar.employeeName")
	public WebElement employeeName;

	@FindBy(id = "firstName")
	public WebElement firstName;
	@FindBy(id = "licenseNo")
	public WebElement licenseNo;

	@FindBy(xpath = "//label[text()='Smoker']")
	public WebElement smokerCheck;

	@FindBy(xpath = "//div[@id='emp_gender_inputfileddiv']")
	public WebElement genderInput;

	@FindBy(xpath = "//div[@id='emp_gender_inputfileddiv']/div/ul/li")
	public List<WebElement> genderOptions;

	@FindBy(xpath = "//div[@id='nation_code_inputfileddiv']/div/input")
	public WebElement nationalityInput;

	@FindBy(xpath = "//div[@id='nation_code_inputfileddiv']/div/ul/li")
	public List<WebElement> nationalityOptions;
	
	@FindBy(xpath = "//div[@id=\'1_inputfileddiv\']/div/input")
	public WebElement BloodInput;
	@FindBy(xpath = "//div[@id='1_inputfileddiv']/div/ul/li")
	public List<WebElement> BloodOptions;
	
	@FindBy(xpath= "//input[@id='5']")
	public WebElement HobbyOptions;
	@FindBy(xpath = "//div[@id='19_inputfileddiv']/div/input")
	public WebElement ShirtInput;
	@FindBy(xpath = "//div[@id='19_inputfileddiv']/div/ul/li")
	public List<WebElement> ShirtOptions;

	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/parent::div//i")
	public WebElement licExpDate;

	@FindBy(xpath = "//div[@class='select-wrapper picker__select--year']/input")
	public WebElement licExpYearInput;

	@FindBy(xpath = "//div[@class='select-wrapper picker__select--year']/ul/li")
	public List<WebElement> licExpYearOptions;

	@FindBy(xpath = "//div[@class='select-wrapper picker__select--month']/input")
	public WebElement licExpMonthInput;

	@FindBy(xpath = "//div[@class='select-wrapper picker__select--month']/ul/li")
	public List<WebElement> licExpMonthOptions;

	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/..//table/tbody/tr/td")
	public List<WebElement> licExpDayOptions;
	
	@FindBy (xpath = "//form[@name='customFieldsForm_0']//button[@type='submit'][normalize-space()='save']")
	public  WebElement importantSaveBtn;
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	public WebElement detailsSaveBtn;
	@FindBy(xpath ="//ul[@class='radiobutton-container']")
	public List<WebElement>listVegOptions;
	@FindBy(xpath = "//label[@for='12_Veg']")
	public WebElement VegOption;
	@FindBy(xpath = "//*[@id='content']/div[2]/ui-view/div[2]/div/custom-fields-panel/div[2]/form/materializecss-decorator[1]/div/sf-decorator[2]/div")
	public List<WebElement> AestehticOptions;
	@FindBy(xpath = "//label[@for='14Dancing']")
	public WebElement dancing;
	@FindBy(xpath= "//*[@id='content']/div[2]/ui-view/div[2]/div/custom-fields-panel/div[2]/form/materializecss-decorator[2]/div/sf-decorator/div")
	public List<WebElement> SportOptions;
	@FindBy(xpath= "//label[@for='15Baseball']")
	public WebElement baseball;
	@FindBy(xpath="//label[@for='15Football']")
	public WebElement football;
	
	@FindBy(xpath = "//form[@name='customFieldsForm_1']//button[@type='submit'][normalize-space()='save']")
	public WebElement preferSaveBtn;
	@FindBy(xpath ="//*[@id=\"content\"]/div[2]/ui-view/div[2]/div/custom-fields-panel/div[2]/form")
	public WebElement preferencesForm;
	@FindBy(xpath ="//form[@name='customFieldsForm_1']//button[@type='submit'][normalize-space()='save']")
	public WebElement optionsForm;
	@FindBy(xpath ="//a[@class='waves-effect waves-teal btn primary-btn']")
	public WebElement addAttachmentBtn;
	
	
public EmployeeDetailPageElements()
{
	PageFactory.initElements(driver, this);
}
	
}

