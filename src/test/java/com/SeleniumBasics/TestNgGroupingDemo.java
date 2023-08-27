package com.SeleniumBasics;

import org.testng.annotations.Test;

public class TestNgGroupingDemo {
	@Test(groups = {"smoke "})
	public void tc1()
	{
		System.out.println("smoke testing");
	}

	@Test(groups = {"sanity  Testing"})
	public void tc2()
	{
		System.out.println("sanity  Testing");
	}

	@Test(groups = {"UAT testing"})
	public void tc3()
	{
		System.out.println("UAT testing");
	}

	@Test(groups = {"Regression Testing"})
	public void tc4()
	{
		System.out.println("Regression  testing");
	}

}
