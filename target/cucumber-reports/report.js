$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "Test Login Functionality",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Checking Login functionality with Valid Credentials",
  "description": "",
  "id": ";checking-login-functionality-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on login screen",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters \"Admin\" in UserName field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters \"admin123\" in Password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks on SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should be successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinations.TakeUserOnLoginScreen()"
});
formatter.result({
  "duration": 28321707700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinations.EnterUserName(String)"
});
formatter.result({
  "duration": 48508300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinations.EnterPassword(String)"
});
formatter.result({
  "duration": 50698700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.ClickSignInButton()"
});
formatter.result({
  "duration": 5941344500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.SuccessfullLoginConfirmation()"
});
formatter.result({
  "duration": 24464200,
  "status": "passed"
});
});