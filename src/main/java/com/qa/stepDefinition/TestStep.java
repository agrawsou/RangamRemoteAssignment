package com.qa.stepDefinition;

import java.awt.AWTException;

import com.qa.base.TestBase;
import com.qa.pages.TestPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStep extends TestBase {
	
	TestPage page;

	public TestStep() {
		super();
	}
	
	@Given("^user is on login page$")
	public void userOnLoginPage() {
		initialization();
	}
	
	@When("^User logins by using the valid credentials$")
	public void userLogin() {
		page = new TestPage();
		page.login();
	}
	
	@Then("^User verifies that home page is displayed successfully$")
	public void verifyHomePage() {
		page = new TestPage();
		page.getTitle();
	}
	
	@When("^User clicks on BGC form$")
	public void clickForm() {
		page = new TestPage();
		page.openBgcForm();
	}
	@Then("^User fills out the details in the form and submits the form$")
	public void enterValues() {
		page = new TestPage();
		page.enterDetails();
	}
	
	@When("^User clicks on the profile icon$")
	public void selectProfile() {
		page = new TestPage();
		page.clickProfile();
	}
	
	@Then("^User adds a new profile picture$")
	public void uploadProfilePic() throws AWTException, InterruptedException {
		page = new TestPage();
		page.uploadProfile();
	}
}
