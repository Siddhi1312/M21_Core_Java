package com.cg.arrays;

import java.util.Scanner;

public class TwoDUserInput {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter outside array size ");
		int m=s.nextInt();
		System.out.print("enter inside array size");
		int n=s.nextInt();
		int arr[][]=new int[m][n];
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("enter"+i+" "+j+"value ");
				arr [i][j]=s.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length;j++)
			{
				
				System.out.print(arr[i][j]+" ");
			}
		}
			


	}

}
