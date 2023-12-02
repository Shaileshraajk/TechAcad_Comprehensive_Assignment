package com.pom.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSerachPOM {
	
	WebDriver driver = null;

	public GoogleSerachPOM(WebDriver driver) {
		this.driver = driver;
	}
	
	By TextBox = By.name("q");
	By SearchButton = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]");
	
	public void setTextinSearchBox(String text) {
		driver.findElement(TextBox).sendKeys(text);
	}
	
	public void searchText() {
		driver.findElement(SearchButton).sendKeys(Keys.RETURN);
	}
	
	

}
