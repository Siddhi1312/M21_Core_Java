package com.cg.pack2;
//how to access methods from any class of any package
// methods from package class can be accessed which don't have main method  
//1.import com.cg.pack1.package1;
import com.cg.pack1.*;
public class package2 {
	public static void main (String[] args) {
		package1 p= new package1();
		p.print();
	}

}
