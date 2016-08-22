package com.array;

public class CommanElement {
	public static void main(String[] args) {
		int a1[]= {2,3,6,12,45,76,98,34};
		int a2[]= { 12,98,6,35,77,32};
		    for(int i =0;i<a1.length; i++){
			for(int j=0;j<a2.length;j++){
				if(a1[i]==a2[j]){
					System.out.println(a2[j]);
				}
			}
		}
	}

}
