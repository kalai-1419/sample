package com.base;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AdactinBase {


	public static WebDriver driver;

	@Test
	public static void BrowserLaunch()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		WebElement uName = driver.findElement(By.xpath("//input[@id='username']"));
		uName.sendKeys("abinesh12345");
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("12345");
		WebElement LgnBtn = driver.findElement(By.xpath("//input[@id='login']"));
		LgnBtn.click();

	}

	@Test

	public static  void searchHotel()
	{

		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select l= new Select(location);
		l.selectByValue("Adelaide");

		WebElement HtlName = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select h= new Select(HtlName);
		h.selectByVisibleText("Hotel Hervey");

		WebElement RoomType = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select R= new Select(RoomType);
		R.selectByIndex(1);

		WebElement NumOfRooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select N= new Select( NumOfRooms );
		N.selectByVisibleText("NumOfRooms");

		WebElement adltRoom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select Adlt= new Select(adltRoom);
		Adlt.selectByValue("2");

		WebElement childRoom= driver.findElement(By.xpath("//select[@id='child_room']"));
		Select C= new Select(childRoom);
		C.selectByValue("2");

		WebElement searchHotel= driver.findElement(By.xpath("//span[contains(text(),'Fields marked with') ]"));
		String searchHoteltext = searchHotel.getText();
		System.out.println( searchHoteltext);

		WebElement searchButton= driver.findElement(By.xpath("//input[@id='Submit']"));
		searchButton.click();

	}

	@Test
	public static  void selectHotel() throws InterruptedException
	{

		WebElement slctHotel= driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		slctHotel.click();

		WebElement slctHotelText=driver.findElement(By.xpath("//td[contains(text(),'Select Hotel')] "));
		String slctValue= slctHotelText.getText();
		System.out.println(slctValue);
		Thread.sleep(5000);

		WebElement continueButton= driver.findElement(By.xpath("//input[@id='continue'] "));
		continueButton.click();

		WebElement fName=driver.findElement(By.id("first_name"));
		fName.sendKeys("hkt");


		WebElement lName=driver.findElement(By.id("last_name"))	;
		lName.sendKeys("kkv");

		WebElement billingAddress=driver.findElement(By.id("address"))	;
		billingAddress.sendKeys("trichy");	

		WebElement creditCardNumber =driver.findElement(By.id("cc_num"));
		creditCardNumber.sendKeys("1234567893652140");	

		Thread.sleep(4000);

		WebElement creditCardNumberText =driver.findElement(By.xpath("//label[text()='Use 16 digit Dummy Data']"))	;
		String creditText= creditCardNumberText.getText();
		System.out.println(creditText);
		Thread.sleep(2000);

		WebElement creditCardType = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select crType= new Select(creditCardType);
		crType.selectByVisibleText("VISA");

		WebElement ExpiryDateMonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select ExpDatemon= new Select(ExpiryDateMonth);
		ExpDatemon.selectByVisibleText("October");

		WebElement ExpiryDateYear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select ExpDateyr= new Select(ExpiryDateYear);
		ExpDateyr.selectByVisibleText("2028");

		WebElement cvvNumber = driver.findElement(By.id("cc_cvv"));
		cvvNumber.sendKeys("1234");

		WebElement BookHotel =driver.findElement(By.xpath("//td[text()='Book A Hotel '] "));
		String hotelText= BookHotel.getText();
		System.out.println(hotelText);
		Thread.sleep(3000);
		

		WebElement bookNow = driver.findElement(By.id("book_now")); 
		bookNow.click();
		 
		String   bookNowText = bookNow.getAttribute(hotelText);
		System.out.println(bookNowText);
		
		
		

		




	}
}

