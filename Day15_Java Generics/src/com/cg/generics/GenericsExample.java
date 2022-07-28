package com.cg.generics;

import java.util.LinkedList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
		List<Integer>l=new LinkedList<Integer>();
		l.add(11);
		//compile time checking and type safe
		//l.add(" sid");
		System.out.println(l);
		//Type casting is not required in generics
		List<String>l1=new LinkedList<String>();
		//Link l1=new LinkedList();
		l1.add("siddhi");
		l1.add("kokil");
		String str=l1.get(0);
		//type-casting explicitly if there is not any object type
		//String str1=(String)l1.get(1);
		System.out.println(str);
		
		
		

	}

}
