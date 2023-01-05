package com.ebayyTestRunner.qa;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.ebayyUtility.qa.ebayyBaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/ebayyResources/java/ebayyFeatures"},
plugin = {"json:target/cucumber.json"},
glue = "ebayyStepDeff", tags = {"@testSearch"})

public class ebayyTestRunnerClass extends AbstractTestNGCucumberTests {
	@BeforeTest
	public void startURL() {
		ebayyBaseClass test = new ebayyBaseClass();
		test.initBrowser();
	}
	
	@AfterTest 
	public void closeURL() {
		ebayyBaseClass test = new ebayyBaseClass();
		test.driver.quit();
	}
}
