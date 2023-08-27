package com.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base3;

public class SearchHotelPage extends Base3 {
	public SearchHotelPage() 
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getTypeofRooms() {
		return TypeofRooms;
	}

	public WebElement getNoofRooms() {
		return NoofRooms;
	}

	public WebElement getAdultRooms() {
		return AdultRooms;
	}

	public WebElement getChildRooms() {
		return childRooms;
	}

	public WebElement getSearchHotelText() {
		return SearchHotelText;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(xpath="//select[@id='location']")
	private WebElement Location;
		
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement Hotels;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement TypeofRooms;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement NoofRooms;
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement AdultRooms;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement childRooms;
	
	@FindBy(xpath="//*[contains(text(),'Search Hotel ')]")
	private WebElement SearchHotelText;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement submit;
	
		
}
