package com.cg.para;
//parameterised constructor
class A
{
	int age;// class variable
	String employment_status; //class variable
	A (int A,String E)// constructor arguments
	{
		age = A;
		employment_status= E;
	}
	void display()// method to display
	{
		System.out.println(" "+age+" "+employment_status);
		
	}
}

public class ParaConstructor {

	public static void main(String[] args) {
		A a= new A (22,"employed");
		A b= new A (20,"student");
		a.display();// calling method for objects
		b.display();
		

	}

}
