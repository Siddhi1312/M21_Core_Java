package com.cg.strings;
//length() method
import java.util.Scanner;

public class stringMethods {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=new String(s.nextLine());
		String str=new String(s.nextLine());
		//length function
		System.out.println(str1.length());
		//charAt() method
		System.out.println(str1.charAt(1));
		//toUpperCase() method
		System.out.println(str1.toUpperCase());
		//toLowerCase() method
		System.out.println(str1.toLowerCase());
		//there will be addition before string and merging after string
		System.out.println(10+20+"hello"+"world"+10+20);
		//concatenation operation
		System.out.println(str.concat(str1));
		
		s.close();

	}

}
