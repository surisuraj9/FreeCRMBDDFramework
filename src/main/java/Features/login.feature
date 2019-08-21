Feature: Free_CRM_Login Feature

#without Examples Keyword
#Scenario: Free CRM Login Test Scenario

#Given user is available on login page
#When tittle of login page is Free CRM
#Then user enters "surajp" and user enters "suraj1234"
#Then user clicks on login button
#Then user is on home page
#Then close the browse

#With Examples Keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is available on login page
When tittle of login page is Free CRM
Then user enters "<username>" and user enters "<password>"
Then user clicks on login button
Then user is on home page
Then close the browser

Examples:
	| username | password |
	| surajp   | suraj1234|