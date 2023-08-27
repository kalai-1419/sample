package com.base;

import org.testng.annotations.Test;

public class datadriven1{
	
@Test
private void tc1() {
	
System.out.println("tc1");
}
@Test(timeOut = 1000)

private void tc2() throws InterruptedException
{
	Thread.sleep(2000);
	System.out.println("tc2");

}
@Test(dependsOnMethods = "tc2")
private void tc3() {
	
	System.out.println("tc3");
}
}
