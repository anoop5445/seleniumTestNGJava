package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementFetch {
	public WebElement getWebElement(String identifierType, String identifierValue) {
		switch (identifierType) {
		case "ID":
			return baseTest.driver().findElement(By.id(identifierValue));
		case "CSS":
			return baseTest.driver().findElement(By.cssSelector(identifierValue));
		case "XPATH":
			return baseTest.driver().findElement(By.xpath(identifierValue));
		}	
	}	
	public List<WebElement> getListWebElements(String identifierType, String identifierValue) {
		switch (identifierType) {
		case "ID":
			return baseTest.driver().findElements(By.id(identifierValue));
		case "CSS":
			return baseTest.driver().findElements(By.cssSelector(identifierValue));
		case "XPATH":
			return baseTest.driver().findElements(By.xpath(identifierValue));
		}	
	}
		
}
