package com.tutorialsninja.automation.pages;

import java.util.Map;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class ResisterPage {
	static Random random = new Random();
	static int randomInt=random.nextInt(100);
	static int randomTelephone=random.nextInt(10);
	
	
	public ResisterPage() {
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(xpath = "//input[@name='firstname']")
	private static WebElement FirstName;

	@FindBy(xpath = "//input[@name='lastname']")
	private static WebElement Lastname;

	@FindBy(xpath = "//input[@name='email']")
	private static WebElement emailId;

	@FindBy(xpath = "//input[@name='telephone']")
	private static WebElement telephoneNo;

	@FindBy(xpath = "//input[@name='password']")
	private static WebElement password;

	@FindBy(xpath = "//input[@name='confirm']")
	private static WebElement confirmPassword;

	@FindBy(name = "agree")
	private static WebElement checkboxPrivacyPolicy;

	@FindBy(xpath = "//input[@value='Continue']")
	private static WebElement submitButton;

	public static WebElement getFirstName() {
		return FirstName;
	}

	public static WebElement getLastname() {
		return Lastname;
	}

	public static WebElement getEmailId() {
		return emailId;
	}

	public static WebElement getTelephoneNo() {
		return telephoneNo;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public static WebElement getCheckboxPrivacyPolicy() {
		return checkboxPrivacyPolicy;
	}

	public static WebElement getSubmitButton() {
		return submitButton;
	}

public static void enterRegistrationPageDetails(DataTable dataTable) {
	Map<String, String> map = dataTable.asMap(String.class, String.class);
	Elements.clearTxtBox(ResisterPage.getFirstName());
	Elements.TypeText(ResisterPage.getFirstName(), map.get("FirstName")+randomInt);
	Elements.clearTxtBox(ResisterPage.getLastname());
	Elements.TypeText(ResisterPage.getLastname(), map.get("LastName")+randomInt);
	Elements.clearTxtBox(ResisterPage.getEmailId());
	Elements.TypeText(ResisterPage.getEmailId(), System.currentTimeMillis()+map.get("Email"));
	Elements.clearTxtBox(ResisterPage.getTelephoneNo());
	Elements.TypeText(ResisterPage.getTelephoneNo(), map.get("91"+randomTelephone+"\""));
	Elements.clearTxtBox(ResisterPage.getPassword());
	Elements.TypeText(ResisterPage.getPassword(),map.get("Password"));
	Elements.clearTxtBox(ResisterPage.getConfirmPassword());
	Elements.TypeText(ResisterPage.getConfirmPassword(),map.get("Password"));

	Elements.click(ResisterPage.getCheckboxPrivacyPolicy());

	Elements.click(ResisterPage.getSubmitButton());

}
}
