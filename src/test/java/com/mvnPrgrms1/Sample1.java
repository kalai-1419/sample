package com.mvnPrgrms1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Sample1 {

	public static void main(String[] args)
	{
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com");

//List<WebElement> allLinks=driver.findElements(By.tagName("a"));
//int numbers=allLinks.size();

WebElement uname=   driver.findElement(By.xpath("//input[@type='text']"));
uname.sendKeys("kalai19@gmail.com");

String txtvalue= uname.getAttribute("value");
System.out.println(txtvalue);


	}

}
