package com.collegeboard.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.collegeboard.utilities.Config;
import com.collegeboard.utilities.Driver;

public class SignUpPage {
	
	
	public SignUpPage() {
		
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	@FindBy(xpath="//span[@class='lv-gh-login-icon']")
	public WebElement signInLink;
	
	@FindBy(xpath="//a[@class='title cb-program-name']/span")
	public WebElement CLEPtext; 
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	public WebElement signUpbtn;
	
	@FindBy(linkText="a Student")
	public WebElement aStudentLink;
	
	@FindBy(xpath="//input[@id='firstNameField']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@id='lastNameField']")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@id='emailAddressField']")
	public WebElement emailAddress;
	
	@FindBy(xpath="//input[@id='confirmEmailField']")
	public WebElement confirmEmail;
	
	@FindBy(xpath="//input[@id='zipPostalField']")
	public WebElement zipCode;
	
	@FindBy(xpath="//input[@id='userNameField']")
	public WebElement userName;
	
	@FindBy(xpath="//input[@id='passwordField']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='confirmPasswordField']")
	public WebElement confirmPassword;
	
	@FindBy(xpath="//*[@id='registerAccount']/div[12]/div/label/strong")
	public WebElement agreeTermsBox;
	
	@FindBy(xpath="//select[@id='securityQuestionField']")
	public WebElement ddMenuForSecurityQuestion;
	
//	@FindBy (xpath="//select[@id='securityQuestionField']/option")
//	public List<WebElement> securityQuestion;
	
	
	@FindBy(xpath="//input[@id='securityAnswerField']")
	public WebElement securityAnswerField;
	
	@FindBy(xpath="//input[@id='newsAndAlertsIndicator']")
	public WebElement clepAlerts;
	
	@FindBy(xpath="//button[@id='form-submit']")
	public WebElement nextBtn;
	
	
	
	public void open(){
		
		Driver.getInstance().get(Config.getProperty("url"));
	}
	
}
