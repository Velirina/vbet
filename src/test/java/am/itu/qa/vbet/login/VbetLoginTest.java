package am.itu.qa.vbet.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.vbet.base.VbetBaseTest;
import am.itu.qa.vbet.home.VbetHomePage;
import am.itu.qa.vbet.member.VbetMemberPage;
import am.itu.qa.vbet.signIn.VbetSignInPage;

public class VbetLoginTest extends VbetBaseTest {
	
	@Test(priority = 1)
	public void testLoginWithIncorrectCredentials() throws InterruptedException {
		//Precondition
		System.out.println("vbet.com is opened in chrome browser -- see VivarobetUIBaseTest");
		VbetHomePage home = new VbetHomePage(driver);
		Thread.sleep(5000);
		//Steps
		
		System.out.println("1. On vbet.com HOME page click on SIGN IN link");
		VbetSignInPage signIn = home.navigateToMyPage();
		Thread.sleep(5000);
		//Expected results:
		//After step 1. vbet.com SIGN IN page is displayed  
		//with email and password fields
		Assert.assertTrue(signIn.isEmailDisplayed());
		
		System.out.println("2. In vbet.com SIGN IN page type lilit.karapetyan1 in email field");
		signIn.typeEmail("lilit.karapetyan1");
		Thread.sleep(5000);
		
		System.out.println("3. in SIGN IN page type ********* in password field");
		signIn.typePassword("password");
		Thread.sleep(5000);
		
		System.out.println("4. Click on LOGIN button");
		signIn = (VbetSignInPage) signIn.clickOnLoginBtn();
		Thread.sleep(5000);
		
		System.out.println("Test@ hasav error message-i mas");
		//Expected results:
		//After step4. User stays on LOGIN page 
		//Error message is displayed with text "Wrong Login/Password"
		Assert.assertTrue(signIn.isEmailDisplayed());
	}
	
	@Test(priority = 2)
	public void testLoginWithEmptyPasswordCredentials() throws InterruptedException {
		//Precondition
		System.out.println("vbet.com is opened in chrome browser -- see VivarobetUIBaseTest");
		//Steps
		
		System.out.println("1. On vbet.com HOME page click on SIGN IN link");
		VbetSignInPage signIn = new VbetSignInPage(this.driver);;
		Thread.sleep(5000);
		//Expected results:
		//After step 1. vbet.com SIGN IN page is displayed  
		//with email and password fields
		Assert.assertTrue(signIn.isEmailDisplayed());
		
		System.out.println("2. In vbet.com SIGN IN page type lilit.karapetyan1 in email field");
		signIn.typeEmail("lilit.karapetyan1");
		Thread.sleep(5000);
		
		System.out.println("3. in SIGN IN page Empty password field");
		signIn.typePassword("");
		Thread.sleep(5000);
		
		System.out.println("4. Click on LOGIN button");
		signIn = (VbetSignInPage) signIn.clickOnLoginBtn();
		Thread.sleep(5000);
		
		System.out.println("Test@ hasav error message-i mas");
		//Expected results:
		//After step4. User stays on LOGIN page 
		//Error message is displayed with text "Wrong Login/Password"
		Assert.assertTrue(signIn.isEmailDisplayed());
	}
	
	@Test(priority = 3)
	public void testLoginWithCorrectCredentials() throws InterruptedException {
		//Precondition
		System.out.println("vbet.com is opened in chrome browser -- see VivarobetUIBaseTest");
		
		//Steps
		
		System.out.println("1. On vbet.com HOME page click on SIGN IN link");
		VbetSignInPage signIn = new VbetSignInPage(driver);
		Thread.sleep(5000);
		//Expected results:
		//After step 1. vbet.com SIGN IN page is displayed  
		//with email and password fields
		Assert.assertTrue(signIn.isEmailDisplayed());
		
		System.out.println("2. In vbet.com SIGN IN page type lilit.karapetyan1 in email field");
		signIn.typeEmail("lilit.karapetyan1");
		Thread.sleep(5000);
		
		System.out.println("3. in SIGN IN page type ********* in password field");
		signIn.typePassword("060896!Li");
		Thread.sleep(5000);
		
		System.out.println("4. Click on LOGIN button");
		signIn.clickOnLoginBtn();
		Thread.sleep(7000);
		
		/*System.out.println("Accepted Results :  After step 4 Deposit button is displayed on member home page.");
		VbetMemberPage member = new VbetMemberPage(driver);
		member.verifyDepositBtnPresent();
		Thread.sleep(5000);*/
		
		VbetMemberPage member = new VbetMemberPage(driver);
		member.verifyProfileIconPresent();
		Thread.sleep(10000);
	}
	
}


