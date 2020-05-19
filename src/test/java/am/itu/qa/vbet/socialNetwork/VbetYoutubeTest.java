package am.itu.qa.vbet.socialNetwork;

import org.testng.Assert;
import org.testng.annotations.Test;
import am.itu.qa.socialNetwork.VbetYoutubePage;
import am.itu.qa.vbet.base.VbetBaseTest;
import am.itu.qa.vbet.home.VbetHomePage;

public class VbetYoutubeTest extends VbetBaseTest {

	@Test
	public void youtubeTest() throws InterruptedException {
		//Precondition
		System.out.println("vbet.com is opened in chrome browser -- see VivarobetUIBaseTest");
		VbetHomePage home = new VbetHomePage(driver);
		Thread.sleep(5000);
		
		//Steps 
		System.out.println("1. Click on the Youtube icon  in the lower right corner of the page");
		VbetYoutubePage youtube = home.navigateToYoutubePage();
		Thread.sleep(5000);
		//Expected result:
		//After step 1. a new tab (insite) 
		//with https://www.youtube.com/channel/UCuZ76V-LiadIuIr2m2F7vVge site opened
		Assert.assertTrue(youtube.isDisplayed());
	}
}

	
	
	
	

		
