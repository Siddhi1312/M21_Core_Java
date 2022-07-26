package com.cg.encap.pack4;
import com.cg.encap.pack3.GetSetMethod;//to access getsetmethod method class from package 3

public class encapsulation {

	public static void main(String[] args) {
		GetSetMethod c= new GetSetMethod();
		c.setAtm_pin(1299);
		System.out.println(" "+c.getAtm_pin());

	}

}
