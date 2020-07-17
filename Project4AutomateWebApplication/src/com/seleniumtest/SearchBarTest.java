package com.seleniumtest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class SearchBarTest {

	@Test
	public void searchBarTest() {
	
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver\\geckodriver.exe" );  
        
        // Initialize Gecko Driver using Desired Capabilities Class  
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
		capabilities.setCapability("marionette",true);  
		WebDriver driver= new FirefoxDriver(capabilities);  
		driver.get("http://automationpractice.com/index.php");

		
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		driver.findElement(By.name("submit_search")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("scrollBy(0,400)");
			
	}
}
