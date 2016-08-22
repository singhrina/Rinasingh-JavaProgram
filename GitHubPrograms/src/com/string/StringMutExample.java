package com.string;

public class StringMutExample {
	public static void main(String[] args) {
		
		String s  ="Hello";
		System.out.println("before" + s.hashCode());
		s = s+ "rina";
		System.out.println("after" + s.hashCode());
		
		StringBuffer buff = new StringBuffer("Hello");
		System.out.println("before" + buff.hashCode());
		buff = buff.append("rina");
		System.out.println("after" + buff.hashCode());
	
	}
}
