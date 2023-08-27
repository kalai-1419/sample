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

/**************** ROBOT AND ACTIONS *******************/

public class RobotandActions {

	public static void main(String[] args) throws AWTException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement mobile = driver.findElement(By.xpath("//*[text()='Mobiles']"));
		Actions act = new Actions(driver);
		act.contextClick(mobile).build().perform();
		Robot r = new Robot();

		for(int i=0;i<=5;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		}

		r.keyPress(KeyEvent.VK_ENTER);



	}

}
