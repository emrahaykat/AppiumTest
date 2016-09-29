package com.markafoni.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature",
		glue="/markafoni-app-automation/src/test/java/com/markafoni/app",
		
		 plugin = { 
                 "pretty",
                 "html:target/cucumber",
             } 
		
		)

public class BddTestRunner {

}
