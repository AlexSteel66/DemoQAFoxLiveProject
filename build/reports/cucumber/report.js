$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Registration functionality scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify whether the user is able to register into the application by providing all the fields",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.i_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to Account Registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.i_navigate_to_Account_Registration_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#mysicka\"}\n  (Session info: chrome\u003d87.0.4280.141)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-UH27HGA\u0027, ip: \u0027192.168.0.104\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.141, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\Uzivatel\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:57847}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 5362ca262fae0f0cd25def4c5b02bf2f\n*** Element info: {Using\u003did, value\u003dmysicka}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:365)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat cucumberStuff.StepDefinitions.StepDefinitions.i_navigate_to_Account_Registration_page(StepDefinitions.java:24)\r\n\tat ✽.I navigate to Account Registration page(file:src/test/resources/features/Login.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I provide all the below valid details",
  "rows": [
    {
      "cells": [
        "FirstName",
        "Alexander"
      ]
    },
    {
      "cells": [
        "LastName",
        "Gregor"
      ]
    },
    {
      "cells": [
        "Email",
        "alex.gregor.steelheart@gmail.com"
      ]
    },
    {
      "cells": [
        "Telephone",
        "0918381980"
      ]
    },
    {
      "cells": [
        "Password",
        "fakepassword"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.i_provide_all_the_below_valid_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I select the Privacy Policy",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.i_select_the_Privacy_Policy()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on Continue button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.i_click_on_Continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should see that the User Account has successfully created",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_should_see_that_the_User_Account_has_successfully_created()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/trial.feature");
formatter.feature({
  "name": "Registration functionality scenarios for a trial",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check the user for my trial",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.i_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to Account Registration page for a freedom",
  "keyword": "Given "
});
formatter.match({
  "location": "TrialTest.i_navigate_to_Account_Registration_page_for_a_freedom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I provide all the below valid details neetly",
  "rows": [
    {
      "cells": [
        "FirstName",
        "Alexander"
      ]
    },
    {
      "cells": [
        "LastName",
        "Gregor"
      ]
    },
    {
      "cells": [
        "Email",
        "alex.gregor.steelheart@gmail.com"
      ]
    },
    {
      "cells": [
        "Telephone",
        "0918381980"
      ]
    },
    {
      "cells": [
        "Password",
        "fakepassword"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "TrialTest.i_provide_all_the_below_valid_details_neetly(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});