package am.itu.qa.vbet.language;

import org.testng.annotations.Test;
import am.itu.qa.vbet.base.VbetBaseTest;
import am.itu.qa.vbet.home.VbetHomePage;


public class VbetLanguageTest extends VbetBaseTest {

	@Test(priority = 3)
	public void languageRuTest() throws InterruptedException {
		//Precondition
		System.out.println("user is loggged in");
		Thread.sleep(5000);
		
		//Steps
		System.out.println("1. On vbet.com HOME page click on Flag icon (language EN)");
		
		
		System.out.println("2. On vbet.com HOME page choose language (to RU)");
		VbetHomePage home = new VbetHomePage(this.driver);
		home.switchToRussian();
	}
	
	@Test(priority = 4)
	public void languageFaTest() throws InterruptedException {
		//Precondition
		System.out.println("user is loggged in");
		Thread.sleep(5000);
		
		//Steps
		System.out.println("1. On vbet.com HOME page click on Flag icon (language EN)");
		
		
		System.out.println("2. On vbet.com HOME page choose language (to FA)");
		VbetHomePage home = new VbetHomePage(this.driver);
		home.switchToPersian();
	}
}
