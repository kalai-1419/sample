package com.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertExample {

	@Test
	public void tc1() throws InterruptedException
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		String actualUrl = driver.getCurrentUrl();
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualUrl,"https://www.faok.com/login/" );
		System.out.println("Expected is not equal to actual" );
		driver.findElement(By.id("email")).sendKeys("kalaivani");
		s.assertAll();

	}
 
	@Test
	public void tc2() throws InterruptedException
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String actualUrl = driver.getCurrentUrl();
		org.testng.asserts.SoftAssert s = new org.testng.asserts.SoftAssert();
		s.assertEquals(actualUrl,"https://www.amazon.in/" );
		System.out.println("Expected is  equal to actual" );
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[text()='Sell']")).click();
		Thread.sleep(2000);

	}






}
