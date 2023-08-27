package com.javaPrograms;

import java.util.Scanner;

//SUM OF N ODD NUMBERS
public class SumofNOddNumbers {

	private static Scanner scanner;

	public static void main(String[] args)
	
	{
	
		int i,n;
		scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		n=scanner.nextInt();
		int sum =0;
		
		for(i=1;i<=n;i=i+2)
		{
			sum=sum+i;
			
		}
			
		
		
		
		System.out.println(sum);
		
	}

}
