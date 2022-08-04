package com.cg.lamex;

import java.util.LinkedList;

public class CollectionLamExp {

	public static void main(String[] args) {
		LinkedList<Object>obj=new LinkedList();
		obj.add(1);
		obj.add(1);
		obj.add(1);
		obj.add(1);
		System.out.println(obj);
		//lambda Expression
		obj.forEach((i)->//forEach is an iteration method
		{
			System.out.println(i);
		});

	}

}
