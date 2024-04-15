Feature: Login 

Scenario: Successful Login with Valid Credentials 
	Given User Launch Chrome browser 
	When User opens the URL "http://admin-demo.nopcommerce.com/login" 
	And User enters the  Email as "admin@yourstore.com" and Password as "admin" 
	And Click on the Loginbutton 
	Then Page Title should be same "Dashboard / nopCommerce administration" 
	When User click on the Log out link 
	Then Page Title should be same "Your store. Login" 
	And browser gets close 
	
Scenario Outline: Successful Login with valid data
	Given User Launch Chrome browser 
	When User opens the URL "http://admin-demo.nopcommerce.com/login" 
	And User enters the  Email as "<email>" and Password as "<password>" 
	And Click on the Loginbutton 
	Then Page Title should be same "Dashboard / nopCommerce administration" 
	When User click on the Log out link 
	Then Page Title should be same "Your store. Login" 
	And browser gets close 
	
Examples:
|email|password|
|admin@yourstore.com|admin|
|admin123@yourstore.com|admin|