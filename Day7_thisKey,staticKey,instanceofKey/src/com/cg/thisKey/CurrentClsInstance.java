package com.cg.thisKey;
//4 this keyword to return current cls instance
class B
{
	int w;
	int r;
	B()
	{
		w=10;
		r=20;
	}
// method to return cnt cls instance
B get()
{
return this;//will return values of w & r mentioned in this cls	
}
void display()
{
	System.out.println(" w= "+w+"r= "+r);
}
}
public class CurrentClsInstance  {

	public static void main(String[] args) {
		B b=new B();
		b.get().display();

	}

}
