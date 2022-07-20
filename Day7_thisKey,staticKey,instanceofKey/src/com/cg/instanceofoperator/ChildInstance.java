package com.cg.instanceofoperator;
class A
{
	
}
public class ChildInstance extends A {

	public static void main(String[] args) {
		
		ChildInstance c=new ChildInstance();
		// c is also an object of A cls bcoz ChildInstance cls access cls A
		System.out.println(c instanceof A);
		//instanceof= object of
	}

}
