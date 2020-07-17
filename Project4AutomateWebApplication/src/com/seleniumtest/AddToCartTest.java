package com.seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AddToCartTest {

	@Test
	public void addToCartTest() {
	
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver\\geckodriver.exe" );  
        
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
		capabilities.setCapability("marionette",true);  
		WebDriver driver= new FirefoxDriver(capabilities);  
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");

		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("scrollBy(0,600)");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[3]/div/div[2]/h5/a")).click();
		
		Select select = new Select(driver.findElement(By.name("group_1")));
		select.selectByVisibleText("M");
		
		js.executeScript("scrollBy(0,400)");
    	driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button")).click();
		
	}
}
