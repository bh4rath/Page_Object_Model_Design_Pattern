package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
	
	private WebDriver driver;
	
	public ForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locators for Forgot password page
	
	By emailIdField = By.id("email");
	
	By retrievePasswordButton = By.xpath("//i[contains(text(),'Retrieve password')]");
	
	public void setEmailId(String emailID) {
		driver.findElement(emailIdField).sendKeys(emailID);
	}
	
	public EmailConfirmationPage clickRetrievePasswordButton() {
		driver.findElement(retrievePasswordButton).click();
		return new EmailConfirmationPage(driver);
	}
}
