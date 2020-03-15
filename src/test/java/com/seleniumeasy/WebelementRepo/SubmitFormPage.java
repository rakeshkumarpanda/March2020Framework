package com.seleniumeasy.WebelementRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubmitFormPage 
{
	@FindBy(name = "first_name")
	private WebElement firstNameField;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastNameField;
	
	@FindBy(xpath = "//label[contains(text(),'E-Mail')]/following-sibling::div//input")
	private WebElement emailField;
	
	@FindBy(xpath = "//label[contains(text(),'Phone')]/following-sibling::div//input")
	private WebElement phoneNumberField;
	
	@FindBy(name = "state")
	private WebElement stateDropdown;
	
	@FindBy(xpath = "//input[@value='yes']")
	private WebElement yesRadioButton;
	
	@FindBy(xpath = "//img[@src='http://www.seleniumeasy.com/sites/default/files/seleniumEasy_0.jpg']")
	private WebElement seleniumEasyImage;

	public WebElement getFirstNameField() {
		return firstNameField;
	}

	public WebElement getLastNameField() {
		return lastNameField;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPhoneNumberField() {
		return phoneNumberField;
	}

	public WebElement getStateDropdown() {
		return stateDropdown;
	}

	public WebElement getYesRadioButton() {
		return yesRadioButton;
	}

	public WebElement getSeleniumEasyImage() {
		return seleniumEasyImage;
	}

}
