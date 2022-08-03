package com.cg.annotations;
//custom annotation creation
@interface Custom
{
	//abstract method bcoz interface used to define custom annotation and it contains only abstract metho
	//single value annotation
	String read();
	int value();//multi value annotation
	float value1();
	
}
class b
{
	@Custom (read="hello",value=30,value1=2.5f)//it wont print
	public void display()
	{
		System.out.println("hie");
	}
}
public class SingleMultiValueAnno {

	public static void main(String[] args) {
		b c=new b();
		c.display();
		

	}

}
