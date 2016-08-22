package com.io;

//import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.util.Scanner;

   //To write a data ---> OutPut Stream

public class StreamExample
{ 
	static void method1 () throws Exception
	{
FileOutputStream out =new FileOutputStream("C:/Users/rinas/Desktop/javaio.text");
	String s ="java is fun to learn. we should practice alot to get it";
	byte [] b = s.getBytes();
	out.write(b);
	out.close();
	System.out.println("success");
	}
	
   // To read data ----> InPut Stream
	
	/*static void method2() throws Exception
	{
		FileInputStream in = new FileInputStream("C:/Users/rinas/Desktop/javaio");
	        int i =0; 
		while (( i = in.read())!=-1)
		{
			char c = (char)i;
			System.out.print(c);
			}
		in.close();
		}*/
	
	/*static void  method3()
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name");
		System.out.println(sc.next());
		System.out.println("Enter id");
		System.out.println(sc.nextInt());
	   sc.close();
	}*/
	
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		StreamExample.method1();
		//StreamExample.method2();
		//StreamExample.method3();
	}
	

}
