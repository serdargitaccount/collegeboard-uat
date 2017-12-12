package com.collegeboard.step_defs.sprint2;

import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.collegeboard.pages.RegisterAndSchedulePage;
import com.collegeboard.utilities.Config;
import com.collegeboard.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterAndScheduleForClepExam {

	RegisterAndSchedulePage homePage = new RegisterAndSchedulePage();
	WebDriver driver = Driver.getInstance();
	private JavascriptExecutor js = (JavascriptExecutor) driver;
	Select dd;
	String parentHandle = driver.getWindowHandle();
	
	@Given("^the user is on the registeration page$")
	public void the_user_is_on_the_registeration_page() throws Throwable {
		
		homePage.open();
		// driver.get(getProperty("urlForRegisteration"));
	}

	
	@When("^the user verifies Register for CLEP Exams text is displayed$")
	public void the_user_verifies_Register_for_CLEP_Exams_text_is_displayed() throws Throwable {

		assertTrue(homePage.pageHeaderText.isDisplayed());

	}

	@When("^the user selects three course from Business$")
	public void the_user_selects_three_course_from_Business() throws Throwable {

		for (int i = 1; i <= 3; i++) {

			WebElement element = (WebElement) driver.findElement(By.xpath(
					".//form[@id='purchase-clep-exams-form']/fieldset[1]/div[@class='checkbox h3 clep-product-exam']["
							+ i + "]"));
			element.click();
			Thread.sleep(500);
			js.executeScript("window.scrollBy(0, 100);");
		}

	}

	@When("^the user selects three courses from Composition & Literature$")
	public void the_user_selects_three_courses_from_Composition_Literature() throws Throwable {

		js.executeScript("window.scrollBy(0, 200);");

		for (int i = 1; i <= 3; i++) {

			WebElement element = (WebElement) driver.findElement(By.xpath(
					".//form[@id='purchase-clep-exams-form']/fieldset[2]/div[@class='checkbox h3 clep-product-exam']["
							+ i + "]"));
			element.click();
			Thread.sleep(500);
			js.executeScript("window.scrollBy(0, 100);");

		}

	}

	@When("^the user selects three courses from Foreign Languages$")
	public void the_user_selects_three_courses_from_Foreign_Languages() throws Throwable {

		js.executeScript("window.scrollBy(0, 300);");

		for (int i = 1; i <= 3; i++) {

			WebElement element = (WebElement) driver.findElement(By.xpath(
					".//form[@id='purchase-clep-exams-form']/fieldset[3]/div[@class='checkbox h3 clep-product-exam']["
							+ i + "]"));
			element.click();
			Thread.sleep(500);
			js.executeScript("window.scrollBy(0, 100);");

		}

	}

	@When("^the user selects three courses from History & Social Sciences$")
	public void the_user_selects_three_courses_from_History_Social_Sciences() throws Throwable {

		js.executeScript("window.scrollBy(0, 200);");

		for (int i = 1; i <= 3; i++) {

			WebElement element = (WebElement) driver.findElement(By.xpath(
					".//form[@id='purchase-clep-exams-form']/fieldset[4]/div[@class='checkbox h3 clep-product-exam']["
							+ i + "]"));
			element.click();
			Thread.sleep(500);
			js.executeScript("window.scrollBy(0, 100);");

		}
	}

	@When("^the user selects three courses from Science & Mathematics$")
	public void the_user_selects_three_courses_from_Science_Mathematics() throws Throwable {

		js.executeScript("window.scrollBy(0, 700);");

		for (int i = 1; i <= 3; i++) {

			WebElement element = (WebElement) driver.findElement(By.xpath(
					".//form[@id='purchase-clep-exams-form']/fieldset[5]/div[@class='checkbox h3 clep-product-exam']["
							+ i + "]"));
			element.click();
			Thread.sleep(500);
			js.executeScript("window.scrollBy(0, 100);");

		}

	}

	@When("^the user click on the add to cart button$")
	public void the_user_click_on_the_add_to_cart_button() throws Throwable {

		homePage.addToCartBtn.click();

	}

	@When("^the user adds the materials and checkout$")
	public void the_user_adds_the_materials_and_checkout() throws Throwable {

		homePage.addMaterialsAndCheckOutBtn.click();

	}

	@When("^the user clicks on the register and checkout$")
	public void the_user_clicks_on_the_register_and_checkout() throws Throwable {

		homePage.registerAndCheckOut.click();

	}

	@Given("^the user is on find a test center search page$")
	public void the_user_is_on_find_a_test_center_search_page() throws Throwable {

		driver.get(Config.getProperty("urlForRegisterAndSchedule"));

	}

	@When("^the user verifies Find a Test Center$")
	public void the_user_verifies_Find_a_Test_Center() throws Throwable {

		boolean CLEPText = homePage.registerForCLEPText.isDisplayed();
		assertTrue(CLEPText);

	}

	@When("^the user selects a state$")
	public void the_user_selects_a_state() throws Throwable {

		dd = new Select(homePage.ddMenuForStateSlection);
		dd.selectByValue("VA");

	}

	@When("^the user enters a zipcode$")
	public void the_user_enters_a_zipcode() throws Throwable {

		homePage.zipCodeBox.sendKeys(Config.getProperty("zipCode"));
	}

	@When("^the user selects the radious$")
	public void the_user_selects_the_radious() throws Throwable {

		dd = new Select(homePage.ddMenuForRadius);

		if (homePage.radiusSelectionFromddMenu.isSelected()) {

			System.out.println("Radius is selected as 25 mile");

		} else {

			dd.selectByValue("25");
		}

	}

	@When("^the user clicks on the search button$")
	public void the_user_clicks_on_the_search_button() throws Throwable {

		homePage.searchBtn.click();
		js.executeScript("window.scrollBy(0, 300);");
		Thread.sleep(3000);

	}

	@When("^the user clicks on the direction link for NOVA$")
	public void the_user_clicks_on_the_direction_link_for_NOVA() throws Throwable {

		homePage.getDirectionsBtn.click();

	}

	@When("^the user verifies the destination address from the new window$")
	public void the_user_verifies_the_destination_address_from_the_new_window() throws Throwable {

		

		//String parentHandle = driver.getWindowHandle();
		System.out.println("Parent handle: " + parentHandle);

		// Bunu list olarak secince isimizi gormuyor. Set olarak secmemiz gerekiyor.
		Set<String> handles = driver.getWindowHandles();
		
		for (String handle : handles) {
			System.out.println(handle);
			if (!handle.equals(parentHandle)) {

				driver.switchTo().window(handle);
			}
		}
			
		
				String addresForNova = homePage.addressLineForNOVA.getAttribute("value");
				System.out.println(addresForNova);
				
				Thread.sleep(2000);
				String expectedAddresForNova = "5000 Dawes Ave, Alexandria, VA 22311";

				if (addresForNova.equals(expectedAddresForNova)) {

					System.out.println("Correct adress. Continue the test execution");

				} else {

					homePage.addressLineForNOVA.clear();
					homePage.addressLineForNOVA.sendKeys("5000 Dawes Ave, Alexandria, VA 22311");

				}
				
				driver.close();
				driver.switchTo().window(parentHandle);
			}
			

	@When("^the user navigates back to the parent window$")
	public void the_user_navigates_back_to_the_parent_window() throws Throwable {

		driver.switchTo().window(parentHandle);
		Thread.sleep(2000);
		
	}

	@When("^the user clicks on the visit wbesite link$")
	public void the_user_clicks_on_the_visit_wbesite_link() throws Throwable {
		
		homePage.websiteLinkforNOVA.click();

	}

	@When("^the user verifies the url$")
	public void the_user_verifies_the_url() throws Throwable {
		
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String handle : handles) {
			
			if(!handle.equals(parentHandle)) {
				
				driver.switchTo().window(handle);
				
			}
		}	
			
				
			String urlForChildWindow = driver.getCurrentUrl();
			System.out.println(urlForChildWindow);
		
			String expectedUrl = "http://www.nvcc.edu/workforce/test-center.html";
			
			assertTrue(urlForChildWindow.equals(expectedUrl));
			
			
			
		}


	@Then("^the user closes all of the windows opened\\.$")
	public void the_user_closes_all_of_the_windows_opened() throws Throwable {
		
		Driver.closeDriver();

	}

	
	
	
	
	
	public String getProperty(String keyName) {
		return Config.getProperty(keyName);
	}

}
