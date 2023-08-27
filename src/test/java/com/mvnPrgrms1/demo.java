package com.mvnPrgrms1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo {

	@BeforeClass
	private void beforecla()
	{
		System.out.println("Before class");;
	}
	
	@Test
	public void tc1() 
	{
		System.out.println("test case 1");
	}
	
	@AfterMethod
	private void afterMethod() {
		System.out.println("after method");
	}
	
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("before method");
	}
	
	@AfterClass
	private void afterClass() {
		System.out.println("after class ");
	}
}
