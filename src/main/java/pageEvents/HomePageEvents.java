package pageEvents;

import utils.ElementFetch;
import pageObjects.HomePageElements;

public class HomePageEvents {
	public void clickonsignbutton() {
		ElementFetch elementfetch = new ElementFetch();
		elementfetch.getWebElement("XPATH", HomePageElements.signInButton).click();
	}
}