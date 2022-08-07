package com.cg.regex;

import java.util.Scanner;

public class SplitMethod {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//string splitters:@@,--(only one can be used at a time)
		String str="m-21\r\n siddhi kokil \r\n";
		String [] res=str.split("\\r\\n");
		for (String i:res)
		{
			System.out.println(i);
		}

	}

}
