package com.cg.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Genericsexample1 {

	public static void main(String[] args) {
		Map<Integer,String>m=new HashMap<Integer,String>();
		m.put(1,"siddhi");
		m.put(2, "kokil");
		System.out.println(m);
		Set<Map.Entry<Integer,String>>itr=m.entrySet();
		
		Iterator<Map.Entry<Integer,String>>itr1=itr.iterator();
		while(itr1.hasNext())
		{
			//type-casting is not required
			Map.Entry e=itr1.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}


	}

}
