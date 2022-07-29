package com.cg.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class FifthUnitTestingProgram {
	@Test
	@Disabled
	void trueAssumption()
	{
		//assumeTrue will execute only if your assumption and result both are true
		assumeTrue(5>1);
		assertEquals(5+2,7);
		
	}
	@Test
	void falseAssumption()
	{
		//will eveluate the given assumptions and will run test only if false
		assumeFalse(3>4);
		assertEquals(3+4,7);
	}
	@Test
	void assumptionThat()
	{
		//it will evaluate the lambda eecutable only if given assumption is true
		String str="siddhi";
		assumingThat(str.equals("siddhi"),
				()->assertEquals(2+3,5));//lambda expression
		
	}

}
