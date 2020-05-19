package am.itu.qa.socialNetwork;

import org.openqa.selenium.WebDriver;

import am.itu.qa.vbet.base.VbetBasePage;

public class VbetFacebookPage extends VbetBasePage {

	public VbetFacebookPage(WebDriver driver) {
		super(driver);
	}

	public boolean isDisplayed() {
		return true;
	}

}
