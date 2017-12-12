package com.collegeboard.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.collegeboard.utilities.Config;
import com.collegeboard.utilities.Driver;

public class RegisterAndSchedulePage {

	public RegisterAndSchedulePage() {

		PageFactory.initElements(Driver.getInstance(), this);

	}

	
	@FindBy(xpath="//div[@class='content']/h1")
	public WebElement pageHeaderText;
	
	@FindBy(xpath=".//form[@id='purchase-clep-exams-form']/fieldset[1]/div[@class='checkbox h3 clep-product-exam']")
	public WebElement financialAccountingCheckBox;
	
	@FindBy(xpath=".//button[@type='button']")
	public WebElement addToCartBtn;
	
	@FindBy(xpath=".//*[@id='add-clep-study-guides']/div[3]/div/a")
	public WebElement addMaterialsAndCheckOutBtn;
	
	@FindBy(xpath="//input[@id='regCheckoutBtn']")
	public WebElement registerAndCheckOut;
	
	@FindBy(xpath="//div[@class='content']/h1")
	public WebElement registerForCLEPText;
	
	@FindBy(xpath="//select[@id='lv-form-state']")
	public WebElement ddMenuForStateSlection;
	
	@FindBy(xpath=".//input[@id='lv-form-zip']")
	public WebElement zipCodeBox;
	
	
	@FindBy(xpath=".//select[@id='lv-form-radius']")
	public WebElement ddMenuForRadius;
	
	@FindBy(xpath=".//*[@id='lv-form-radius']/option[1]")
	public WebElement radiusSelectionFromddMenu;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg']")
	public WebElement searchBtn;
	
	@FindBy(xpath="//a[@href='https://maps.google.com/maps?daddr=5000%20Dawes%20Avenue%20%20%20%2C%2BAlexandria%2BVA%2B22311-5097']")
	public WebElement getDirectionsBtn;
	
	
	@FindBy(xpath="//div[@id='sb_ifc51']/input")
	public WebElement addressLineForNOVA;
	
	@FindBy(xpath=".//*[@id='clep_test_center_search']/div/div/div/div/div/div[1]/ul/li[5]/div/div[2]/ul/li[3]/a/span[1]")
	public WebElement websiteLinkforNOVA;
	
	
	
	
	
	
	
	public void open() {
		
		Driver.getInstance().get(Config.getProperty("urlForRegisteration"));
	}
}
