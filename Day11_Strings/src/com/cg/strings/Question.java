package com.cg.strings;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		String str=new String("dhoni");
		Scanner s=new Scanner(System.in);
		String str1=new String(s.nextLine());
		if (str1.equals(str))
		{
			System.out.println("matching");
		}
		else
			System.out.println("not matching");
		s.close();
		

	}

}
