$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Login.feature");
formatter.feature({
  "name": "Test Login functionality of Facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Open FireFox and start facebook application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.LoginSteps.Open_FireFox_and_start_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.LoginSteps.User_enter_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should able to login page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.LoginSteps.User_should_able_to_login_page()"
});
formatter.result({
  "status": "passed"
});
});