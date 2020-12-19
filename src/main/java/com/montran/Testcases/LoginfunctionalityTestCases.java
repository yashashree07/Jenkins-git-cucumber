package com.montran.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.montran.Pages.LoginPage;

public class LoginfunctionalityTestCases {
	
	LoginPage Page;
	
	@BeforeClass
	@Parameters({"BROWSER"})
	public void Init(String BrowserName)
	{
		Page=new LoginPage(BrowserName);
	}
	
	@Test
	public void TestLoginValidCredentials()
	{
		Page.DoLogin("Admin", "admin123");
		String PAGEURL=Page.GetCurrentPageURL();
		Assert.assertEquals(PAGEURL, "https://opensource-demo.orangehrmlive.com/index.php/dashboard","Login functionality did not work with Valid Credentials");
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		Page.T.StopTest();
	}

}
