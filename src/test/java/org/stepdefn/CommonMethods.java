package org.stepdefn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods {
	public static WebDriver driver;
	
	@Before
	public static WebDriver openbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	@After
	public static void closebrowser() {
		driver.close();
	}

}
