package com.neotech.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.testbase.PageInitializer;

public class CommonMethods extends PageInitializer{
	
	
	
	
	/**
	 * This method will clear the text box then will send the given text to it !!!
	 * @param el
	 * @param txt
	 */
	public static void sendText(WebElement el,String txt) 
	{
	    el.clear();
	    el.sendKeys(txt);
	}
	
	
	
	/**
	 * This method will click the radio or check box which has value attribute
	 * @param list
	 * @param value
	 */
	public static void clickRadioOrCheckbox(List<WebElement> list,String value) 
	{
		for(WebElement el:list)
		{
			String textValue=el.getAttribute("value").trim();
			if(textValue.equals(value)&& el.isEnabled()) 
			{
				el.click();
				break;
			}
		}
	}
	
	/**
	 * This method will accept the alert by creating an alert interface ...
	 * Don't forget we can not handle Windows base pop up with Selenium !!!
	 * @param list
	 * @param 
	 */
	public static void acceptAlert() 
	{
		try 
		{
		  Alert alert=driver.switchTo().alert();
		  alert.accept();
		}catch(NoAlertPresentException a)
        {
			a.printStackTrace();
		}
	}
	
	
	/**
	 * This method will dismiss the alert by creating an alert interface ...
	 * Don't forget we can not handle Windows base pop up with Selenium !!!
	 * @param list
	 * @param 
	 */
	public static void dismissAlert() 
	{
		try 
		{
		  Alert alert=driver.switchTo().alert();
		  alert.dismiss();
		}catch(NoAlertPresentException a) 
		{
			a.printStackTrace();
		}
		
	}
	
	
	/**
	 * This method will get the text of the alert and return it by creating an alert interface ...
	 * Don't forget we can not handle Windows base pop up with Selenium !!!
	 * @param list
	 * @param 
	 */
	public static String getAlertText() 
	{
		String text=null;
		
		try 
		{
		  Alert alert=driver.switchTo().alert();
		  text=alert.getText();		
		}catch(NoAlertPresentException a) 
		{
			a.printStackTrace();
		}
		return text;
	}
	
	
	
	/**
	 * This method will get the text of the alert and return it by creating an alert interface ...
	 * Don't forget we can not handle Windows base pop up with Selenium !!!
	 * @param list
	 * @param text
	 */
	public static void sendAlertText(String text) 
	{
		try 
		{
		  Alert alert=driver.switchTo().alert();
		  alert.sendKeys(text);
		}catch(NoAlertPresentException a) 
		{
			a.printStackTrace();
		}
	}
	
	
	/**
	 * This method will switch the frame by using the index of the frame 
	 * Also will be over loaded !!! this is how we use the method overloading in our framework.
	 * @param index
	 */
	public static void switchToFrame(int index) 
	{
		try 
		{
		  driver.switchTo().frame(index);
		}catch(NoSuchFrameException a) 
		{
			a.printStackTrace();
		}
	}
	
	
	/**
	 * This method will switch to frame by using name or id o the frame
	 * Method over loading is happening
	 * @param nameOrValue
	 */
	public static void switchToFrame(String nameOrId) 
	{
		try 
		{
		  driver.switchTo().frame(nameOrId);
		}catch(NoSuchFrameException a) 
		{
			a.printStackTrace();
		}
	}
	
	
	
	/**
	 * This method will switch to frame by using WebElement of the frame
	 * Method over loading is happening
	 * @param el
	 */
	public static void switchToFrame(WebElement el) 
	{
		try 
		{
		  driver.switchTo().frame(el);
		}catch(NoSuchFrameException a) 
		{
			a.printStackTrace();
		}
	}
	
	
	/**
	 * This method will select the drop down by creating a Select object and using the index of the element
	 * This method will be over loaded 
	 * Be careful this is only for select type WebElement !!!
	 * @param el
	 * @param index
	 */
	public static void selectDropdown(WebElement el,int index) 
	{
		try 
		{
		  Select sel=new Select(el);
		  sel.selectByIndex(index);
		}catch(Exception a) 
		{
			a.printStackTrace();
		}
		
	}
	
