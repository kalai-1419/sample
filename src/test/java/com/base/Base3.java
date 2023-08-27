package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base3 {


	public static WebDriver driver ;
	
	public static  void  browserLaunch(String url)
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
				driver.get(url);
	}
public static void  sendValues(WebElement ref ,String Value  )
{
	ref.sendKeys(Value);
}
public void dropDown(WebElement Text,String Txt )
{
	Select s= new Select(Text);
	s.selectByVisibleText(Txt);
}
public void gettingText(WebElement ref )
{
	 String value  =ref.getText();
  System.out.println(value);

}
public void gettingAttribute(WebElement ref) {
	

String Text  = ref.getAttribute("value" );
System.out.println(Text);
}
}
