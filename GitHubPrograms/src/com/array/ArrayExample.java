package com.array;


public class ArrayExample {
	public int getLargest(int[]a)
	{
		int num = a[0];
		for(int i=1;i<a.length;i++){
			if(num<a[i]){
				num=a[i];
			}
		}
		return num;
	}
	public static void main(String[] args) {
		/*int [] a = new int [6]; //declaration n initialization
		a[0] = 60;
		a[1]=50;
		a[2]=40;
		a[3]=30;
        a[4]=20;
		a[5]=10;*/
	int[] a = {12,78,35,89,30};	// Definition,declaration n initialization
		for(int i=0;i<a.length;i++)
	//	for(int i=a.length-1;i>=0;i--)//reverser order
	 // for(int i =0;i<a.length/2;i++)//to get the half value of the length
	  
	{
			System.out.println(a[i]);
		}
	ArrayExample ex = new ArrayExample ();
	System.out.println(" the largest no" + ex.getLargest(a));
	
	}
	
	}
	
	




