package com.tutorialsninja.automation.stepdef;
import java.util.Properties;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class Register {
	Properties properties;
	@Given("^I launch the application$")
	public void I_launch_the_application()  {
		Base.driver.get(Base.reader.getUrl());
	    
	}

	@And("^I navigate to Account Registration Page$")
	public void i_navigate_to_Account_Registration_Page()  {
	   
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable datatable)  {
	    
	}

	@And("^I select the privacy policy$")
	public void i_select_the_privacy_policy()  {
	    
	}

	@And("^I click continue button$")
	public void i_click_continue_button()  {
	    
	}

	@Then("^I should see the User account has been created successfully$")
	public void i_should_see_the_User_account_has_been_created_successfully()  {
	   
	}

}
