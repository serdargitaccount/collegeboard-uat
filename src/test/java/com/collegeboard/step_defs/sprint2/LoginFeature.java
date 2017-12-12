package com.collegeboard.step_defs.sprint2;



import org.openqa.selenium.WebDriver;

import com.collegeboard.pages.LoginPage;
import com.collegeboard.utilities.Driver;

import cucumber.api.java.en.Given;

public class LoginFeature {
	
	
	LoginPage loginPage = new LoginPage();
	WebDriver driver = Driver.getInstance();
	
	
	@Given("^the user enters the \"([^\"]*)\" and the \"([^\"]*)\"$")
	public void the_user_enters_the_and_the(String userName, String password) throws Throwable {
		
		driver.get("https://account.collegeboard.org/login/login?appId=274&DURL=https%3A%2F%2Fclepportal.collegeboard.org%2Fclepcand%2Fhome%2Fdashboard.action&idp=ECL");
		loginPage.login(userName, password);
		
		
	}

}
	