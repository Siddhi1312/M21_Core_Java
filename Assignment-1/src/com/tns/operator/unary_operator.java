package com.tns.operator;

import java.util.Scanner;

public class unary_operator {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int a= s.nextInt();
		int b= s.nextInt();
		
int x= a++;
int y= ++b;
int z = a+x;
System.out.println(z);
	}

}
