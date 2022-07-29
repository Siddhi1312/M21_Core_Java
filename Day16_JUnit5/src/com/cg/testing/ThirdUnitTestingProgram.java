package com.cg.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ThirdUnitTestingProgram {
	@DisplayName("Test is successfully implemented")//this will print custom name i.e in junit not on console
	@Test
	void function()
	{
		System.out.println(" name");
	}
	@Test
	@Disabled("Not implemented")//to hide any method this annotation
	void function1()
	{
		System.out.println("siddhi");
		
	}

}
