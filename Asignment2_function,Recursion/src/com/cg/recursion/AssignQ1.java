package com.cg.recursion;

import java.util.Scanner;

public class AssignQ1 {
	static int fibonacci(int n)
	{
		if(n<=1)
			return n;
		else
	return fibonacci(n-1)+fibonacci(n-2);
			
	}

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n= s.nextInt();
		System.out.print(fibonacci(n));
s.close();

	}

}
