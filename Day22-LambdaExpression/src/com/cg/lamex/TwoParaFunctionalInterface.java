package com.cg.lamex;

interface d
{
	String numbers(String a,String b);
}

public class TwoParaFunctionalInterface {

	public static void main(String[] args) {
		d obj =(String a,String b)->
		{
			
			System.out.println(" "+a+" "+b);
			return "ab";
		};
		obj.numbers("sid","shri");
		

	}

}
