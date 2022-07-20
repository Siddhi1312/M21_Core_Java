package com.cg.polymorphism;
//constructor overloading
class triber
{
	int speed;
	String engine;
	triber()
	{
		System.out.println("renault-kiger");
	}
	triber (int speed, String engine)
	{
		this.speed=speed;
		this.engine=engine;
		System.out.println("speed is: "+speed +"and engine is on"+engine);
	}
}

public class constructorOverloading {

	public static void main(String[] args) {
		triber t=new triber();
		triber t1= new triber (50,"diesel");

	}

}
