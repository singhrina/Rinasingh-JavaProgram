package com.loop;

import java.util.Scanner;

public class PingPong {
public static void main(String[] args) {
		Scanner s= new Scanner(System.in);  
		System.out.println("enter number  =");
		int no= s.nextInt();
	s.close();
		 for (int i=1; i<=no;i++)
		 { 
			 if( i % 3==0 & i % 5==0 )
		System.out.println("pingpong"); 
		 if ( i % 3==0)
	
		{
			 System.out.println("ping");
		}
		 else if ( i % 5==0)
		 {
			 System.out.println("pong");
		 }
		  
		 else System.out.println(i);
		 }
	}

}
