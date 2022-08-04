package com.cg.lamex;

import java.util.Arrays;

import java.util.Collections;
import java.util.Comparator;

public class ComparableLambda {

	public static void main(String[] args) {
		//lambda expression
		Comparator<String>obj=(s1,s2)->Integer.compare(s1.length(),s2.length());
		String str[]= {"abc","def","ghi"};
		Collections.sort(Arrays.asList(str),obj);
		//system.out.println(obj);
		for(String i:str)
		{
			System.out.println(i);
		}

	}

}
