package com.cg.polymorphism;
//method overloading
class shape
{// by changing the number of arguments
	int area(int a)
	{
		return a*a;
	}
	int area (int a,int b)
	{
		return a*b;
	}
}
public class methodoverloading {

	public static void main(String[] args) {
		shape s= new shape();
	System.out.println(	s.area(10));
	System.out.println (s.area(10,20));

	}

}
