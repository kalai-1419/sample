package com.mvnPrgrms1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base;

public class BaseTest extends Base{

	public static void main(String[] args) {

		BrowserLaunch("https://www.facebook.com/login/");
		maximize();
	
		Title();
		
WebElement uName= driver.findElement(By.id("//input[@id='email']"));
sendValue(uName,"kalai@gmail.com");

WebElement pwd= driver.findElement(By.id("//input[@id='pass']"));
sendValue(pwd, "1234567");







	}

}
