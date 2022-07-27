package com.cg.superKey;
//super keyword to invoke parent cls constructor
class places
{
	places()
	{
		System.out.println("mountains");
	}
}
class mountains extends places
{
	mountains()
	{
		super();//invoking parent cls constructor and no need to mention constructor name
		//first call constructor before writing print statement
		System.out.println("ooty");
		
		
	}
}
public class SuperConstructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		//have to create objects to execute statements in constructor
		mountains m=new mountains();
		//need not to call constructor like method

	}

}
