package com.cg.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		Set<Object>s=new LinkedHashSet<Object>();
		s.add("siddhi");
		s.add(21);
		s.add(2.5);
		System.out.println(s);
		//to extract the elements of array separately toArray method used
		Object[] arr=s.toArray();
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
		//enhanced for loop; object instead of int is used as set contains elements of diff datatype
		for(Object itr:arr)
		{
			System.out.println(itr);
		}
			

	}

}
