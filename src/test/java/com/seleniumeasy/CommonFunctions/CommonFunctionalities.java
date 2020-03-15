package com.seleniumeasy.CommonFunctions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class CommonFunctionalities 
{
	public void clickElement(WebDriver driver, WebElement element, String elementName)
	{
		try
		{
			if(element.isDisplayed())
			{
				if(element.isEnabled())
				{
					element.click();
					Reporter.log(elementName+" is clicked");
				}
			}
		}
		catch(StaleElementReferenceException e)
		{
			driver.navigate().refresh();
			clickElement(driver, element, elementName);
		}
		catch(NoSuchElementException e)
		{
			Reporter.log(elementName+" is not displaying on UI");
		}
		catch(Exception e)
		{
			Reporter.log(elementName+" is not displaying on UI");
		}
	}
	public void enterValue(WebDriver driver, WebElement element, String value, String elementName)
	{
		try
		{
			if(element.isDisplayed())
			{
				if(element.isEnabled())
				{
					element.sendKeys(value);
					Reporter.log(elementName+" is entered with "+value);
				}
			}
		}
		catch(StaleElementReferenceException e)
		{
			driver.navigate().refresh();
			clickElement(driver, element, elementName);
		}
		catch(NoSuchElementException e)
		{
			Reporter.log(elementName+" is not displaying on UI");
		}
		catch(Exception e)
		{
			Reporter.log(elementName+" is not displaying on UI");
		}
	}
	public void selectOption(WebDriver driver, WebElement element, String option, String elementName)
	{
		try
		{
			if(element.isDisplayed())
			{
				if(element.isEnabled())
				{
					Select select = new Select(element);
					select.selectByVisibleText(option);
					Reporter.log(elementName+" is selected with "+option);
				}
			}
		}
		catch(StaleElementReferenceException e)
		{
			driver.navigate().refresh();
			clickElement(driver, element, elementName);
		}
		catch(NoSuchElementException e)
		{
			Reporter.log(elementName+" is not displaying on UI");
		}
		catch(Exception e)
		{
			Reporter.log(elementName+" is not displaying on UI");
		}
	}
	public void scrollDownintoView(WebDriver driver, WebElement element, String elementName)
	{
		try
		{
			if(element.isDisplayed())
			{
				if(element.isEnabled())
				{
					JavascriptExecutor js = (JavascriptExecutor)driver;
					js.executeScript("argurments[0].scrollIntoView()", element);
				}
			}
		}
		catch(NoSuchElementException e)
		{
			Reporter.log(elementName+" is not displaying on UI");
		}
		catch(Exception e)
		{
			Reporter.log(elementName+" is not displaying on UI");
		}
	}

}
