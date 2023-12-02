package com.test.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.pom.test.GoogleSearch;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGoogleSearch {
	
	//Static POM Testing
	
	private static WebDriver driver = null;
	
	public static void main(String args[]) throws InterruptedException {	
		googleSearchTest();
	}

	private static void googleSearchTest() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		GoogleSearch.textbox_search(driver).sendKeys("Selenium Automation");
		GoogleSearch.outside_google(driver).click();
		
		Thread.sleep(2000);  
		GoogleSearch.serchutton_search(driver).sendKeys(Keys.RETURN);
		
		System.out.println("Test Completed");
		
		
		
		
		
	}

}
