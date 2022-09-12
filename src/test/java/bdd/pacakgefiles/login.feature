Feature: Actitime Login

	Scenario: Valid Login Scenarios for Actitime
	Given I launch the actitime application
	When I enter "admin" as username and "manager" as password
	And Click on Login Button
	Then The user should login successfully and the logout link should be displayed  	