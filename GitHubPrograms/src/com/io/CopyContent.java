package com.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyContent {
	

	    public void main(String args[]){      

	        String fileInput = "C:/Users/rinas/Desktop/javaio.txt";
	        String fileoutput = "C:Users/rinas/Desktop/javaio1.txt";
	        try {
	            FileReader fr=new FileReader(fileInput);
	            FileWriter fw=new FileWriter(fileoutput);

	            int c;
	            while((c=fr.read())!=-1) {
	                fw.write(c);
	            } 
	            fr.close();
	            fw.close();

	        } 
	        catch(IOException e) {
	            System.out.println(e);
	        } 
	     }
	}


