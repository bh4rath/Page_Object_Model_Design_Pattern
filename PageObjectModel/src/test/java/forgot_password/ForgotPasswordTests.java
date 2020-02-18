package forgot_password;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.pages.EmailConfirmationPage;
import com.selenium.pages.ForgotPasswordPage;

import base.BaseTest;

public class ForgotPasswordTests extends BaseTest {
	
	@Test(description="forgot password page test")
	public void testForgotPassword() {
		ForgotPasswordPage forgotpwdpage =homepage.clickForgotPasswordLink();
		
		forgotpwdpage.setEmailId("admin@123");
		
		EmailConfirmationPage emailconfirmationpage = forgotpwdpage.clickRetrievePasswordButton();
		
		String confirmationText = emailconfirmationpage.getConfirmationText();
		
		Assert.assertEquals(confirmationText, "Your e-mail's been sent!" , "Alert message is incorrect");
	}
}