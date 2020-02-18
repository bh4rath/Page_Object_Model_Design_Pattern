package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailConfirmationPage {
	private WebDriver driver;
	
	public EmailConfirmationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Locators for Email confirmation page
	
	By confirmationText = By.id("content");
	
	public String getConfirmationText() {
		return driver.findElement(confirmationText).getText();
	}
}
