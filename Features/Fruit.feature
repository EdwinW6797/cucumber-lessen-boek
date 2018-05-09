Feature: Checkout
	
	Scenario: Checkout of a banana
		Given the price of a "banana" is 40c
		When I checkout 1 "banana"
		Then the price should be 40c
		
		