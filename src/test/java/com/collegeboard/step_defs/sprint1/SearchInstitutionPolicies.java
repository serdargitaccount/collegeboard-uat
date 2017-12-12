package com.collegeboard.step_defs.sprint1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.collegeboard.pages.SearchInstutionPoliciesPage;
import com.collegeboard.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchInstitutionPolicies {

	SearchInstutionPoliciesPage homePage = new SearchInstutionPoliciesPage();
	WebDriver driver = Driver.getInstance();
	WebDriverWait wait;
	Select dd;
	private JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@When("^the user verifies the CLEP text at the top-left corner$")
	public void the_user_verifies_the_CLEP_text_at_the_top_left_corner() throws Throwable {

		homePage.open();
		driver.manage().window().maximize();
	
	}

	@When("^the user clicks on the Earn College Credit link to open the tab$")
	public void the_user_clicks_on_the_Earn_College_Credit_link_to_open_the_tab() throws Throwable {
	
		homePage.earnCollegeCreditLink.click();
	}

	@When("^the user clicks on the Get Started link$")
	public void the_user_clicks_on_the_Get_Started_link() throws Throwable {

		homePage.getStartedLink.click();
	}

	@When("^the user verifies that video exists on the page \\(gets video title or url\\)$")
	public void the_user_verifies_that_video_exists_on_the_page_gets_video_title_or_url() throws Throwable {

		//Bu kodu iframe isminde bir iframe olup olmadigni anlamak icin yaptik. 1 tane varmis.
		
		Thread.sleep(2000);
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
//		boolean videoButton = homePage.videoTitle.isEnabled();
//		System.out.println(videoButton);
		
		String videoLink = homePage.videoInfo.getAttribute("src");
		String videoTitle = homePage.videoInfo.getAttribute("title");
		System.out.println("Video Link: "+ videoLink +"\n"+"Video Title: "+ videoTitle  );
		
		Thread.sleep(2000);
		homePage.videoBtn.click();
		
		
	}

	@When("^user clicks on the Colleges and Universities link$")
	public void user_clicks_on_the_Colleges_and_Universities_link() throws Throwable {
			
			js.executeScript("window.scrollBy(0, 200);");	
			
//			wait = new WebDriverWait(driver, 20);
//			wait.until(ExpectedConditions.elementToBeClickable(homePage.collegeAndUniversitiesLink));
			homePage.collegeAndUniversitiesLink.click();
			
			
	}

	@When("^the user verifies that Unites States is selected as the default option$")
	public void the_user_verifies_that_Unites_States_is_selected_as_the_default_option() throws Throwable {

			Thread.sleep(2000);
			boolean isUsSelected = homePage.usaSelected.isSelected();
		
			if(!isUsSelected){
				
				dd = new Select(homePage.ddMenuCountyrSelection);
				dd.selectByIndex(1);
				
			}else{
				
				System.out.println("US is already selected");
			}
		
	
	}

	@When("^the user selects VA as a state$")
	public void the_user_selects_VA_as_a_state() throws Throwable {
		
		dd = new Select(homePage.ddMenuForStateSelection);
		dd.selectByValue("VA");
		
	}

	@When("^the user enters a keyword in the Enter a College or University Name box$")
	public void the_user_enters_a_keyword_in_the_Enter_a_College_or_University_Name_box() throws Throwable {

	}

	@When("^the user gets the texts of available options and selects George Mason$")
	public void the_user_gets_the_texts_of_available_options_and_selects_George_Mason() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^the user verifies that Geroge Mason is selected$")
	public void the_user_verifies_that_Geroge_Mason_is_selected() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^the user clicks on the Search button$")
	public void the_user_clicks_on_the_Search_button() throws Throwable {
	
		homePage.searchBtn.click();

	
	}

	@When("^the user gets the Score and Credit Information by Exam$")
	public void the_user_gets_the_Score_and_Credit_Information_by_Exam() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the user gets the list of exams with the passing score of (\\d+),(\\d+)$")
	public void the_user_gets_the_list_of_exams_with_the_passing_score_of(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	
	
	
}


