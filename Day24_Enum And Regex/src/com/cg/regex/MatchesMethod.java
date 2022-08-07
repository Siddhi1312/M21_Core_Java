package com.cg.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MatchesMethod {

	public static void main(String[] args) {
		String str="sid k";
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		boolean result=Pattern.matches(str,input);
		System.out.println(result);
		s.close();
		
		

	}

}
