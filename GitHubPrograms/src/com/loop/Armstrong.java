package com.loop;

public class Armstrong {
	public static void main(String[] args) {
		int n;
		int a;
		int sum=0;
		System.out.println("Armstrong number from 1 to 1000:");
		for(int i= 1; i<=1000;i++)
		{
		n=i;
		while(n>0)
		{
			a= n%10;
			sum =sum + (a*a*a);
			n=n/10;
		}
		if(sum == i)
		{
		System.out.println(i + "");	
		}
		sum =0;
		}
	    }
        }
