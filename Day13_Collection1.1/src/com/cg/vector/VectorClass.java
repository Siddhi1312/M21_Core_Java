package com.cg.vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector v=new Vector();
		//Vector<Object> v=new Vector<Object>();
		//v.add(11);
		//v.add("siddhi");
		//v.add(4.5f);
		v.add(0,11);
		//have to add elements according to index sequence
		//v.add(3,"siddhi");
		v.add(1,"siddhi");
		System.out.println(v);
		System.out.println(v.set(0, 23));
		//copying all elements of vector to arraylist using addall method
		ArrayList<Object> a=new ArrayList<Object>();
		a.addAll(v);
		System.out.println(a);
		//if copied using addall ,can dlt all elements  
		a.clear();
		System.out.println(a);
	

	}

}
