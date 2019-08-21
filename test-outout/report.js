$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free_CRM_Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is available on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "tittle of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and user enters password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_is_available_on_login_page()"
});
formatter.result({
  "duration": 12538553950,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.tittle_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 22802500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_enters_username_and_user_enters_password()"
});
formatter.result({
  "duration": 308090780,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 8853870302,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_home_page()"
});
formatter.result({
  "duration": 9502841,
  "status": "passed"
});
});