	/**
	 * This method will select the drop down by creating a Select object and using the visibleText of the element
	 * Method over loading is happening !!!
	 * Be careful this is only for select type WebElement !!!
	 * @param el
	 * @param index
	 */
	public static void selectDropdown(WebElement el,String visibileText) 
	{
		try 
		{
		  Select sel=new Select(el);
		  sel.selectByVisibleText(visibileText);
		}catch(Exception a) 
		{
			a.printStackTrace();
		}
	}
	
	
	/**
	 * This method will sleep the execution with given seconds 
	 * @param seconds
	 */
	public static void wait(int seconds) 
	{
		try 
		{
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	
	/**
	 * This method will select the calendar date by getting the text of the WebElement
	 * You can use this for table as well 
	 * @param list
	 * @param text
	 */
	public static void selectCalenderDate(List<WebElement> list,String text) 
	{
		for(WebElement el:list) 
		{
			String text1=el.getText();
			if(text1.equals(text)) 
			{
					if(el.isEnabled()) 
					{
						el.click();
						break;
					}else 
					{
					  System.out.println("Button is not enable");
					  break;
					}
			}
		}
	}
	
	
	/**
	 * This method will create WebDriverWait object and return it
	 * So we can use it for waiting the specific condition
	 * @return wait
	 */
	public static WebDriverWait getWaitObject() 
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
		return wait;
	}
	
	
	/**
	 * This method will wait for the visibility of the given WebElement , Explicit wait !!!
	 * @param el
	 * @return
	 */
	public static WebElement waitForVisibility(WebElement el) 
	{
		return getWaitObject().until(ExpectedConditions.visibilityOf(el));
	}
	
	
	/**
	 * This method will wait for element to clickable of the given WebElement , Explicit wait !!!
	 * @param el
	 * @return
	 */
	public static WebElement waitForClickability(WebElement el) 
	{
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(el));
	}
	
	/**
	 * This method will wait for element to click able the will click to it !!!
	 * @param el
	 */
	public static void click(WebElement el) 
	{
		waitForClickability(el);
		el.click();
	}
	
	
	/**
	 * This method will return JavascriptExecutor interface for scrolling up,down and click to Element !!
	 * @return
	 */
	public static JavascriptExecutor getJSObject() 
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		return js;
	}
	
	
	/**
	 * This method will scroll Up by using the JavascriptExecutor
	 * @param pixel
	 */
	public static void scrollUp(int pixel) 
	{
		getJSObject().executeScript("window.scrollBy(0,-"+pixel+")");
	}
	
	
	/**
	 * This method will scroll Down by using the JavascriptExecutor
	 * @param pixel
	 */
	public static void scrollDown(int pixel) 
	{
		getJSObject().executeScript("window.scrollBy(0,"+pixel+")");
	}
	
	/**
	 * This method will scroll to Element by using the JavascriptExecutor
	 * @param pixel
	 */
	public static void scrollToElement(WebElement el) 
	{
		getJSObject().executeScript("arguments[0].scrollIntoView(true)",el);
	}
	
	
	/**
	 * This method will click to Element by using the JavascriptExecutor
	 * @param pixel
	 */
	public static void jsClick(WebElement el) 
	{
		getJSObject().executeScript("arguments[0].click()", el);
	}
	
	
	
	public static byte[] takeScreenshot(String path) 
	{
	
		TakesScreenshot ss=(TakesScreenshot) driver;
		
		File f=ss.getScreenshotAs(OutputType.FILE);
		
		String destination=Constants.SCREENSHOT_PATH+path+getTimeStamp()+".png";
		
		try 
		{
			FileUtils.copyFile(f, new File(destination));
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		byte[] pic;
		
		pic=ss.getScreenshotAs(OutputType.BYTES);
		
		return pic;
	}
	
	
	public static String getTimeStamp() 
	{
		
		Date date =new Date();
		
		SimpleDateFormat s=new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss");
		return s.format(date);
	}
	
	public static void clickOnElement(List<WebElement> list, String value) {
		wait(1);
		for (WebElement option : list) {
			if (option.getText().equals(value)) {
				click(option);
				break;

			}

		}
	}

	
	
	
}
