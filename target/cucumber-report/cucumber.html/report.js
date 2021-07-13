$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/buyagift/resources/featurefile/Holiday.feature");
formatter.feature({
  "line": 1,
  "name": "Register Functionality",
  "description": "\r\nAs a new buyagift customer\r\nI want to be able to book my short break holiday",
  "id": "register-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8492399000,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Verify user should able to book short break holiday",
  "description": "",
  "id": "register-functionality;verify-user-should-able-to-book-short-break-holiday",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on buyagift homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on short break button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on one night break button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should be able to see one night break holiday list on page",
  "keyword": "Then "
});
formatter.match({
  "location": "HolidayTest.iAmOnBuyagiftHomepage()"
});
formatter.result({
  "duration": 148069100,
  "status": "passed"
});
formatter.match({
  "location": "HolidayTest.iClickOnShortBreakButton()"
});
formatter.result({
  "duration": 6070282400,
  "status": "passed"
});
formatter.match({
  "location": "HolidayTest.iClickOnOneNightBreakButton()"
});
formatter.result({
  "duration": 31358863400,
  "status": "passed"
});
formatter.match({
  "location": "HolidayTest.iShouldBeAbleToSeeOneNightBreakHolidayListOnPage()"
});
formatter.result({
  "duration": 16300,
  "status": "passed"
});
formatter.after({
  "duration": 69800,
  "status": "passed"
});
});