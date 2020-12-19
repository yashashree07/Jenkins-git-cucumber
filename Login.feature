Feature:
	Test Login Functionality
	
	Scenario: Checking Login functionality with Valid Credentials 
		Given User is on login screen
		When User enters "Admin" in UserName field
		And User enters "admin123" in Password field
		And User clicks on SignIn button
		Then User should be successfully logged in 
		