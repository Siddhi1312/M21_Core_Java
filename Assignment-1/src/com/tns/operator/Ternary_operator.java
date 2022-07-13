package com.tns.operator;

import java.util.Scanner;

public class Ternary_operator {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int a= s.nextInt();
		int b= s.nextInt();
		int res= (5%2==0)?a:b;
		System.out.println(res);

	}

}
