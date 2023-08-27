package com.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssert {
	@Test
	public void tc1() throws InterruptedException
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
		String actualUrl = driver.getCurrentUrl();

		Assert.assertEquals(actualUrl, "https://www.faok.com/login/");
		System.out.println("Expected is not equal to actual" );
		
		driver.findElement(By.id("email")).sendKeys("kalaivani");
		Thread.sleep(20000);
	
		}
	
	@Test
	public void tc2()
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
		String actualUrl = driver.getCurrentUrl();

		Assert.assertEquals(actualUrl,"https://www.facebook.com/login/");
		System.out.println("Expected is   equal to actual" );
		
		driver.findElement(By.id("email")).sendKeys("kalaivani");
		
	}
	
}
