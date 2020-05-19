package am.itu.qa.vbet.signIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.vbet.base.VbetBasePage;
import am.itu.qa.vbet.profile.VbetProfilePage;

public class VbetSignInPage extends VbetBasePage {

	public VbetSignInPage(WebDriver driver) {
		super(driver);
	}

	public final String EMAIL_INPUT_XPATH = "//div[contains(@class, 'sb-login-form-container') and contains(@class , 'open-in-popup sign-in')]//input[@name='username']";
	public final String PASSWORD_INPUT_XPATH = "//div[contains(@class, 'sb-login-form-container') and contains(@class , 'open-in-popup sign-in')]//input[@name='password']";
	public final String LOGIN_BUTTON_XPATH = "//button[contains(@class , 'sb-account-btn btn-primary')]";
	public final String ERROR_XPATH = "//div[@class='signin-error-message']";
	public final String WARNING_XPATH = "//span[@class='warning icon icon-sb-warning']";
									
	@FindBy(xpath = EMAIL_INPUT_XPATH)
	WebElement emailInput;
	
	@FindBy(xpath = PASSWORD_INPUT_XPATH)
	WebElement passwordInput;
	
	@FindBy(xpath = LOGIN_BUTTON_XPATH)
	WebElement loginBtnElement;
	
	@FindBy(xpath = ERROR_XPATH)
	WebElement errorMsg;
	
	@FindBy(xpath = WARNING_XPATH)
	WebElement warningIcon;
	
	public void typeEmail(String email) {
		emailInput.clear();
		emailInput.sendKeys(email);
	}

	public void typePassword(String password) {
		passwordInput.clear();
		passwordInput.sendKeys(password);
	}
	
	public VbetBasePage clickOnLoginBtn() {
		loginBtnElement.click();
		if(emailInput.isDisplayed()) {
			return new VbetSignInPage(this.driver);
		} 
			return new VbetProfilePage(this.driver);
	}
	
	public boolean isEmailDisplayed() {
		return emailInput.isDisplayed();
	}
	
	public boolean isErrorDisplayed() {
		return errorMsg.isDisplayed();
	}

	public boolean isWarningDisplayed() {
		return warningIcon.isDisplayed();
	}
}