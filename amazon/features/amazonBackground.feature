Feature: amazon testing

Background: 
    Given i launch google chrome browser
		When i open the amazon homepage
		And user clicks on login button
		Then give the "jithendra039@gmail.com" and "Jithendra@039"

    @login
		Scenario: amazon login testing
		
		Then click on loginbtn
		
	  @Orderspage
		Scenario: Open orders tab in amazon
	
		Then click on loginbtn
		Then click on the orders
		