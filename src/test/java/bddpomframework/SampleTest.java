package bddpomframework;

import org.testng.annotations.Test;

import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;

public class SampleTest extends baseTest {
	@Test
	public void sampleMethodforEmailEntering() {
		HomePageEvents homePageEvents = new HomePageEvents();
		homePageEvents.clickonsignbutton();
		
		LoginPageEvents loginPageEvents = new LoginPageEvents();
		loginPageEvents.verifyloginpageevents();
		loginPageEvents.entermailid();
	}
}