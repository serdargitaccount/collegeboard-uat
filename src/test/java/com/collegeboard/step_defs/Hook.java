package com.collegeboard.step_defs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.collegeboard.utilities.Driver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

	WebDriver driver = Driver.getInstance();

	@Before
	public void setUp() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.manage().window().maximize();
	}

	@After
	public void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}

		Driver.closeDriver();

	}

}

// @Before(order=0)
// public void beforeScenario(){
//
// //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// driver.manage().window().maximize();
// System.out.println("This will run before every Scenario");
// System.out.println();
//
// }
//
// @Before(order=1)
// public void beforeScenarioStart(){
//
// System.out.println("-----------------Start of Scenario-----------------");
// System.out.println();
// //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// driver.manage().window().maximize();
//
//
// }
//
//
// @After(order=1)
// public void afterScenarioFinish(Scenario scenario){
//
//
// System.out.println("-----------------End of Scenario-----------------");
// System.out.println();
//
// if (scenario.isFailed()) {
// final byte[] screenshot = ((TakesScreenshot)
// driver).getScreenshotAs(OutputType.BYTES);
// scenario.embed(screenshot, "image/png");
// }
// }
//
// @After(order=0)
// public void afterScenario(){
//
// System.out.println("This will run after every Scenario");
// System.out.println();
//
// Driver.closeDriver();
//
// }
//
// }
