Feature: Login Action
 
Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters UserName and Password

	 |UesrName|ankur|
     |PassWord|password|
	Then Message displayed Login Successfully
	|Name|LastName|userNAme|Email|Passwordd|Cpassword|
	|ahardik|anarola|aahardik|ahardik@gmail.com|password|password|
	|aa|aavaa|hhhh|aad@gmail.com|pdasswfvfvord|padssdfvdfvword|
	|aaadfdsfaa|aaavdfva|hghghgg|adfdfa@gmail.com|padssfvdfcvword|padssfvfvfff v vword|
	