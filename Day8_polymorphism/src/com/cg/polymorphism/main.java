package com.cg.polymorphism;
// method overriding
class parent
{
	void m1()
	{
		System.out.println("Parent-m1");
	}
	
}

public class main extends parent
{ 
	void m1()
	{
		System.out.println("child-m1");
	}
	void m2()
	{
		System.out.println("child-m2");
	}

	public static void main(String[] args) {
		parent p=new main();
		// as main class so method in main cls will be called
		p.m1();
		main c= new main();
		c.m2();
		

	}

}
