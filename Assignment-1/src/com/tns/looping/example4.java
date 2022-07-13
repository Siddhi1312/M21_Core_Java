package com.tns.looping;
//do while

import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int a= s.nextInt();
		int b= s.nextInt();
		do
		{
			System.out.println("" +(a/=b));
		}while (a>0 && b>0);

	}

}
