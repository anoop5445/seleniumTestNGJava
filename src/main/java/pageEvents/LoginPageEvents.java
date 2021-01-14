package pageEvents;

import org.testng.Assert;

import pageObjects.HomePageElements;
import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
	public void verifyloginpageevents() {
		ElementFetch elementfetch = new ElementFetch();
		baseTest.logger.info("open login page");
		Assert.assertTrue(elementfetch.getListWebElements("XPATH", LoginPageElements.loginText.length()>0), "Login page did not open");
	}
	
	public void entermailid() {
		ElementFetch elementfetch = new ElementFetch();
		elementfetch.getWebElement("ID", LoginPageElements.emailadress).sendKeys("anoop5445@gmail.com");
	}	
}