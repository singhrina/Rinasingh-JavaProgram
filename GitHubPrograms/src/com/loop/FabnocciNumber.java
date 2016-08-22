	package com.loop;

import java.util.Scanner;

public class FabnocciNumber {

	
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the number");
		int n = sc.nextInt();
		sc.close();
		System.out.print(" 1  1 ");
		
		
		while (c<=n)
		{
		c = a + b;
		if (c>=n)
			break;
		System.out.print( c + " ");
		a=b;
		b=c;
		}
	}

}
