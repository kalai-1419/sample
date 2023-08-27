package com.SeleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonScreenshotTask {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement mobile =	driver.findElement(By.xpath("//a[text()='Mobiles']"));
		mobile.click();

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone") ;

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(10000);

		String parentWindow= driver.getWindowHandle();
		driver.findElement(By.xpath("//*[text()='Apple iPhone 13 (256GB) - Pink']")).click();
		Thread.sleep(5000);
		Set<String>	allWindowsID= driver.getWindowHandles();
		for (String allwindows : allWindowsID) 
		{
			if(!allwindows.equals(parentWindow))
			{
				driver.switchTo().window(allwindows);
				Thread.sleep(5000);
				driver.findElement(By.id("add-to-cart-button")).click();
				Thread.sleep(10000);
				driver.close();
			}
			driver.switchTo().window(parentWindow);
			Thread.sleep(2000);
			driver.findElement(By.id("nav-cart")).click();
			Thread.sleep(2000);

		}
	}
}
