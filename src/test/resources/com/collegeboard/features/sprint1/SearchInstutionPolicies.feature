Feature: Instutition policy search

@Smoke
Scenario: user searches for instution policies
	Given the user is on the clep page
	When the user verifies the CLEP text at the top-left corner
	And the user clicks on the Earn College Credit link to open the tab
	And the user clicks on the Get Started link
	And the user verifies that video exists on the page (gets video title or url)
	And user clicks on the Colleges and Universities link
	And the user verifies that Unites States is selected as the default option
	And the user selects VA as a state
	And the user enters a keyword in the Enter a College or University Name box
	And the user gets the texts of available options and selects George Mason
	And the user verifies that Geroge Mason is selected
	And the user clicks on the Search button 
	And the user gets the Score and Credit Information by Exam
	Then the user gets the list of exams with the passing score of 50,0