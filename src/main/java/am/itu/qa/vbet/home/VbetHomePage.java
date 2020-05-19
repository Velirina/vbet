package am.itu.qa.vbet.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import am.itu.qa.socialNetwork.VbetFacebookPage;
import am.itu.qa.socialNetwork.VbetInstagramPage;
import am.itu.qa.socialNetwork.VbetTwitterPage;
import am.itu.qa.socialNetwork.VbetYoutubePage;
import am.itu.qa.vbet.base.VbetBasePage;
import am.itu.qa.vbet.signIn.VbetSignInPage;

public class VbetHomePage extends VbetBasePage {

	public VbetHomePage(WebDriver driver) {
		super(driver);
	}

	public static final String SIGN_IN_XPATH = "//a[contains(@class, 'link signin-btn sbLoginBtn')]";
		
	@FindBy(xpath = SIGN_IN_XPATH)
	WebElement myPage;
	
	public VbetSignInPage navigateToMyPage() {
		waitForElementPresent(15, By.xpath(SIGN_IN_XPATH));
		myPage.click();
		return new VbetSignInPage(this.driver);
	}
	
	public static final String LANGUAGE_XPAT = "//div[@class='main-language']";
	public static final String RU_XPATH = "//a[@onclick=\"changeLanguage(this,'ru');\"]";
	public static final String FA_XPATH = "//a[contains(@href, 'https://www.vbet.com/fa')]";
	
	@FindBy(xpath = LANGUAGE_XPAT)
	WebElement language;
	
	
	@FindBy(xpath = RU_XPATH)
	WebElement russianFlag;
	
	public void switchToRussian() throws InterruptedException {
		waitForElementPresent(15, By.xpath(LANGUAGE_XPAT));
		language.click();
		Thread.sleep(1000);
		russianFlag.click();
	}
	
	@FindBy(xpath = FA_XPATH)
	WebElement persianFlag;
	
	public void switchToPersian() throws InterruptedException {
		waitForElementPresent(15, By.xpath(LANGUAGE_XPAT));
		language.click();
		Thread.sleep(1000);
		persianFlag.click();
	}
	
	public static final String MORE_IN_RUSSIAN_XPATH = "//span[text()='Больше']";
	
	@FindBy(xpath = MORE_IN_RUSSIAN_XPATH)
	WebElement moreIcon;
	
	public void verifyMoreIconPresent() {
		
		Assert.assertTrue(moreIcon.isDisplayed());
	}
	
	public static final String FACEBOOK_LINK_XPATH = "//a[contains(@href,'/www.facebook.com/vbetcom/')]";
	
	@FindBy(xpath = FACEBOOK_LINK_XPATH)
	WebElement facebookPage;
	
	public VbetFacebookPage navigateToFacebookPage() {
		return  new VbetFacebookPage(this.driver);
	}
	
	public static final String INSTAGRAM_LINK_XPATH = "//a[contains(@href,'/www.instagram.com/vbet_com/')]";
	
	@FindBy(xpath = INSTAGRAM_LINK_XPATH)
	WebElement instagramPage;
	
	public VbetInstagramPage navigateToInstagramkPage() {
		return  new VbetInstagramPage(this.driver);
	}
	
	public static final String TWITTER_LINK_XPATH = "//a[contains(@href,'/twitter.com/Vbet_com/')]";
	
	@FindBy(xpath = TWITTER_LINK_XPATH)
	WebElement twitterPage;
		
	public VbetTwitterPage navigateToTwitterPage() {
		return new VbetTwitterPage(this.driver);
	}
	
	public static final String YOUTUBE_LINK_XPATH = "//a[contains(@href,'/www.youtube.com/channel/')]";
	
	@FindBy(xpath = YOUTUBE_LINK_XPATH)
	WebElement youtubePage;

	public VbetYoutubePage navigateToYoutubePage() {
		return new VbetYoutubePage(this.driver);
	}

}


