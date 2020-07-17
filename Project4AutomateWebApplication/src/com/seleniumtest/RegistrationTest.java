package com.seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RegistrationTest {

	@Test
	public void registrationTest() {
	
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver\\geckodriver.exe" );  
        
        // Initialize Gecko Driver using Desired Capabilities Class  
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
		capabilities.setCapability("marionette",true);  
		WebDriver driver= new FirefoxDriver(capabilities);  
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		
		 
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("rakshashetty680@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		//WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("id_gender2")));
		driver.findElement(By.id("id_gender2")).click();
		
		driver.findElement(By.id("customer_firstname")).sendKeys("Raksha");
		driver.findElement(By.id("customer_lastname")).sendKeys("Shetty");
		driver.findElement(By.id("passwd")).sendKeys("rakshashetty123");
		
		driver.findElement(By.id("company")).sendKeys("abc pvt ltd.");
		driver.findElement(By.id("address1")).sendKeys("Dr. Annie Besant Road");
		driver.findElement(By.id("address2")).sendKeys("apt no 501, 5th floor, Grand building");
		driver.findElement(By.id("city")).sendKeys("Alaska");
		Select select = new Select(driver.findElement(By.name("id_state")));
		select.selectByVisibleText("Kansas");
		
		driver.findElement(By.id("postcode")).sendKeys("00002");
		driver.findElement(By.id("phone_mobile")).sendKeys("1234567890");
		
		driver.findElement(By.id("submitAccount")).click();
		
		
		
	}
}
