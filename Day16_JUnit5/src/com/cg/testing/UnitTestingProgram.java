package com.cg.testing;

import org.junit.jupiter.api.Test;

public class UnitTestingProgram 
{
	@Test//this annotation imp to run code with junit
	void test()
	{
		System.out.println("junit testing");
	}
	@Test
	void display()
	{
		int s=10;
		System.out.println(s);
	}

}
