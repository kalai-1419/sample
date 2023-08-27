package com.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.switchTo().frame(2);
		Thread.sleep(7000);
		
		WebElement s=driver.findElement(By.id("firstName"));
		s.sendKeys("besant");
		driver.switchTo().parentFrame();
		WebElement textBox = driver.findElement(By.id("name"));
		textBox.sendKeys("bye bye");



	}

}
