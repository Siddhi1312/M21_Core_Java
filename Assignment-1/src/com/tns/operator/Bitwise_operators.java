package com.tns.operator;
import java.util.Scanner;

public class Bitwise_operators {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int a= s.nextInt();
		int b= s.nextInt();
		int res= a & b;
		int res1= a | b;
		int res2= a^b;
		int res3= a<<b;
		int res4= a>>b;
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);

	}

}
