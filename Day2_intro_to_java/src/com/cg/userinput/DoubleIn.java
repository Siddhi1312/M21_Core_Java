package com.cg.userinput;
import java.util.Scanner;
public class DoubleIn {

	public static void main(String[] args) {
		//int a=13;
		Scanner s=new Scanner (System.in);
		//scanner= class to get user input;s=object name and can be any
		System.out.println("Enter value of a:");
		double a= s.nextDouble();
		//next()= method in scanner class to get user i/p of data types int,float,double,string
		
		System.out.println(a);
	
       // System.out.println("Wecome to java coding program");
		// s.close();-this should be used when there is error regarding object
        
	}

}
