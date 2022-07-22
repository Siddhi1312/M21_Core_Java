package com.cg.arrays;

public class CompileTimeArray {

	public static void main(String[] args) {
		int arr[]= {11,22,33,44,55,66};
		//System.out.println(arr[4]);//to print single value
		/*for (int i=0;i<arr.length;i++)//arr.length=array length function
		{
			System.out.println(arr[i]+" ");
		}*/
		//enhanced for loop
		for(int x:arr)
		{
			System.out.print(x+" ");
		}

	}

}
