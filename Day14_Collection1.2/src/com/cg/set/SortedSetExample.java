package com.cg.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		SortedSet<Object>s=new TreeSet<Object>();
		//as Sortedset is interface so cant be instantiated so TreeSet used which can be instantiated
		s.add("siddhi");
		s.add("summary");
		s.add("salt");
		System.out.println(s);
		//will sort string in ascending order

	}

}
