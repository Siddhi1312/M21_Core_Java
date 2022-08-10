package com.cg.streamsoperation;

import java.util.LinkedList;

public class CollectionLambda {

	public static void main(String[] args) {
		LinkedList<Integer>obj=new LinkedList<>();
		obj.add(13);
		obj.add(14);
		//System.out.println(obj);
		//obj.forEach(i->System.out.println(i));
		//or
		obj.forEach(System.out::println);

	}

}
