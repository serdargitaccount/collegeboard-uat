package com.collegeboard.pages;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.collegeboard.utilities.Driver;

public class LoginPage {

	public LoginPage() {

		PageFactory.initElements(Driver.getInstance(), this);

	}

	@FindBy(xpath = "//*[@id='userName']")
	public WebElement userNameBox;

	@FindBy(xpath = "//*[@id='passWord']")
	public WebElement passwordBox;
	
	@FindBy(xpath = "//*[@id='signInActionBlock']/div[1]")
	public WebElement signInBtn;
	
	@FindBy(xpath="//*[@id='mainPage']/div[1]/div")
	public WebElement welcomeText;

	
	
	
	public void login (String userName, String password) throws InterruptedException {
	
	String text = welcomeText.getText();
		
	userNameBox.sendKeys(userName);
	passwordBox.sendKeys(password);
	Thread.sleep(2000);
	signInBtn.click();
	
	//This needs to be modified for different tests.
	//Login sayfasindan bir text bulunarak yapilabilir.
	assertEquals(text, "Welcome");
	
	
		
	
		}
}