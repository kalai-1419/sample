package com.javaPrograms;

import java.util.Scanner;

public class Factorial {

	private static Scanner s;

	public static void main(String[] args) 
	{
		int i,num;
		int fact=1;
		s = new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		
		
		for(i=1;i<=num;i++)
			
		{
		
		fact=fact*i;
			}
		System.out.println(fact);
	}

}
