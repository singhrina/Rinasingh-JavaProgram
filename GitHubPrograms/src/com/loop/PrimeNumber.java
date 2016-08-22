package com.loop;

import java.util.Scanner;

public class PrimeNumber { 
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		System.out.println("enter any nomber : ");
	    int num = s.nextInt();
		s.close();
		boolean isPrime = true;
		for (int i=2;i<num;i++)
	     {
		if(num % i==0)
		{
         isPrime = false;
			break;
		}
	    }
		if(isPrime)
		{
		System.out.println( num  +  "  is a prime number");
		}
		else
		{
		System.out.println( num   + "  is not  a prime number ");
		}
		
	     }
	

}
