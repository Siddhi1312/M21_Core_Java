package com.cg.map;
//sorted map
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

	public static void main(String[] args) {
		SortedMap<String,String>s=new TreeMap<String,String>();
		s.put("siddhi", "kokil");
		s.put("rashmi", "byale");
		s.put("sushma", "gujale");
		//s.put("siddhi", "kokil");
		//sorted map doesn't print duplicated elements
		s.put("sid", null);
		System.out.println(s);
		//will print elements in alphabetical order
		//to print elements separately
		for(SortedMap.Entry m:s.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
