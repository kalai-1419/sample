package com.javaPrograms;

import java.util.Scanner;

public class ReverseNumber {

	private static Scanner s;
	
	public static void main(String[] args) 
	{
		int n,rem;
		s = new Scanner(System.in);
		System.out.println("Enter the number ");
		n=s.nextInt();
		while(n>0) // or while(n!=0)
		{
		rem=n%10;
		System.out.print(rem);
		n=n/10;
		
			
		

	}

	}
}
