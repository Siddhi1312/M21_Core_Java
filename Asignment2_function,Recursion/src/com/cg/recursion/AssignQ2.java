package com.cg.recursion;

import java.util.Scanner;

public class AssignQ2 {
	static int add (int n)
	{
	int sum=n%10;
	if(n==0)
      return 0;
	else 
		return sum+add(n/10);
	
	}

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n= s.nextInt();
		System.out.print(add(n));
s.close();

	}

}
