package com.array;
public class LargestNumber {
	
		public int getLargest(int[]a)
		{
			int num = a[0];
			for(int i=1;i<a.length;i++)
			{
				if(num<a[i])
				{
					num=a[i];
				}
			}
			return num;
		}
		public static void main(String[] args){
		int[] a = {12,78,35,89,30};
			for(int i=0;i<a.length;i++);
			{
		
				int i=0;
				System.out.println(a[i]);
			}
		LargestNumber ln= new LargestNumber();
		System.out.println(" the largest no" + ln.getLargest(a));
		
		}
		
		
		}
	


