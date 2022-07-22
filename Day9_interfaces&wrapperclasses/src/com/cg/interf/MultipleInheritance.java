package com.cg.interf;
//multiple inheritance
interface lion
{
	void colour();
}
interface lioness
{
	void physique();
}
class cubs implements lion,lioness
{
	public void colour()
	{
		System.out.println(" lion");
	}
	public void physique()
	{
		System.out.println(" lioness");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		cubs c=new cubs();
		c.colour();
		c.physique();

	}

}
