package com.SeleniumBasics;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/****************   ALERTS CONFIRM DISMISS DEMO  ****************/

public class AlertsConfirmDismiss {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(3000);
		Alert a= driver.switchTo().alert();
		Thread.sleep(2000);
		a.dismiss();
		Thread.sleep(2000);
		driver.quit();





	}

}
