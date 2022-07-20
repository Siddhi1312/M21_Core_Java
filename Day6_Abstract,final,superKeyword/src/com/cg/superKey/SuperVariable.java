package com.cg.superKey;
//super keyword to access parent cls instance variable
class laptop
{// protected= only can be accessed in that cls
	protected String name = "lenovo";
}
class lenovo extends laptop
{
String name= "ideapad";
void display()
{
System.out.println(name);
System.out.println(super.name);
}
}
public class SuperVariable {

	public static void main(String[] args) {
		lenovo l=new lenovo();
		l.display();
		

	}

}
