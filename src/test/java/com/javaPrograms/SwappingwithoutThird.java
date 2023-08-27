package com.javaPrograms;

import java.util.Scanner;

public class SwappingwithoutThird 

{

	private static Scanner s;

	public static void main(String[] args) {
		
		int a,b;
		s = new Scanner(System.in);
		System.out.println("Enter the number a");
		a=s.nextInt();
		System.out.println("Enter the number b");
		b=s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a value is " +a);
		System.out.println("a value is " +b);
		

	}
}
