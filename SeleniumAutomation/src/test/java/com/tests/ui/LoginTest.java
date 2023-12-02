package com.tests.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static String browser = "Chrome";
	public static WebDriver driver;

	public static void main(String args[]) {
		
		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver  = new FirefoxDriver();
		}
		
		//driver.get("https://www.saucedemo.com/");
		//driver.findElement(By.cssSelector("#user-name")).sendKeys("username");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		//driver.close();
		
		
		
		
	}
	

}
