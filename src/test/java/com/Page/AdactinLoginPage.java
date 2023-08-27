package com.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.Base3;

public class AdactinLoginPage extends Base3  {

	public AdactinLoginPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="username")
	private  WebElement userName;

	@FindBy(id="password")
	private  WebElement pwd;

	@FindBy(id="login")
	private  WebElement loginbutton;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}


}


