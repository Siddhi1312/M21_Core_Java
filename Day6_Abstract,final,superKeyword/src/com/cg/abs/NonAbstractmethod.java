package com.cg.abs;
abstract class sports
{
	void play()
	{
		System.out.println("good for health");
	}
}
class cricket extends sports
{
	void display()
	{
	System.out.println("exciting");
	//super.play();
	}
	//cricket inheriting sports so no need to separately define play method here
}
public class NonAbstractmethod {

	public static void main(String[] args) {
cricket c = new cricket();
//as object can't be created for abstract cls so created for child cls
c.display();
c.play();
	}

}
