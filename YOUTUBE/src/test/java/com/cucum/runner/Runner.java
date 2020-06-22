package com.cucum.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		         features="classpath:Features/YouTube.feature",
		         glue= {"com.cucum.StepDefinitions"},
		         format= {"pretty","html:test-output"},
		         monochrome=true,
		         strict=true,
		         dryRun=false
		       //tags{"@RegressionTest","@SmokeTest"}   
		        )

public class Runner {

}
