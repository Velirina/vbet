package am.itu.qa.vbet.socialNetwork;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.socialNetwork.VbetInstagramPage;
import am.itu.qa.vbet.base.VbetBaseTest;
import am.itu.qa.vbet.home.VbetHomePage;

public class VbetInstagramTest extends VbetBaseTest {

	@Test
	public void instagramTest() throws InterruptedException {
		//Precondition
		System.out.println("vbet.com is opened in chrome browser -- see VivarobetUIBaseTest");
		VbetHomePage home = new VbetHomePage(driver);
		Thread.sleep(5000);
		
		//Steps 
		System.out.println("1. Click on the Instagram icon  in the lower right corner of the page");
		VbetInstagramPage instagram = home.navigateToInstagramkPage();
		Thread.sleep(5000);
		//Expected result:
		//After step 1 a new tab (insite) 
		//with https://www.instagram.com/vbet_com/ site opened
		Assert.assertTrue(instagram.isDisplayed());
	}
}
		
		
	

