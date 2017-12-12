@Regression
Feature: Sign Up feature


Scenario: User signs up for clep account
	Given the user is on the clep page
	When the user verifies the title and the url
	And the user clicks on the sign in link
	And the user clicks on the sign up button
	And the user clicks on the Student link
	And the user enters the first name
	And the user enters the last name
	And the user enters the email addres
	And the user confirms the email address
	And the user enters the zip code
	And the user enters a username
	And the user enters a password
	And the user user confirms the password
	And the user chooses a security question from dd list
	And the user provides an answer for the security question
	And the user clicks on the CLEP alerts
	And the user clicks on the I agree with the Terms & Conditions.
	Then the user clicks on the next button
