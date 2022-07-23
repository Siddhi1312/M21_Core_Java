package com.cg.strings;

import java.util.Scanner;

public class StringusingNew {

	public static void main(String[] args) {
		//string declaration using new keyword
		String str=new String("hello");
		System.out.println(str);
		//string user input using new keyword
		Scanner s=new Scanner(System.in);
		String str1=new String(s.nextLine());
		s.close();

	}

}
