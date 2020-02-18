package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderPage {
	
	
	private WebDriver driver;
	
	public SliderPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Locators for Slider page
	
	By slider = By.xpath("//div[@class='sliderContainer']//input");
	
	
	public void moveSlider() {
		driver.findElement(slider);
		Actions action = new Actions(driver);
		
		
	}
	
}
