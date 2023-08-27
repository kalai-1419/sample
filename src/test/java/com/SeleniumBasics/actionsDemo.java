package com.SeleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;




import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionsDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");

		//Right Click
		WebElement mobile= driver.findElement(By.xpath("//*[text()='Mobiles']"));
		Actions act = new Actions(driver);
		
		act.contextClick(mobile).build().perform();
		Thread.sleep(5000);

		//To Remove the right click 
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(6000);

		//MoveToElement 
		WebElement elect=driver.findElement(By.xpath(" //a[text()=' Electronics '] "));
		act.moveToElement(elect).build().perform();
		Thread.sleep(5000);
		act.contextClick(elect).build().perform();					
					
		
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(5000);
		
		//WebElement DblClk=driver.findElement(By.xpath(" //button[text()='Double-Click Me To See Alert'] "));
		//act.doubleClick(DblClk).build().perform();
		
		driver.navigate().back();

		Thread.sleep(5000);
		driver.navigate().forward();

		Thread.sleep(5000);
		driver.navigate().refresh();
		
		
		


		









		//Double Click
		//WebElement DblClk = driver.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']"));
		//act.doubleClick(DblClk).perform();

		//MovetoElement
		//WebElement HK=  driver.findElement(By.xpath("//a[text()='Home & Kitchen']"));
		//act.moveToElement(HK).perform();

		//Drag and Drop 
		//driver.get("https://demoqa.com/droppable");
		//WebElement drg = driver.findElement(By.xpath("//div[@id='draggable']"));
		//WebElement drp = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		//act.dragAndDrop(drg,drp).perform();

		//navigate.to()
		//driver.navigate().to("https://www.google.com");
		//Thread.sleep(2000);
		// driver.navigate().back();
		// Thread.sleep(2000);
		// driver.navigate().forward();
		// Thread.sleep(2000);
		// driver.navigate().refresh();

		// driver.quit();



	}
}
