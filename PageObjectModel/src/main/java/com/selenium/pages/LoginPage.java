package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Login page locators

	By usernameField = By.id("username");

	By passwordField = By.id("password");

	By loginButton = By.xpath("//button[@type='submit']");
	
	By errorText = By.xpath("//div[@id='flash-messages']");

	public void setUsername(String username) {
		driver.findElement(usernameField).clear();
		driver.findElement(usernameField).sendKeys(username);
	}

	public void setPassword(String password) {
		driver.findElement(passwordField).clear();
		driver.findElement(passwordField).sendKeys(password);
	}

	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	public SecureAreaPage clickLoginButtonSuccess() {
		driver.findElement(loginButton).click();
		return new SecureAreaPage(driver);
	}
	
	public String getErrorText() {
		return driver.findElement(errorText).getText();
	}
}
