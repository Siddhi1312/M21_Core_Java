package com.cg.thisKey;
//1 this keyword used to refer instance variable of current cls
class beverages
{
	String str;
	String str1;
	void taste(String str,String str1)
	{
	this.str=str;
	this.str1=str1;
	}
	void display()
	{
		System.out.println("taste = "+str);
		System.out.println("taste= "+str1);
	}
}

public class instanceVariable {

	public static void main(String[] args) {
	beverages b= new beverages();
	b.taste("sour", "pungent");
	b.display();

	
	}

}
