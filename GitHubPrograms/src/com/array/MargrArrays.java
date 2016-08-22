package com.array;

public class MargrArrays {
	public static void main(String[] args) {
		int a1[]={1,2,3,4,5};
		int a2[]={6,7,8,9,10};
		int a3[]= new int[10];
		int k = 0;
		for(int i =0;i<a1.length;i++){
			a3[i]=a1[i];
			k++;
		}
		for(int j=0;j<a2.length;j++){
			a3[k]=a2[j];
			k++;
		}
		for(int i=0;i<a3.length;i++){
			System.out.println(a3[i]+ "");
		}
	}
		
	}


