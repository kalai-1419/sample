package com.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Headlss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions c=new ChromeOptions();
		c.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

}
