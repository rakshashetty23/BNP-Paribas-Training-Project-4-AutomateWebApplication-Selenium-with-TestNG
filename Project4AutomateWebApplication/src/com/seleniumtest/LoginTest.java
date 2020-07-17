package com.seleniumtest;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void loginTest() {
	
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver\\geckodriver.exe" );  
         
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
		capabilities.setCapability("marionette",true);  
		WebDriver driver= new FirefoxDriver(capabilities);  
		
		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("rakshashetty680@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("rakshashetty123");
		driver.findElement(By.id("SubmitLogin")).click();
		assertEquals(driver.getTitle(), "My account - My Store","Invalid username or password !");
			
	}
	
	

}
