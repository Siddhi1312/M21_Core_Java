package com.cg.lamex;
//functional interface
interface c
{
	void read(String reason);
}

public class SingleParaFunctionalInterface {

	public static void main(String[] args) {
		c obj=(String reason)->
		{
		System.out.println(reason);	
		};
		obj.read("ordinary");

	}

}
