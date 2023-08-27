
package com.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrpDoown {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		
		
		 WebElement signUp= driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		 signUp.click();
		 
		 WebElement drpdwn1=driver.findElement(By.xpath("//select[@id='month']"));
		 Select s1=new Select(drpdwn1);
		 s1.selectByVisibleText("Jul");
		 
		 
		 WebElement drpDwn= driver.findElement(By.xpath("//select[@id='year']"));
		 Select s= new Select(drpDwn);
		 s.selectByValue("2013");
		 
		 WebElement drpDwn2= driver.findElement(By.xpath("//select[@id='day']"));
		 Select s2= new Select(drpDwn2);
		 s2.selectByIndex(7);
		 
		 
		 
		 
                                                                                                                                                                                         		
		
	}
	
}


	

