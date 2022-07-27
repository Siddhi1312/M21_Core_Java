package com.cg.list;

import java.util.ArrayList;
import java.util.List;

public class Alist {

	public static void main(String[] args) {
		//declaring arraylist from collection class
		List<Integer>obj=new ArrayList<>();//()=for size
		//to store homogeneous elements
		//sArrayList obj=new ArrayList<>();//to store heterogeneous elements
		obj.add(10);//add() method
		obj.add(10);
		obj.add(10);
		obj.add(10);
		System.out.println(" "+obj);
		//size() method to check size of an arraylist
		System.out.println(obj.size());
		//contains() method to check particular element in array
		System.out.println(obj.contains(11));
		//indexof() method to check index of particular element
		System.out.println(obj.indexOf(10));
		//lastindexof() method to check index of last occurence of any element
		System.out.println(obj.lastIndexOf(10));
		System.out.println(obj.set(1,(int) '5'));
		System.out.println(obj.isEmpty());
		System.out.println(obj);

	}

}
