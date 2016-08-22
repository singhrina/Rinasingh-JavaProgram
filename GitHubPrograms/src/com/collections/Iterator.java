package com.collections;

import java.util.ArrayList;
public class Iterator{
	

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
	      list.add(90);
		 list.add(40);
		 list.add(100);
		 list.add(50);
	 java.util.Iterator<Integer> itr = list.iterator();
	 System.out.println("");
	while(itr.hasNext())
	{ 
		System.out.println(itr.next());

	}

}
	}

