package com.cg.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		Set<Object>s=new LinkedHashSet<Object>();
		//set is an unordered collection
		s.add("prerana");
		s.add(20);
		s.add(88);
		s.add(8.2);
		System.out.println(s);

	}

}
