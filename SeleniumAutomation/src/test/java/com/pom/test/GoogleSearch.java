package com.pom.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearch {
	
	private static WebElement element = null;
	
	
	public static WebElement textbox_search(WebDriver driver) {
		
		element = driver.findElement(By.name("q"));
		return element;
		
	}
	
	public static WebElement outside_google(WebDriver driver) {
		
		element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]"));
		return element;
		
	}
	
	
	public static WebElement serchutton_search(WebDriver driver) {
		
		element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
		return element;
		
	}

}
