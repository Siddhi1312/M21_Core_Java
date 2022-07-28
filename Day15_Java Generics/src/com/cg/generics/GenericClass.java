package com.cg.generics;
//generic class example
//T= data type
public class GenericClass<T> {
	T gen;
	public void display()
	{
		System.out.println(gen.getClass().getName());
	}

	public static void main(String[] args) {
		GenericClass<Integer>obj=new GenericClass<Integer>();//generics advantage
		obj.gen=15;//it will accept only integer so type safe
		obj.display();
		

	}

}
