Feature: Login on Linkedin

Scenario: Logging successful.
	When I enter to the LinkedIN app
	And The required fields are filled with valid data.
	| Email                 | Password        |
	| cgarcete@technisys.com| linkedintester  |
	And The button is pressed.
	Then The user logs successfully.
	
Scenario: Login with an unregistered email.
	When I enter to the LinkedIN app
	And The required fields are filled with invalid data.
	| Email                 | Password        |
	| aaaaa@technisys.com   | aaaaaaaaaaaaaaa |
	And The button is pressed.
	Then The system display an error message.