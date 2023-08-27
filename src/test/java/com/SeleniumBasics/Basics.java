package com.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTutorials\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		driver.manage().window().maximize();
		
		String tit = driver.getTitle();
	     System.out.println(tit);
	
	     String PageSrc = driver.getPageSource();
	     System.out.println(PageSrc);
	     
	     
	     
	     
}

}
