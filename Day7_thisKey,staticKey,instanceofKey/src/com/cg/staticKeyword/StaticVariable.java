package com.cg.staticKeyword;

public class StaticVariable {
	//static variable initialised before any object of class created
static int a=10;
	public static void main(String[] args) {
		a=11;
		// value of static variable can be changed
		System.out.println(a);

	}

}
