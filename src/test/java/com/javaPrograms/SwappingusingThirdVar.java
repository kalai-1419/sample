package com.javaPrograms;

import java.util.Scanner;

public class SwappingusingThirdVar {

	private static Scanner s;

	public static void main(String[] args) 
	{
	
		int a,b,temp;
		s = new Scanner(System.in);
		System.out.println("Enter the number a");
		a=s.nextInt();
		System.out.println("Enter the number b");
		b=s.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("a value is " +a);
		System.out.println("a value is " +b);
		
		
		
		

	}

}
