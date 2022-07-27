package com.cg.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistExample {

	public static void main(String[] args) {
		List<Object>obj=new LinkedList<>();
		obj.add(10);//add() method
		obj.add("siddhi");
		obj.add(88.2);
		obj.add(10);
		//All methods same as array list
		System.out.println(" "+obj);
		System.out.println(obj.size());
		System.out.println(obj.contains(11));
		System.out.println(obj.indexOf(10));
		System.out.println(obj.lastIndexOf(10));
		System.out.println(obj.set(1, '5'));
		System.out.println(obj.isEmpty());
		System.out.println(obj);

	}

}
