package com.seleniumeasy.RunnerPackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.seleniumeasy.BrowserHandling.TestBase;
import com.seleniumeasy.BusinessFunctions.BusinessFunctionalities;

public class DriverScript extends TestBase
{
	BusinessFunctionalities businessFunctionalities;
	@BeforeClass
	public void initObjects()
	{
		businessFunctionalities = new BusinessFunctionalities(driver);
	}
	
	@Test(dataProvider = "SubmitFormData", dataProviderClass = com.seleniumeasy.DataCollection.DataCollections.class)
	public void submitFormTest(String firstName, String lastName, String email, String phone, String state) throws InterruptedException
	{
		businessFunctionalities.submitForm(firstName, lastName, email, phone, state);
	}

}