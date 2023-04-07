package com.tutorialsninja.automation.stepdef;

import java.util.Map;
import java.util.Properties;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.ResisterPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class Register {
	
	HeadersSection headersSection = new HeadersSection();
	ResisterPage resisterPage = new ResisterPage();
	AccountSuccessPage accountSuccessPage = new AccountSuccessPage();
	Properties properties;

	@Given("^I launch the application$")
	public void I_launch_the_application() {
		Base.driver.get(Base.reader.getUrl());

	}

	@And("^I navigate to Account Registration Page$")
	public void i_navigate_to_Account_Registration_Page() {
		Elements.click(HeadersSection.getMyAccountLink());
		Elements.click(HeadersSection.getResisterLink());
	}

	@When("^I provide all the below valid details$")
	public void I_provide_all_the_below_valid_details(DataTable dataTable) {
		ResisterPage.enterRegistrationPageDetails(dataTable);
	}

	@And("^I select the privacy policy$")
	public void i_select_the_privacy_policy() {
		Elements.click(ResisterPage.getCheckboxPrivacyPolicy());
	}

	@And("^I click continue button$")
	public void i_click_continue_button() {
		Elements.click(ResisterPage.getSubmitButton());

	}

	@Then("^I should see the User account has been created successfully$")
	public void i_should_see_the_User_account_has_been_created_successfully() {
		Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.getSuccessBreadCrumb()));
	
	}

}
