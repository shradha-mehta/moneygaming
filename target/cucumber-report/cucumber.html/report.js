$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/gameaccount/qa/moneygaming/resources/featurefile/registration.feature");
formatter.feature({
  "line": 1,
  "name": "Register Functionality",
  "description": "\r\nAs a new moneygaming.com player\r\nI want to be able to register using my full details\r\nSo that I can play online casino games",
  "id": "register-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Verify user should not register without Date of Birth",
  "description": "",
  "id": "register-functionality;verify-user-should-not-register-without-date-of-birth",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I am on money gaming homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on join now button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select title",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter my first name \"\u003cfirstName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I enter sur name \"\u003csurName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on check box of terms and condition",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on join now form button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should not register successfully and see \"\u003cerrorMessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "register-functionality;verify-user-should-not-register-without-date-of-birth;",
  "rows": [
    {
      "cells": [
        "firstName",
        "surName",
        "errorMessage"
      ],
      "line": 18,
      "id": "register-functionality;verify-user-should-not-register-without-date-of-birth;;1"
    },
    {
      "cells": [
        "Tameena",
        "Martin",
        "This field is required"
      ],
      "line": 19,
      "id": "register-functionality;verify-user-should-not-register-without-date-of-birth;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 27190527800,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Verify user should not register without Date of Birth",
  "description": "",
  "id": "register-functionality;verify-user-should-not-register-without-date-of-birth;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I am on money gaming homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on join now button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select title",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter my first name \"Tameena\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I enter sur name \"Martin\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on check box of terms and condition",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on join now form button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should not register successfully and see \"This field is required\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationTest.iAmOnMoneyGamingHomepage()"
});
formatter.result({
  "duration": 219408900,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationTest.iClickOnJoinNowButton()"
});
formatter.result({
  "duration": 21607933200,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationTest.iSelectTitle()"
});
formatter.result({
  "duration": 139371600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tameena",
      "offset": 23
    }
  ],
  "location": "RegistrationTest.iEnterMyFirstName(String)"
});
formatter.result({
  "duration": 270819700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Martin",
      "offset": 18
    }
  ],
  "location": "RegistrationTest.iEnterSurName(String)"
});
formatter.result({
  "duration": 226341400,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationTest.iClickOnCheckBoxOfTermsAndCondition()"
});
formatter.result({
  "duration": 180900900,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationTest.iClickOnJoinNowFormButton()"
});
formatter.result({
  "duration": 177530300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This field is required",
      "offset": 44
    }
  ],
  "location": "RegistrationTest.iShouldNotRegisterSuccessfullyAndSee(String)"
});
formatter.result({
  "duration": 82457900,
  "status": "passed"
});
formatter.after({
  "duration": 149700,
  "status": "passed"
});
});