package com.collegeboard.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.collegeboard.utilities.Config;
import com.collegeboard.utilities.Driver;

public class SearchInstutionPoliciesPage {

	public SearchInstutionPoliciesPage() {

		PageFactory.initElements(Driver.getInstance(), this);
		
	}
	
	@FindBy(xpath="//*[@id='block-menu-block-1']/div/div/div/div/nav/div/div/ul/li[3]/a/span[1]")
	public WebElement earnCollegeCreditLink;
	
	@FindBy(xpath="//*[@id='block-menu-block-1']/div/div/div/div/nav/div/div/ul/li[3]/ul/li[2]/a/span")
	public WebElement getStartedLink;
	
	@FindBy(xpath="//iframe[@allowfullscreen='']")
	public WebElement videoInfo;
	
	@FindBy(xpath="//iframe[@allowfullscreen='']")
	public WebElement videoBtn;
	
	@FindBy(xpath="//a[contains(text(), '2,900 colleges and universities')]")
	public WebElement collegeAndUniversitiesLink;
	
	@FindBy(xpath="//select[@id='lv-form-country']/option[2]")
	public WebElement usaSelected;
	
	
	@FindBy(xpath="//select[@id='lv-form-country']")
	public WebElement ddMenuCountyrSelection;

	
	@FindBy(xpath=".//select[@id='lv-form-state']")
	public WebElement ddMenuForStateSelection;

	@FindBy(xpath=".//*[@id='clep_policy_search']/div/form/div[5]/div/span/button")
	public WebElement searchBtn;
	
	
	public void open(){
		
		Driver.getInstance().get(Config.getProperty("url"));
	
	}
	
	
	
	
	
	
}
