package com.base;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AdactMain extends Base1 {

	@Test()
	public void loginTestcase()
	{
		browserLaunch("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement uName = driver.findElement(By.xpath("//input[@id='username']"));
		sendValues(uName,"hkt12345");
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		sendValues(pwd, "hktkalai");
		WebElement LgnBtn = driver.findElement(By.xpath("//input[@id='login']"));
		LgnBtn.click();
	}

	@Test()
	public void searchHotel() throws InterruptedException
	{

		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		dropDown(location, "Adelaide");
		//Thread.sleep(2000);

		WebElement HtlName = driver.findElement(By.xpath("//select[@id='hotels']"));
		dropDown( HtlName, "Hotel Hervey");
		//	Thread.sleep(2000);

		WebElement RoomType = driver.findElement(By.xpath("//select[@id='room_type']"));
		dropDown(RoomType, "Deluxe");
		// Thread.sleep(2000);

		WebElement NumOfRooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
		dropDown(NumOfRooms , "4 - Four");
		//Thread.sleep(2000);

		WebElement adltRoom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		dropDown(adltRoom, "2 - Two");
		//Thread.sleep(2000);

		WebElement childRoom= driver.findElement(By.xpath("//select[@id='child_room']"));
		dropDown(childRoom, "2 - Two");
		Thread.sleep(6000);

		WebElement searchHotel= driver.findElement(By.xpath("//*[contains(text(),'Search Hotel ')]"));
		gettingText(searchHotel);
		Thread.sleep(6000);

		WebElement searchButton= driver.findElement(By.xpath("//input[@id='Submit']"));
		searchButton.click();
		Thread.sleep(2000);

		WebElement slctHotel= driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		slctHotel.click();
		Thread.sleep(10000);

		WebElement slctHotelText=driver.findElement(By.xpath("//td[contains(text(),'Select Hotel')] "));
		gettingText(slctHotelText);
		Thread.sleep(10000);

		WebElement continueButton= driver.findElement(By.xpath("//input[@id='continue'] "));
		continueButton.click();
		Thread.sleep(5000);

		WebElement fName=driver.findElement(By.id("first_name"));
		fName.sendKeys("hkt");
		Thread.sleep(3000);

		WebElement lName=driver.findElement(By.id("last_name"))	;
		lName.sendKeys("kkv");
		Thread.sleep(3000);

		WebElement billingAddress=driver.findElement(By.id("address"))	;
		billingAddress.sendKeys("trichy");	
		Thread.sleep(3000);

		WebElement creditCardNumber =driver.findElement(By.id("cc_num"));
		creditCardNumber.sendKeys("1234567893652140");	
		Thread.sleep(4000);

		WebElement creditCardNumberText =driver.findElement(By.xpath("//label[text()='Use 16 digit Dummy Data']"))	;
		gettingText(creditCardNumberText);
		Thread.sleep(2000);

		WebElement creditCardType = driver.findElement(By.xpath("//select[@id='cc_type']"));
		dropDown(creditCardType, "VISA");
		Thread.sleep(3000);

		WebElement ExpiryDateMonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		dropDown(ExpiryDateMonth, "October");
		Thread.sleep(3000);

		WebElement ExpiryDateYear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		dropDown(ExpiryDateYear, "2028");
		Thread.sleep(3000);

		WebElement cvvNumber = driver.findElement(By.id("cc_cvv"));
		cvvNumber.sendKeys("1234");
		Thread.sleep(3000);

		WebElement BookHotel =driver.findElement(By.xpath("//td[text()='Book A Hotel '] "));
		gettingText(BookHotel);
		Thread.sleep(3000);

		WebElement bookNow = driver.findElement(By.id("book_now")); 
		bookNow.click();
		Thread.sleep(4000);

		WebElement booknowLabelText=driver.findElement(By.xpath("//label[text()='Please wait! We are processing your Hotel Booking...']")) ;
		String ls= booknowLabelText.getText();
		System.out.println(ls);
		Thread.sleep(6000);
		
		WebElement orderID= driver.findElement(By.xpath("//input[@id='order_no']"));
		String orderIDText= orderID.getAttribute("value");
		System.out.println("Order ID = " +orderIDText);
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();




	}

}






