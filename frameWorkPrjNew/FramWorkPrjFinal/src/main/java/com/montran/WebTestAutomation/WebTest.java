package com.montran.WebTestAutomation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.montran.Utilities.Utils;

public class WebTest {
	
	RemoteWebDriver Driver;
	public HashMap<String,WebElement> ObjectRepo=new HashMap<String,WebElement>();

	public void StartTest(String BrowserName)
	{
		StartBrowser(BrowserName);
		OpenApplicationURL();
	}
	
	void StartBrowser(String BrowserName)
	{
		switch(BrowserName)
		{
			case "CHROME"://chrome browser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Documents\\chromedriver.exe");
				Driver=new ChromeDriver();
				break;
				
			case "FIREFOX"://firefox browser
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Dell\\Documents\\Montran-Selenium-testing\\Drivers\\chromedriver.exe");
				Driver=new FirefoxDriver();
				break;
				
		}
	}
	
	public void EnterText(WebElement Element,String EnteredText)
	{
		Element.sendKeys(EnteredText);
	}
	
	public void ClickElement(WebElement Element)
	{
		Element.click();
	}
	
	

	public void CreateObjectRepository(String FileName)
	{
		
		String ObjectRepositoryFilePath=Utils.EnvVars.get("OBJECT_REPOSITORY_LOC")+"\\"+FileName+".csv";
		try 
		{
			//Opening File in Read Mode
			FileReader FR=new FileReader(ObjectRepositoryFilePath);
			BufferedReader BR=new BufferedReader(FR);
			String Line=BR.readLine();
			while(Line!=null)
			{
				
				String[]parts=Line.split(",");
				String Key=parts[0];
				String IdentificationStratergy=parts[1];
				String Locator=parts[2]; 
				
				WebElement RequiredElement=FindAndReturnWebElement(IdentificationStratergy,Locator);
				ObjectRepo.put(Key, RequiredElement);
				Line=BR.readLine();
			}
			
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("Required File : "+ObjectRepositoryFilePath+" Not Found.");
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("Problem In Reading Required File : "+ObjectRepositoryFilePath);
		}
	}
	
	public WebElement FindAndReturnWebElement(String StratergyToken,String Locator)
	{
		switch(StratergyToken)
		{
			case "BY_ID":
				return Driver.findElementById(Locator);
			case "BY_CSS":
				return Driver.findElementByCssSelector(Locator);
			case "BY_XPATH":
				return Driver.findElementByXPath(Locator);
			case "BY_TAGNAME":
				return Driver.findElementByTagName(Locator);
			case "BY_NAME":
				return Driver.findElementByName(Locator);
			case "BY_LINKTEXT":
				return Driver.findElementByLinkText(Locator);
			case "BY_PARTIALLINKTEXT":
				return Driver.findElementByPartialLinkText(Locator);
		}
		return null;
	}
	public void OpenApplicationURL()
	{
		Driver.get(Utils.EnvVars.get("APPLICATION_URL"));
	}
	public String GetCurrentPageURL()
	{
		return Driver.getCurrentUrl();
	}
	
	public void StopTest()
	{
		Driver.quit();
	}

}
