package com.cg.thisKey;
// 2 this key can be passed as an argument in constructor call
class a
{
	int v;
	a ()
	{
			
		}
	a (int v)
	{// constructor parameter name and variable name is same sp this keyword
		this.v=v;
	}
	
}
public class ConstructorArgument {

	public static void main(String[] args) {
		a A=new a(5);
		System.out.println(""+A.v);

	}

}
