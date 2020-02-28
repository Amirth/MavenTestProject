$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/LoginData.feature");
formatter.feature({
  "line": 1,
  "name": "Login feature with Data for Orange HRM",
  "description": "",
  "id": "login-feature-with-data-for-orange-hrm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "This is Login scenario with data",
  "description": "",
  "id": "login-feature-with-data-for-orange-hrm;this-is-login-scenario-with-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Launch Login Page Application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User Enter Valid credentails \"Admin\" and \"admin123\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "login page redirect to HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDataSteps.launch_Login_Page_Application()"
});
formatter.result({
  "duration": 8302736382,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 30
    },
    {
      "val": "admin123",
      "offset": 42
    }
  ],
  "location": "LoginDataSteps.user_Enter_Valid_credentails_and(String,String)"
});
formatter.result({
  "duration": 315461277,
  "status": "passed"
});
formatter.match({
  "location": "LoginDataSteps.user_click_on_Login_Button()"
});
formatter.result({
  "duration": 8267338438,
  "status": "passed"
});
formatter.match({
  "location": "LoginDataSteps.login_page_redirect_to_HomePage()"
});
formatter.result({
  "duration": 85279074,
  "status": "passed"
});
});