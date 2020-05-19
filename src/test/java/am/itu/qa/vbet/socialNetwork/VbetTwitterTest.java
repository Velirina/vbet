package am.itu.qa.vbet.socialNetwork;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.socialNetwork.VbetTwitterPage;
import am.itu.qa.vbet.base.VbetBaseTest;
import am.itu.qa.vbet.home.VbetHomePage;

public class VbetTwitterTest extends VbetBaseTest {

	@Test
	public void TwitterTest() throws InterruptedException {
		//Precondition
		System.out.println("vbet.com is opened in chrome browser -- see VivarobetUIBaseTest");
		VbetHomePage home = new VbetHomePage(driver);
		Thread.sleep(5000);
		
		//Steps 
		System.out.println("1. Click on the Twitter icon  in the lower right corner of the page");
		VbetTwitterPage twitter = home.navigateToTwitterPage();
		Thread.sleep(5000);
		//Expected result:
		//After step 1. a new tab (insite) 
		//with https://twitter.com/Vbet_com/ site opened
		Assert.assertTrue(twitter.isDisplayed());
	}
	
}

	