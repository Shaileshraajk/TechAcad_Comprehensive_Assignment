package com.test.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.test.GoogleSerachPOM;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePOMTest {
	
	//OOP POM Testing
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}

	private static void googleSearch() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		GoogleSerachPOM GPom = new GoogleSerachPOM(driver);
		
		driver.get("https://www.google.co.in/");
		GPom.setTextinSearchBox("Cucumber Java");
		Thread.sleep(2000); 
		GPom.searchText();
		System.out.println("Test Completed");
		
	}

}
