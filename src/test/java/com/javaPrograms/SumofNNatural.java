package com.javaPrograms;

import java.util.Scanner;

//SUM OF N NATURAL NUMBERS 

public class SumofNNatural {

	private static Scanner s;

	public static void main(String[] args)
	
	{
	 
	
	s = new Scanner(System.in);
	System.out.println("Enter the number ");
	int n = s.nextInt();
	int sum = 0;
	int i;
	for( i = 1;i<=n;i++)
		 
	
	{
		sum=sum+i;
		
	}
	
		System.out.println(sum);
	}

}
