package com.seleniumeasy.DataCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class DataCollections 
{
	
	String excelPath = ".\\TestData\\TestDataSheet.xlsx";
	Fillo fillo;
	Connection connection;
	
	public DataCollections() throws FilloException
	{
		fillo = new Fillo();
		connection=fillo.getConnection(excelPath);
	}
	
	
	@DataProvider(name="SubmitFormData")
	public Iterator<String[]> dataCollectionSubmitFormTest() throws FilloException
	{
		String query = "select firstname, lastname, email,phone, state from sheet1 where flag='Y' and scenario='SubmitForm'";
		List<String[]> list = new ArrayList<String[]>();
		Recordset records = connection.executeQuery(query);
		try
		{
			if(records!=null)
			{
				while(records.next())
				{
					String[] str = new String[5];
					str[0] = records.getField("firstname");
					str[1] = records.getField("lastname");
					str[2] = records.getField("email");
					str[3] = records.getField("phone");
					str[4] = records.getField("state");
					list.add(str);
				}
			}
		}
		catch(NullPointerException e)
		{
			//Logging
			Reporter.log("There are no records found for Submit Form scenario");
		}
		catch(Exception e)
		{
			//Logging
			Reporter.log("There are no records found for Submit Form scenario");
		}
		return list.iterator();
	}

}
