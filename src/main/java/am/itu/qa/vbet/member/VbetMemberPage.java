package am.itu.qa.vbet.member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import am.itu.qa.vbet.home.VbetHomePage;

public class VbetMemberPage extends VbetHomePage {

	public VbetMemberPage(WebDriver driver) {
		super(driver);
	}

	/* public static final String DEPOSIT_XPATH = "//a[@href='#/account/my-wallet/deposit']";
	
	@FindBy(xpath = DEPOSIT_XPATH)
	WebElement depositBtn;
	
	
	public void verifyDepositBtnPresent() {
		
		Assert.assertTrue(depositBtn.isDisplayed());
		
	}*/
	
	public static final String PROFILE_PHOTO_XPATH = "//div[@class='profile-overlay']";
	
	@FindBy(xpath = PROFILE_PHOTO_XPATH)
	WebElement profileIcon;
	
	
	public void verifyProfileIconPresent() {
		
		Assert.assertTrue(profileIcon.isDisplayed());
	}


}
