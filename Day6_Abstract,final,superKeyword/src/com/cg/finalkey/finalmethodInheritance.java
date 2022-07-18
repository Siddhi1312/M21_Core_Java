package com.cg.finalkey;
class s
{
	final void run()
	{
		System.out.println(" siddhi");
	}
}

public class finalmethodInheritance extends s {

	public static void main(String[] args) {
		finalmethodInheritance f= new finalmethodInheritance();
		f.run();
		// final method can be inherited but cant override		

	}

}
