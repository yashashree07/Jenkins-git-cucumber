package com.montran.Pages;

import com.montran.Utilities.Utils;
import com.montran.WebTestAutomation.WebTest;

public class BasePage {
	
public static WebTest T;
	
	public BasePage()
	{
		
		Utils.InitializeEnvVars();
		T=new WebTest();
	}
	public String GetCurrentPageURL()
	{
		return T.GetCurrentPageURL();
	}

}
