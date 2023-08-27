package com.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class jsExecutorDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		WebElement user = driver.findElement(By.id("username"));
		
		WebElement pwd  = driver.findElement(By.id("password"));
		WebElement lgnBtn  = driver.findElement(By.id("login"));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','hkt12345')",user);
		Object userText = js.executeScript("return arguments[0].getAttribute('value')", user);
		System.out.println(userText);
		js.executeScript("arguments[0].setAttribute('value','hktkalai')",pwd);
		js.executeScript("arguments[0].click()", lgnBtn);
		
		
	}

}
