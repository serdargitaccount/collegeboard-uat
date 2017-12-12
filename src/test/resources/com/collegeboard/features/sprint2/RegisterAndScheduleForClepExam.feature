Feature: Registration and Schedule feature

@Regression
Scenario: user registers for several CLEP exams
	Given the user is on the registeration page
	When the user verifies Register for CLEP Exams text is displayed
	And the user selects three course from Business
	And the user selects three courses from Composition & Literature
	And the user selects three courses from Foreign Languages
	And the user selects three courses from History & Social Sciences
	And the user selects three courses from Science & Mathematics
	And the user click on the add to cart button
	And the user adds the materials and checkout
	And the user clicks on the register and checkout 

@FindATestCenter
Scenario: user searches for a test center
	Given the user is on find a test center search page
	When the user verifies Find a Test Center
	And the user selects a state
	And the user enters a zipcode
	And the user selects the radious
	And the user clicks on the search button
	And the user clicks on the direction link for NOVA  
	And the user verifies the destination address from the new window
	And the user navigates back to the parent window
	And the user clicks on the visit wbesite link
	And the user verifies the url
	Then the user closes all of the windows opened. 
	
	 
#	 
#This did not work. It was supposed to give me List	 	 	
#@Smoke
#Scenario: user selects exams  as a bundle
#	Given the courses: litearature, math, geography
		
	

