package com.cg.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompileAndMatcherMethod {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("programming");
		Pattern p1 =Pattern.compile("java");
		Matcher m= p.matcher("java programming is enough to get job in IT");
		Matcher m1= p1.matcher("java programming is enough to get job in IT");
		while(m.find())
		{
			System.out.println("pattern: "+m.start()+" to"+(m.end()-1));
		}
		while(m1.find())
		{
			System.out.println("pattern: "+m1.start()+" to"+(m1.end()-1));
		}
		

	}

}
