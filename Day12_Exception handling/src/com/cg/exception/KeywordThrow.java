package com.cg.exception;
//throw keyword: used to throw an exception explicitly
public class KeywordThrow {
	public static void validate (int age)
	{
		if (age<21 || age>27)
		 throw new ArithmeticException("not eligible");
		else
			System.out.println("eligible");
			
	}

	public static void main(String[] args) {
		try
		{
			validate (30);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest code");

	}

}
