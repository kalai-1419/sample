package com.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.Base3;

public class AdactinBookHotelPage extends Base3 {

	public AdactinBookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement firstName;

	@FindBy(id="last_name")
	private  WebElement lastName;

	@FindBy(id="address")
	private  WebElement billingAddress;

	@FindBy(id="cc_num")
	private  WebElement creditCardNumber;

	@FindBy(xpath="//label[text()='Use 16 digit Dummy Data']")
	private WebElement creditCardNumberText;

	@FindBy(xpath="//select[@id='cc_type']")
	private  WebElement creditCardType;

	@FindBy(xpath="//select[@id='cc_exp_month']")
	private  WebElement ExpiryDateMonth;

	@FindBy(xpath="//select[@id='cc_exp_year']")
	private  WebElement ExpiryDateYear;

	@FindBy(id="cc_cvv")
	private  WebElement cvvNumber;

	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private  WebElement BookHotel;
	
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}

	public WebElement getCreditCardNumberText() {
		return creditCardNumberText;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryDateMonth() {
		return ExpiryDateMonth;
	}

	public WebElement getExpiryDateYear() {
		return ExpiryDateYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookHotel() {
		return BookHotel;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getBooknowLabelText() {
		
		return booknowLabelText;
	}

	public WebElement getOrderID() {
	return orderID;
	}
	@FindBy(id="book_now")
	private WebElement bookNow;

	@FindBy(xpath="//label[text()='Please wait! We are processing your Hotel Booking...']")
	private  WebElement booknowLabelText;

	@FindBy(xpath="//input[@id='order_no']")
	private WebElement  orderID;







}
