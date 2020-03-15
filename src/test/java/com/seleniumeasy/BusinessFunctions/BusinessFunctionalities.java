package com.seleniumeasy.BusinessFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.seleniumeasy.CommonFunctions.CommonFunctionalities;
import com.seleniumeasy.WebelementRepo.HomePage;
import com.seleniumeasy.WebelementRepo.LandingPage;
import com.seleniumeasy.WebelementRepo.SubmitFormPage;

public class BusinessFunctionalities extends CommonFunctionalities
{
	private WebDriver driver;
	LandingPage landingPage;
	HomePage homePage;
	SubmitFormPage submitFormPage;
	
	public BusinessFunctionalities(WebDriver driver)
	{
		this.driver=driver;
		landingPage = PageFactory.initElements(this.driver, LandingPage.class);
		homePage = PageFactory.initElements(this.driver, HomePage.class);
		submitFormPage = PageFactory.initElements(this.driver, SubmitFormPage.class);
	}
	
	
	
	public void submitForm(String firstName, String lastName, String email, String phone, String state)
	{
		// Landing Page
		clickElement(driver, landingPage.getDemoWebsiteLink(), "Demo Website Link");
		
		// Demo Website Home Page
		clickElement(driver, homePage.getInputFormsTab(), "Input Forms Tab");
		clickElement(driver, homePage.getInputFormSubmitLink(), "Input Form Submit Link");

		// Submit Form Page
		enterValue(driver, submitFormPage.getFirstNameField(), firstName, "First Name Field");
		enterValue(driver, submitFormPage.getLastNameField(), lastName, "Last Name Field");
		enterValue(driver, submitFormPage.getEmailField(), email, "Email Field");
		enterValue(driver, submitFormPage.getPhoneNumberField(), phone, "Phone Number Field");
		scrollDownintoView(driver, submitFormPage.getStateDropdown(), "State Drop down");
		selectOption(driver, submitFormPage.getStateDropdown(), state, "State Drop down");
		clickElement(driver, submitFormPage.getYesRadioButton(), "Yes Radio Button");
		clickElement(driver, submitFormPage.getSeleniumEasyImage(), "Selenium Easy Image");
	}

}
