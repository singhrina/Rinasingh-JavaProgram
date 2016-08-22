package com.string;

public class ReverSentString {
	public static void main(String[] args) {
		String s = "I want to become a Test Automation Engineer";
		String s1 = "";
		String a[] = s.split("");
		System.out.println("before reverce the string is: "+ s);
		for(int i=a.length-1;i>=0;i--){
			s1 = s1+a[i]+"";
		}
		System.out.println("After the reverse string is: "+ s1);
		}
		
	}


