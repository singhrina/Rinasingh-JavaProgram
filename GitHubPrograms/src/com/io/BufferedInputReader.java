package com.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedInputReader {
	public static void main(String args[])throws Exception
	{
	int a,b,c;
	BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
	System.out.println("Enter the two numbers to subtract:");
	a=Integer.parseInt(br.readLine());
	b=Integer.parseInt(br.readLine());
	c = a-b;
	System.out.println(" subtraction of two numbers is " + c);
	}
	}



