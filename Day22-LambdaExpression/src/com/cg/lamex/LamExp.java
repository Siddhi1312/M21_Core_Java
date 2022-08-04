package com.cg.lamex;
//functional interface
interface e
{
	String add(String str,String str1 );
}
public class LamExp {

	public static void main(String[] args) {
		//lambda expression without return statement
	e obj=(String str,String str1)->(str+str1);
	System.out.println(obj.add("sid", "shri"));

	}

}
