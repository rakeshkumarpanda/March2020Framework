package com.seleniumeasy.BrowserHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestBase 
{
	public WebDriver driver;
	
	@Parameters("browsers")
	@BeforeTest
	public void browserLaunch(String browser)
	{
		// Launching Browser
		if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./BrowserDrivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("ChromeHeadless"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			co.setHeadless(true);
			driver = new ChromeDriver(co);
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/");
	}
	
	@AfterTest
	public void browserTearDown() throws InterruptedException
	{
		// Closing the browser
		Thread.sleep(5000);
		driver.quit();
	}

}
