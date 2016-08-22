package com.string;

import java.util.Scanner;

public class ReverceStringEx {
	public static void main(String[] args) {
		String original;
		String reverce ="";
		System.out.println("Enter the string to reverce:");
		Scanner sc = new Scanner(System.in);
		original = sc.nextLine();
		for(int i = original.length()-1;i>=0;i--){
			reverce = reverce + original.charAt(i);
		}
		System.out.println("original string:"+ original);
		System.out.println("Reverce string is:"+ reverce);
		sc.close();
		} 
	    }
