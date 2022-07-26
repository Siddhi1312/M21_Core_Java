package com.cg.userinput;

import java.util.Scanner;

public class StringIn {

	public static void main(String[] args) {
		
		Scanner s=new Scanner (System.in);
		String a= s.next();
		String a1= s.nextLine();
		//nextLine()= method to return entire string 
		// if i/p= siddhi kokil, without this o/p ='siddhi' and with it o/p= 'siddhi kokil' 
		System.out.println(a);
		
		
	}
}