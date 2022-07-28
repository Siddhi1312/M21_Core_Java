package com.cg.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<Object>s=new HashSet<Object>();
		//Hashse/set is an unordered collection i.e will print elements randomly and LinkedHashSet is ordered
		s.add("prerana");
		s.add(20);
		s.add(88);
		s.add(8.2);
		s.add(null);//set allow null value
		s.add(8.2);//set wont print duplicated values but list will allow
		System.out.println(s);
		
		
		

	}

}
