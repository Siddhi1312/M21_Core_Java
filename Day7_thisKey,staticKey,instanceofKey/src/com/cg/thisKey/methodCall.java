package com.cg.thisKey;
//3 this key can be passed as an argument in method call
class Z
{// to provide reference to 'this' argument class and object name should be given
	void print(Z z)
	{
		System.out.println(" function invoked");
	}
	void display()
	{
		print(this);
	}
}
public class methodCall {

	public static void main(String[] args) {
		Z z=new Z();
		z.display();

	}

}
