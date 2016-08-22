package com.collections;

import java.util.HashSet;

public class SetExample {
	void learnHashset(){
		HashSet<Integer> set= new HashSet<Integer>();
		set.add(103);
		set.add(101);
		set.add(103);
		set.add(100);
		for(Integer i: set)
		{
			System.out.println(i);
		}
		}
	public static void main(String[] args) {
		SetExample ex = new SetExample();
		 ex.learnHashset();
	}
	}


