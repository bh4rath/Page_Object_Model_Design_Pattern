package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
	private WebDriver driver;

	public DropdownPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators for Dropdown page

	By dropDown = By.id("dropdown");

	public void selectFromDropdown(String option) {
		Select dropdownElement = new Select(driver.findElement(dropDown));
		dropdownElement.selectByVisibleText(option);
	}

	public String getSelectedOption() {
		Select dropdownElement = new Select(driver.findElement(dropDown));
		return dropdownElement.getFirstSelectedOption().getText();
	}
}
