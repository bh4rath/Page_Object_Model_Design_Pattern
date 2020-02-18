package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage clickFormAuthenticationLink() {
		clickLink("Form Authentication");
		return new LoginPage(driver);
	}

	public DropdownPage clickDropdownLink() {
		clickLink("Dropdown");
		return new DropdownPage(driver);
	}
	
	public ForgotPasswordPage clickForgotPasswordLink() {
		clickLink("Forgot Password");
		return new ForgotPasswordPage(driver);
	}
	
	public SliderPage clickHorizontalSlider() {
		clickLink("Horizontal Slider");
		return new SliderPage(driver);
	}

	public void clickLink(String link) {
		driver.findElement(By.linkText(link)).click();
	}

}
