package bddpomframework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.constants;


public class MainTest {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "F:/Anoop New/wrkspce/bddpomframework/drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get(constants.goibbo);
	driver.manage().window().maximize();
	
	//book one way ticket
	
	
	
	System.out.println("Test Executed");
 }
}
