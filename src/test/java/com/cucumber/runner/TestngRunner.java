package com.cucumber.runner;

import org.testng.annotations.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"com.cucumber.stepdefinitions"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:","pretty", "html:target/cucumber-html-report",
        		"json:target/cucumber.json", "junit:target/cucumber.xml"},
        		tags={ "@tag2"}
)


public class TestngRunner extends AbstractTestNGCucumberTests {
	
	@BeforeClass
	public void setup(){
		
	}

}
