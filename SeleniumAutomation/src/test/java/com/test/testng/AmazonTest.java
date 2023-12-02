package com.test.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.pages.Ebay_HomePg;
import com.testng.webelements.Ebay_HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
	
	Ebay_HomePg homePage;
	
	
	private static WebDriver driver = null;
	
	@BeforeMethod
	public void PreSetup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software Setups\\Driveres\\chromedriver.exe");
		  driver = new ChromeDriver();
//		  driver.get("https://www.ebay.com/");
		  Thread.sleep(2000);
//		  homePage = new Ebay_HomePg(driver); 
		  driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void PostSetup() {
		driver.close();
	}
	
	
	
	
  public void AssertURL() throws InterruptedException{
	  
	  String expectedURL = "https://www.ebay.com/n/all-categories";
	  
	  Assert.assertTrue(homePage.CheckSearchBtn(), "Verify Search Buuton is Enabled");
	
	  homePage.ClickonSearchBtn();
	  Thread.sleep(2000);
	  String newURL = driver.getCurrentUrl();
	  String newTitle = driver.getTitle();
	  
	  Assert.assertEquals(newURL, expectedURL, "Verify URL of the Page");
	  
  }
  
  @Test
  public void testMakeMyTripLogo() throws InterruptedException {
      // Navigate to MakeMyTrip website
	  driver.get("https://www.makemytrip.com/");
	  String logoXpath = "//img[@alt='Make My Trip']"; //logo Xpath
      String closePopup = "//span[@data-cy='closeModal']";

      WebElement CloseButtonElement = driver.findElement(By.xpath(closePopup));
  	  CloseButtonElement.click();
      WebElement logoElement = driver.findElement(By.xpath(logoXpath));

      // Verify if the logo is displayed
      Assert.assertTrue(logoElement.isDisplayed(), "MakeMyTrip logo is not present on the page");
      
  }
  
  
  @Test
  public void MakeMyTripFlightsBooking() throws InterruptedException {
      // Navigate to MakeMyTrip website
	  driver.get("https://www.makemytrip.com/");
      String closePopup = "//span[@data-cy='closeModal']";
      String flightTab = "//li[@data-cy='menu_Flights']";
      String oneWayTrip = "//li[@data-cy='oneWayTrip']";
      
      
      WebElement CloseButtonElement = driver.findElement(By.xpath(closePopup));
  	  CloseButtonElement.click();
      
      WebElement flightsTab = driver.findElement(By.xpath(flightTab));
      flightsTab.click();
      Thread.sleep(3000);
      
      WebElement oneWayOption = driver.findElement(By.xpath(oneWayTrip));
      oneWayOption.click();
      
      WebElement fromInput = driver.findElement(By.xpath("//input[@id='fromCity']"));
      fromInput.sendKeys("Delhi");
      WebElement fromSelect = driver.findElement(By.xpath("//p[@class='font14 appendBottom5 blackText']"));
      if(fromSelect.getText().equals("New Delhi, India")) {
    	  Assert.assertTrue(fromSelect.isDisplayed(), "Delhi is available to choose");
    	  fromSelect.click();
      }
      
      Thread.sleep(5000);

      // Wait for a moment (You may need to use WebDriverWait for real-world scenarios)

      // Find and enter the TO location using its XPath
      WebElement toInput = driver.findElement(By.xpath("//input[@id='toCity']"));
      toInput.sendKeys("Mumbai");
      WebElement toSelect = driver.findElement(By.xpath("//p[@class='font14 appendBottom5 blackText']"));
      if(toSelect.getText().equals("Mumbai, India")) {
    	 Assert.assertTrue(toSelect.isDisplayed(), "Mumbai is available to choose");
      	toSelect.click();
      }
      
      Thread.sleep(5000);
      
      
      
  }
  
  


}
