package com.cg.interf;
//1st method to implement interface
 interface Hidden
{//though variables are by default static final, need to initialize i.e provide some constant value to it
	 int x=10;
	 // abstract method
	void output1();
}
class demo1 implements Hidden
{
	// implementation of abstract method
	public void output1()
	{
		System.out.println(" interface");
	}
}
 class inter1 {

	public static void main(String[] args)
	{// object of interface cant be created,obj of cls is created
demo1 d=new demo1();
d.output1();
	}

}
