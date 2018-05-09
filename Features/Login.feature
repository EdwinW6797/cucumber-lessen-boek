Feature: Login funtionality for demowebshop.tricentis.com 

Background: 
	Given User is on http://demowebshop.tricentis.com
	When User clicks on login link 

 Scenario: Verify the user is able to Login with username and password	
	And user logs in using valid username edwin.wijers@sqs.test and password Tosca1234!
	Then user is taken to the myaccount page 
	Then User navigates to apparel page
	And User clicks on the Blue Jeans Add to cart button
	And One blue jeans is added to the cart
