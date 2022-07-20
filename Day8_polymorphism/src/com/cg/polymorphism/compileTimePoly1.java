package com.cg.polymorphism;
class A
{// different types of argument
	void add (int a, int b)
	{
		System.out.println(a+b);
	}
	void add(float a, float b)
	{
		System.out.println(a+b);
	}
}

public class compileTimePoly1 {

	public static void main(String[] args) {
		A obj=new A();
		obj.add(10,10);
		obj.add(2.6f,3.9f);

	}

}
