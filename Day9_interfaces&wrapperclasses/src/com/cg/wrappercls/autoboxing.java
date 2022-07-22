package com.cg.wrappercls;
// converting primitive types to its respective wrapper cls objects i.e autoboxing
public class autoboxing {

	public static void main(String[] args) {
	   float x= 10.9f;// primitive type
	   Float a=x;//conerting primitive type to object of wrapper cls
	   //no need to typecast explicitly
	   Float f=new Float (20);
	   System.out.println(x+" "+a+" "+f);

	}

}
