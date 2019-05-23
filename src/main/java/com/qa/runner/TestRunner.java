package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\USER\\Rangam Infotech\\rangamRemoteProj\\Feature\\login.feature", glue = {"com.qa.stepDefinition"},
 plugin = {"pretty","html:test-output","json:test-json/Cucumber.json"},dryRun = false, monochrome = true,strict = true)

public class TestRunner {

}
