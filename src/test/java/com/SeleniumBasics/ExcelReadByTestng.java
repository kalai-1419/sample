package com.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelReadByTestng 
{
	@Test(dataProvider = "login1")
	public void tc1(String s1 , String s2) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);
	}
	
	@DataProvider(name= "login1")
	public  Object[][] loginData() throws InterruptedException
		{
			Object data[][]= new Object [5][2]; 
			
			data[0][0] = "besant";
			data[0][1] = "123456";
			Thread.sleep(3000);
			
			data[1][0] = "Technologies";
			data[1][1] = "59856365";
			Thread.sleep(3000);
			
			data[2][0] = "gggggggg";
			data[2][1] = "59856365";
			Thread.sleep(3000);
			
			data[3][0] = "hhhhhhhh";
			data[3][1] = "59856365";
			Thread.sleep(3000);
			
			data[4][0] = "hkt";
			data[4][1] = "59856365";
			Thread.sleep(3000);
			
			return data;
			
	
			
		}
		
	}

	






