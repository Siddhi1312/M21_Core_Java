package com.cg.finalkey;
class c{
	//cant override any final method
	//final void print()
	void print()
	{
		System.out.print("acceptance");
	}
}
class d extends c
{
	void print ()
	{
		System.out.println(" perspective");
	}
}

public class finalmethod {

	public static void main(String[] args) {
	d obj=new d();
	obj.print();

	}

}
