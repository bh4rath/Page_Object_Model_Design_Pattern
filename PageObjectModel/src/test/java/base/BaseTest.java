package base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import com.google.common.io.Files;
import com.selenium.pages.HomePage;

public class BaseTest {
	private WebDriver driver;
	protected HomePage homepage;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		homepage = new HomePage(driver);
	}
	
	@AfterMethod
	public void takeScreenshot() {
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			Files.move(screenshot , new File("screenshots/test.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public void quitDriver() {
		driver.quit();
	}
}
