Feature: This file has registration tests

Scenario: Verify the user is able to regiister
	Given User goes to demoqa.com/registration
	When user fills in the given details in the registration form
		| FirstName|  Edje |
		| LastName| Zag  |
		| PhoneNumber| 0612345678 |
		| UserName| tester01 |
