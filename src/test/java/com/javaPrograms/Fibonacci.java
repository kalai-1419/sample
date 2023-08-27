package com.javaPrograms;

public class Fibonacci {

	public static void main(String[] args) 
	{
		int f=0,s=1;
		int t;
		
		for(int i=0;i<8;i++)
		{
			System.out.print( f  );
			t=f+s;
			f=s;
			s=t;
			
		}
		
	}

}

