$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("computer.feature");
formatter.feature({
  "line": 1,
  "name": "Computer test",
  "description": "As a user I want to purchase computer from nopCommerce website",
  "id": "computer-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11889309500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "verify user should navigate to computer page successfully",
  "description": "",
  "id": "computer-test;verify-user-should-navigate-to-computer-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Computer Tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should navigate to Computer page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verify Computer text",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 1254558900,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnComputerTab()"
});
formatter.result({
  "duration": 625289800,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iShouldNavigateToComputerPageSuccessfully()"
});
formatter.result({
  "duration": 19800,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.verifyComputerText()"
});
formatter.result({
  "duration": 33738600,
  "status": "passed"
});
formatter.after({
  "duration": 1145707400,
  "status": "passed"
});
});