package com.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesNested {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	
	driver.switchTo().frame("frm3");
	
	driver.switchTo().frame("frm1");
	
	WebElement options = driver.findElement(By.id("selectnav1"));
	
	Select s = new Select(options);
	
	s.selectByVisibleText("- Java");
	Thread.sleep(3000);
	
	driver.switchTo().parentFrame();
	Thread.sleep(3000);
	
	driver.switchTo().frame("frm2");
	Thread.sleep(3000);
	
	driver.findElement(By.id("firstName")).sendKeys("kalai");
	Thread.sleep(5000);
	
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	
	driver.switchTo().frame("frm3");
	driver.findElement(By.id("name")).sendKeys("Bye Bye "); 
	
		
	}

}
