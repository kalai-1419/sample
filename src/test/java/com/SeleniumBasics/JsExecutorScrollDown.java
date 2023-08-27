package com.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsExecutorScrollDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				driver.get("https://www.amazon.in/");
				WebElement bottom = driver.findElement(By.xpath("(//*[contains(text(),'Back to top')])[1]"));
				JavascriptExecutor js= (JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView(true)",bottom);
				
				
				
				
	}

}
