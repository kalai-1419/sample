package com.SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("sundar");
		
		Thread.sleep(3000);
	List<WebElement>  autoSuggest=	driver.findElements(By.xpath("//*[@class='G43f7e']//li"));
	int s = autoSuggest.size();
	System.out.println(s);
	autoSuggest.get(s-4).click();
	
	
	
		
		
		

	}

}
