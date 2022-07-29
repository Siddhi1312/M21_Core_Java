package com.cg.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SecondUnitTestingProgram {
	@Test
	@BeforeAll
	static void read()//beforeAll method need to make static
	{
		System.out.println("@BefooreAll executes once before all the methods in this class");
		
	}
	@Test
	@BeforeEach
	void accept()
	{
		System.out.println("@BeforeEach-executes before each test method in this class");
	}
	@Test
	void print()
	{
		System.out.println("run");
	}

}
