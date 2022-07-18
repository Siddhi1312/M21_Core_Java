package com.cg.abs;
// cant make cls final and abstract at a time
//final abstract car
abstract class car
{
	abstract void display();
}
class mercedes extends car
{
	void display()
	{
		System.out.println("mercedes");
	}
}
public class finalabstractcls {

	public static void main(String[] args) {
	
mercedes m=new mercedes();
m.display();
	}

}
