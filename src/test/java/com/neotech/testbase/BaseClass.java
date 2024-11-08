package com.neotech.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.neotech.utils.ConfigsReader;
import com.neotech.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	public static WebDriver driver;
	
	public static void setUp() 
	{
		
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILE_PATH);
		String browser=ConfigsReader.getProperty("browser");
		switch(browser.toLowerCase()) 
		{
		case"chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case"firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
			default:
				break;
				
		}
		
		//String website=ConfigsReader.getProperty("url");
		System.out.println("This is the URL COMING FROM jENKINS !!!  "+System.getProperty("WebUrl"));
		driver.get(System.getProperty("WebUrl"));
		System.out.println();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
		
		PageInitializer.initialize();
		
	}
	
	
	public static void tearDown() 
	{
		if(driver!=null) 
		{
			driver.quit();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
