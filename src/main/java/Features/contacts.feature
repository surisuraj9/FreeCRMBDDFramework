Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact scenario

Given user is available on login page
When tittle of login page is Free CRM
Then user enters "<username>" and user enters "<password>"
Then user clicks on login button
Then user is on home page
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:
	| username | password  | firstname | lastname | position |
	| surajp   | suraj1234 | Tom 	   | Peter    | Manager  |
	| surajp   | suraj1234 | David 	   | Dsouza   | Director |