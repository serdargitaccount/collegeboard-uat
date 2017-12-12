package com.collegeboard.step_defs.sprint1;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.collegeboard.pages.SignUpPage;
import com.collegeboard.utilities.Config;
import com.collegeboard.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpForClep {

	
	SignUpPage homePage = new SignUpPage();
	WebDriver driver = Driver.getInstance();
	private JavascriptExecutor js;
	
	@Given("^the user is on the clep page$")
	public void the_user_is_on_the_clep_page() throws Throwable {

		homePage.open();
		driver.manage().window().maximize();

	}

	@When("^the user verifies the title and the url$")
	public void the_user_verifies_the_title_and_the_url() throws Throwable {

		String actualUrl = driver.getCurrentUrl();
		// System.out.println(actualUrl);
		String expectedUrl = "https://clep.collegeboard.org/";
		assertTrue(actualUrl.equals(expectedUrl));

		String actualTitle = driver.getTitle();
		// System.out.println(actualTitle);
		String expectedTitle = "CLEP – Get College Credit With What You Already Know – The College Board";
		assertTrue(actualTitle.equals(expectedTitle));

		assertTrue(homePage.CLEPtext.isDisplayed());
		String clepTxt = homePage.CLEPtext.getText();
		System.out.println(clepTxt);

	}

	@When("^the user clicks on the sign in link$")
	public void the_user_clicks_on_the_sign_in_link() throws Throwable {

		homePage.signInLink.click();
		Thread.sleep(2000);

	}

	@When("^the user clicks on the sign up button$")
	public void the_user_clicks_on_the_sign_up_button() throws Throwable {

		homePage.signUpbtn.click();

	}

	@When("^the user clicks on the Student link$")
	public void the_user_clicks_on_the_Student_link() throws Throwable {

		homePage.aStudentLink.click();

	}

	@When("^the user enters the first name$")
	public void the_user_enters_the_first_name() throws Throwable {
		
		homePage.firstName.sendKeys(getProperty("firstName"));
		
	}

	@When("^the user enters the last name$")
	public void the_user_enters_the_last_name() throws Throwable {
		
		homePage.lastName.sendKeys(getProperty("lastName"));
		
	}

	@When("^the user enters the email addres$")
	public void the_user_enters_the_email_addres() throws Throwable {
		
		homePage.emailAddress.sendKeys(getProperty("email"));
	}

	@When("^the user confirms the email address$")
	public void the_user_confirms_the_email_address() throws Throwable {
		
		homePage.confirmEmail.sendKeys(getProperty("email"));
	}

	@When("^the user enters the zip code$")
	public void the_user_enters_the_zip_code() throws Throwable {
		
		homePage.zipCode.sendKeys(getProperty("zipCode"));
	}

	@When("^the user enters a username$")
	public void the_user_enters_a_username() throws Throwable {
		
		homePage.userName.sendKeys(getProperty("userName"));
	}

	@When("^the user enters a password$")
	public void the_user_enters_a_password() throws Throwable {
		
		homePage.password.sendKeys(getProperty("password"));

	}

	@When("^the user user confirms the password$")
	public void the_user_user_confirms_the_password() throws Throwable {

		homePage.confirmPassword.sendKeys(getProperty("password"));

	}

	@When("^the user chooses a security question from dd list$")
	public void the_user_chooses_a_security_question_from_dd_list() throws Throwable {
		
		Select dd = new Select(homePage.ddMenuForSecurityQuestion);
		
		//Page kisminda ortak xpath verek locator'i kapatmama ragmen loop calisti. Demek ki
		//loop icin dd menunun yerini bulmak kafi oluyormus.
		//int size = homePage.securityQuestion.size();
		
		for (int i = 0; i <=2; i++) {
			dd.selectByIndex(i);
			
		}

	}

	@When("^the user provides an answer for the security question$")
	public void the_user_provides_an_answer_for_the_security_question() throws Throwable {

			homePage.securityAnswerField.sendKeys(getProperty("answerForSecurityQuestion"));
		
	}

	@When("^the user clicks on the CLEP alerts$")
	public void the_user_clicks_on_the_CLEP_alerts() throws Throwable {
		
		
		boolean isChecked = homePage.clepAlerts.isSelected();
		
		if (!isChecked){
			
			homePage.clepAlerts.click();
			
		}else{
			
			System.out.println( "Clep Alerts Box is already selected");
		}
				
		
	}

	@When("^the user clicks on the I agree with the Terms & Conditions\\.$")
	public void the_user_clicks_on_the_I_agree_with_the_Terms_Conditions() throws Throwable {
		
		js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0, 750);");
		
		js.executeScript("arguments[0].scrollIntoView(true);", homePage.agreeTermsBox);
		
		Thread.sleep(2000);
		homePage.agreeTermsBox.click();

	}

	@Then("^the user clicks on the next button$")
	public void the_user_clicks_on_the_next_button() throws Throwable {

			homePage.nextBtn.click();
	}

	
	
	

	// Config sinifinidan Config.getProperty olarak uzun uzun cagirmamak icin
	// metodu burada
	// get Property metodunun icine koyduk. Boylece sadece getProperty deyip
	// configuration
	// properties'den bilgi transferi yapabiliriz.

	public String getProperty(String keyName) {
		return Config.getProperty(keyName);

	}
	
}
