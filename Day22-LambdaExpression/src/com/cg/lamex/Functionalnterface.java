package com.cg.lamex;
interface A
{
	void show();
}
/*class B implements A
{
	public void show()
	{
		System.out.println("program on functional interface");
	}
}*/
public class Functionalnterface {

	public static void main(String[] args) {
		//B b=new B();
		//b.show();
		//lambda expression(zero parameter)
		A obj=()->
		{
			System.out.println("program on functional interface");
		};
		obj.show();

	}

}
