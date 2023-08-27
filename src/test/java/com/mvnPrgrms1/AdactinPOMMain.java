package com.mvnPrgrms1;



import org.testng.annotations.Test;

import com.Page.AdactinBookHotelPage;
import com.Page.AdactinLoginPage;
import com.Page.AdactinSelectHotelPage;
import com.Page.SearchHotelPage;
import com.base.Base3;

    public class AdactinPOMMain extends Base3 {
    @Test
    public void AdactinTestCases() throws InterruptedException
{
    	browserLaunch("http://adactinhotelapp.com/");
    	driver.manage().window().maximize();
    	
    	//Classes
    	AdactinLoginPage login= new AdactinLoginPage();
    	SearchHotelPage search=new  SearchHotelPage();
    	AdactinSelectHotelPage select = new AdactinSelectHotelPage();
    	AdactinBookHotelPage BookHotel = new AdactinBookHotelPage();
    	
       	//Login Page
    	sendValues(login.getUserName(), "hkt12345");   //(or) 	al.getUserName().sendKeys("hkt12345");
    	sendValues(login.getPwd(),"hktkalai");
    	login.getLoginbutton().click();
    	
    	//Search Hotel
    	dropDown(search.getLocation(),  "Adelaide") ;
    	dropDown(search.getHotels(), "Hotel Hervey") ;
    	dropDown(search.getTypeofRooms(), "Deluxe") ;
    	dropDown(search.getNoofRooms(),"4 - Four");
    	dropDown(search.getAdultRooms(),"2 - Two");
    	dropDown(search.getChildRooms(),"2 - Two");
    	gettingText(search.getSearchHotelText());
    	search.getSubmit().click();
    	
    	//Select Hotel Page
       	gettingText(select.getSelectHotelText());
    	select.getSelectRadioButton().click();
    	select.getContinueButton().click();
    	
      	//Book Hotel Page 
    	sendValues(BookHotel.getFirstName(), "hkt");
    	sendValues(BookHotel.getLastName(), "kkv");
    	sendValues(BookHotel.getBillingAddress(),"trichy");
    	sendValues(BookHotel.getCreditCardNumber(),"1234567893652140");
    	gettingText(BookHotel.getCreditCardNumberText());
    	dropDown(BookHotel.getCreditCardType(),"VISA");
    	dropDown(BookHotel.getExpiryDateMonth(),"October");
    	dropDown(BookHotel.getExpiryDateYear(),"2028");
    	sendValues(BookHotel.getCvvNumber(), "1234");
    	Thread.sleep(2000);
       	gettingText(BookHotel.getBookHotel());
       	Thread.sleep(2000);
       	BookHotel.getBookNow().click();
    	Thread.sleep(2000);
    	gettingText(BookHotel.getBooknowLabelText());
        Thread.sleep(5000);
    	gettingAttribute(BookHotel.getOrderID());
    	Thread.sleep(2000);
    	driver.quit();
    	
    	
    	
    	
    	
    	
    	
    	
    	
}
	
}
