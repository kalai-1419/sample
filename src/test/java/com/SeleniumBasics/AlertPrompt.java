package com.SeleniumBasics;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/******************     ALERT PROMPT    ******************/


public class AlertPrompt {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Alert a= driver.switchTo().alert();
		a.sendKeys("kalai");
		Thread.sleep(5000);
		a.accept();

	}

}
