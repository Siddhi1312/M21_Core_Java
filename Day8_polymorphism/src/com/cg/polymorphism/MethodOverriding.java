package com.cg.polymorphism;
//method overriding
//need to create two classes
class mobile
{
	void brand(String str)
	{
		System.out.println(str);
	}
}
class manufacturing extends mobile
{
	void brand (String str)
	{
		System.out.println(str);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		manufacturing m=new manufacturing();
		m.brand("samsung");
		mobile m1=new mobile();
		m1.brand("nokia");
// need to create two different objects for diff methods as both contain same method with same parameters
// bcoz compiler will be confused with same method and parameters
	}

}
