package am.itu.qa.vbet.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class VbetBaseTest {
	protected WebDriver driver;
	public static final String VBET_URL = "https://vbet.com";
	
	@BeforeClass
	public void prepareEnv() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\User\\Downloads\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get(VBET_URL);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
