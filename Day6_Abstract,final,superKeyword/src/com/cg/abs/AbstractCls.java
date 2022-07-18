package com.cg.abs;
//abstract cls
abstract class flower
{  //abstract method
	abstract void read();
}
class rose extends flower{
	//defining abstract method from abstract cls in child cls
	void read()
	{
		System.out.println("this is rose");
	}
}
public class AbstractCls {

	public static void main(String[] args) {
		//flower f=new flower():-cant instantiate abstract cls
		rose r=new rose();
		r.read();

	}

}
