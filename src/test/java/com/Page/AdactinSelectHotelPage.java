package com.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base3;

public class AdactinSelectHotelPage extends Base3{
	public AdactinSelectHotelPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement selectRadioButton;


	@FindBy(xpath="//td[contains(text(),'Select Hotel')]") 
	private static WebElement selectHotelText;


	@FindBy(xpath="//input[@id='continue']")
	private static WebElement continueButton;


	public WebElement getSelectRadioButton() {
		return selectRadioButton;
	}


	public  WebElement getSelectHotelText() {
		return selectHotelText;
	}


	public  WebElement getContinueButton() {
		return continueButton;
	}



}

