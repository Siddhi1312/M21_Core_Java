package com.cg.annotations;
class a
{
	//built in annotation
	@Deprecated//suggesting not to use this method
	void print()
	{
		System.out.println("good morning");
	}
}

public class DeprecatedAnnotation {

	public static void main(String[] args) {
		a b=new a();
		b.print();
		

	}

}
