package com.cg.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

public class FourthUnitTestingProgram {
	@Test
	void display()
	{
		int a[]= {1,2,3,4,5};
		//assertEquals  method will check whether two parameters values are same or not
		//if same then wont get any failures in junit else will get
		assertAll("a",()->assertEquals(a[0],1),//a[3]=4//4==4//true//runs successfully
		        ()->assertEquals(a[2],3));
	}

}
