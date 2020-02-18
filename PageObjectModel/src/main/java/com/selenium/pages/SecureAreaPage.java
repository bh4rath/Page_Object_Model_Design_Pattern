package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
	
	private WebDriver driver;
	
	public SecureAreaPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Secure Area Page Locators
	
	By successMessageText = By.xpath("//div[@id='flash-messages']");
	
	public String getSuccessMessage() {
		return driver.findElement(successMessageText).getText();
	}

}
