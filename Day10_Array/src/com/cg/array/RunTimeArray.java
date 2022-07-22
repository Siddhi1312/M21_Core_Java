package com.cg.array;

import java.util.Scanner;

public class RunTimeArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array: ");
		int size=s.nextInt();
		int arr[]=new int[size];
		
		
		System.out.println(" enter the value: ");
		//to enter array elements
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("enter"+ i +"value");
			arr[i]=s.nextInt();
		}
		//to print array value that given as i/p
		for(int x:arr)
		{
			System.out.print(x+" ");
		}

	}

}
