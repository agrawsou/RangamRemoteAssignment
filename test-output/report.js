$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/USER/Rangam Infotech/rangamRemoteProj/Feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login and fill up the BGC form",
  "description": "",
  "id": "login-and-fill-up-the-bgc-form",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login and fill the background verification form",
  "description": "",
  "id": "login-and-fill-up-the-bgc-form;login-and-fill-the-background-verification-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User logins by using the valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User verifies that home page is displayed successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks on BGC form",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User fills out the details in the form and submits the form",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User clicks on the profile icon",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User adds a new profile picture",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStep.userOnLoginPage()"
});
formatter.result({
  "duration": 8624090031,
  "status": "passed"
});
formatter.match({
  "location": "TestStep.userLogin()"
});
formatter.result({
  "duration": 69891084185,
  "status": "passed"
});
formatter.match({
  "location": "TestStep.verifyHomePage()"
});
formatter.result({
  "duration": 228106735,
  "status": "passed"
});
formatter.match({
  "location": "TestStep.clickForm()"
});
formatter.result({
  "duration": 59097555543,
  "status": "passed"
});
formatter.match({
  "location": "TestStep.enterValues()"
});
formatter.result({
  "duration": 66583781774,
  "status": "passed"
});
formatter.match({
  "location": "TestStep.selectProfile()"
});
formatter.result({
  "duration": 115142926780,
  "status": "passed"
});
formatter.match({
  "location": "TestStep.uploadProfilePic()"
});
formatter.result({
  "duration": 7015137591,
  "status": "passed"
});
});