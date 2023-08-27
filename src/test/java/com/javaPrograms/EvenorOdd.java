package com.javaPrograms;

import java.util.Scanner;

public class EvenorOdd {

	private static Scanner s;

	public static void main(String[] args) {
		
		int n;
		s = new Scanner(System.in);
		System.out.println("Enter the number ");
				n= s.nextInt();
				if(n%2==0)
				{
					System.out.println("the given number is even");
					
				}
				else
				{
					System.out.println("the given number is odd");
				}
				
				

	}

}
