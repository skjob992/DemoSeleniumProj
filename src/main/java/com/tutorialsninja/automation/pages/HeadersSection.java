package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class HeadersSection {
	public HeadersSection() {
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(xpath = "//span[@class='caret']")
	//"//span[text()='My Account']")
	private static WebElement myAccountLink;

	@FindBy(xpath = "//li//ul//a[text()='Register']")
	private static WebElement resisterLink;

	public static WebElement getMyAccountLink() {
		return myAccountLink;
	}

	public static WebElement getResisterLink() {
		return resisterLink;
	}

}
