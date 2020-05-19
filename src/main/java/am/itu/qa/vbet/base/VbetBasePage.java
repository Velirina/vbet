package am.itu.qa.vbet.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VbetBasePage {

	protected WebDriver driver;

	public VbetBasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public void waitForElementPresent(int waitSec, By by) {

		// To wait for element visible
		WebDriverWait wait = new WebDriverWait(this.driver, waitSec);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

}