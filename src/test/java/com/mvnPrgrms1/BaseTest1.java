




package com.mvnPrgrms1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base;

public class BaseTest1 extends Base{

	public static void main(String[] args) {

		BrowserLaunch("https://www.facebook.com/");
		maximize();

		Title();

		WebElement uName = driver.findElement(By.xpath("//input[@id='email']"));
		sendValue(uName,"kalai@gmail.com");

		WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']"));
		sendValue(pwd, "1234567");

		quitBrowser();


	}

}
