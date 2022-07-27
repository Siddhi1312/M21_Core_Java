package com.cg.list;

import java.util.ArrayList;

public class CloneArrayList {

	public static void main(String[] args) {
		ArrayList  obj= new ArrayList();
		obj.add(10);//add() method
		obj.add(10);
		obj.add(10);
		obj.add(10);
		System.out.println(obj);
		Object clonelist;
		//shallow copy of arraylist 
		clonelist =obj.clone();
		System.out.println(clonelist);
		//cant dlt cloned elements
		//clonelist.clear();

	}

}
