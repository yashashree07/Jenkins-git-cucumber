package com.montran.Pages;

public class LoginPage extends BasePage{
	
	public LoginPage(String BrowserName)
	{
		T.StartTest(BrowserName);
		T.CreateObjectRepository("LoginPage");
	}
	
	public void EnterUserName(String UserName)
	{
		T.EnterText(T.ObjectRepo.get("UserNameField"), UserName);
	}
	
	public void EnterPassword(String Password)
	{
		T.EnterText(T.ObjectRepo.get("PasswordField"), Password);
	}
	
	public void ClickSignInBtn()
	{
		T.ClickElement(T.ObjectRepo.get("SignInBtn"));
	}
	
	public void DoLogin(String UserName,String Password)
	{
		EnterUserName(UserName);
		EnterPassword(Password);
		ClickSignInBtn();
	}
	

}
