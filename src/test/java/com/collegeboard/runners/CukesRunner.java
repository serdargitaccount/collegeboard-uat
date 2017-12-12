package com.collegeboard.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin={"html:target/cucumber", "json:target/report.json"},
		features="./src/test/resources/com/collegeboard/features",
		glue="com.collegeboard.step_defs",
		//tags= {"@Regression", "~@Smoke", "~@Login", "~@FindATestCenter"},
		//tags = "@Login, @Regression, @Smoke, @FindATestCenter",
		tags= "@Regression",
		dryRun=false
		
		
		)


public class CukesRunner {
	
}
