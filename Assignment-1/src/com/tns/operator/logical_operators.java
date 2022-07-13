package com.tns.operator;

import java.util.Scanner;

public class logical_operators {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int a= s.nextInt();
		int b= s.nextInt();
		boolean res = (a<b && b>8);
		boolean res1= (a>b || b>8);
		boolean res2= ! (a>b);
		System.out.println (res);
		System.out.println (res1);
		System.out.println (res2);

	}

}
