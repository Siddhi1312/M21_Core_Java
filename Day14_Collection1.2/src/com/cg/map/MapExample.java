package com.cg.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		Map<Object,Object>m=new HashMap<Object,Object>();
		//Hashmap is unordered
		//LinkedHashMap is ordered
		m.put(6, "siddhi");//put() method to add elements in map
		m.put(7, "pandharpur");
		m.put(8, "pccoe");
		System.out.println(m);
		System.out.println(m.get(8));//get() method to return particular element
		m.remove(7);
		for (Map.Entry map:m.entrySet())
		{
			System.out.println(map.getKey()+" "+map.getKey());
		}
		

	}

}
