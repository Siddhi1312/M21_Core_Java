package com.cg.superKey;
// to access parent cls method
class birds
{
	String name ="migratory";

void display()
{
	System.out.println(name);
}
}
class sparrow extends birds
{ //overriding above display method
	void display()
	{
		System.out.println("black");
	}
	void print ()
	{//accessing method from same cls to another cls
		display();
// accessing parent cls method using super keyword
		super.display();
	}
}
public class superMethod {

	public static void main(String[] args) {
		//object creation
		sparrow s=new sparrow();
		s.print();

	}

}
