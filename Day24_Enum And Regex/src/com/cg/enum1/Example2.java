package com.cg.enum1;

public class Example2 {
	//enum inside class
	enum margin
	{
		top, bottom, left,right;
	}

	public static void main(String[] args) {
		int count=1;
		for(margin m:margin.values() )
		{
			//printf=to print o/p in specified format
			System.out.printf("margin:%d=%s\n",count++,m);
		}

	}

}
