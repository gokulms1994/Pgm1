package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(features ="C:\\Users\\GOKUL MS\\eclipse-workspace5\\"
			+ "Task1\\src\\test\\java\\com\\app\\feature",
			glue="stepdefinition",
			dryRun=false,
			publish=true,
			monochrome=true
		     )
	public class Runner {

}
