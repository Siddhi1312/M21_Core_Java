package com.cg.interf;
//multilevel inerface
interface vehicle
{
	void speed();
}
//when have to use two interfaces then use'extends'keyword to access one interface by another
interface bus extends vehicle
{
	void capacity();
}
class define implements bus
{// have to provide implementation for all abstract methods
	public void capacity()
	{
		System.out.println("speed");
	}
	public void speed ()
	{
		System.out.println("speed");
	}
}

public class MultilevelInterface {

	public static void main(String[] args) {
	define d =new define();
	d.capacity();
	d.speed();

	}

}
