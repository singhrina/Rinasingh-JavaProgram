package com.loop;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int no;
		int fect=1;
		Scanner s = new Scanner(System.in);
		System.out.println("enter any no  : ");
        no = s.nextInt();
        s.close();
        for(int i=1; i<=no; i++)
		{
		fect=fect*i;
	    }
		System.out.println("factorial is:  "+ fect );

        }
        }


