package com.cg.strings;
//equals() method
public class EqualsMethod {

	public static void main(String[] args) {
		//using string literal same strings allocated same memory so '==' works
		//String str="hello";
		//String str1= "hello";
		//System.out.println(str==str1);
		//using new keyword ,different strings allocated diff memory so '==' operator wont work and 'equals'method will work
		String str=new String("hie");
		String str1=new String("hie");
		//System.out.println(str==str1);
		System.out.println(str .equals  (str1));

	}

}
