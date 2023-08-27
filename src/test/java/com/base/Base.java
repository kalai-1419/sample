package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	
	public static void BrowserLaunch(String url)
	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}

	public static void sendValue(WebElement ref,String text)
	{
		ref.sendKeys(text);
	}
	public static void maximize()
	{
		driver.manage().window().maximize();
	}
	
	public static void url()
	{
		
		System.out.println(driver.getCurrentUrl());
	}
	
	public static void Title()
	{
		System.out.println(driver.getTitle());
	}
	
	public static void quitBrowser()
	{
	  driver.quit();
	}

}

