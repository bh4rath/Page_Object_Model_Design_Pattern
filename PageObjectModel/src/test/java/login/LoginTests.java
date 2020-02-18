package login;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.pages.LoginPage;
import com.selenium.pages.SecureAreaPage;

import base.BaseTest;

public class LoginTests extends BaseTest {
	
	@Test(description="Invalid login test")
	public void testInvalidLogin() {
		LoginPage loginpage = homepage.clickFormAuthenticationLink();
		
		loginpage.setUsername("admin");
		
		loginpage.setPassword("admin");
		
		loginpage.clickLoginButton();
		
		Assert.assertEquals(loginpage.getErrorText(), "Your username is invalid! x", "Error message is incorrect");
	}
	
	@Test(description="Valid login test")
	public void testSuccessfulLogin() {
		LoginPage loginpage = homepage.clickFormAuthenticationLink();
		
		loginpage.setUsername("tomsmith");
		
		loginpage.setPassword("SuperSecretPassword!");
		
		SecureAreaPage secureareapage = loginpage.clickLoginButtonSuccess();
		
		Assert.assertEquals(secureareapage.getSuccessMessage(), "You logged into a secure area! x", "Loginsuccess error message is incorrect");
	}
}
