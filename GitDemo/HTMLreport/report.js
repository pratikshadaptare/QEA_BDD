$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/HeroKu.feature");
formatter.feature({
  "name": "Test Heroku",
  "description": "  Test login Functions",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDifinition.LoginTest.i_am_on_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user eneter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDifinition.LoginTest.user_eneter_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDifinition.LoginTest.login_successfully()"
});
formatter.result({
  "status": "passed"
});
});