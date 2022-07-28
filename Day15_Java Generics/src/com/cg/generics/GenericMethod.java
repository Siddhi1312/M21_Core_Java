package com.cg.generics;

public class GenericMethod {

	public static void main(String[] args) {
		Integer s[]= {13,14,15};
		Character c[]= {'s','s','k'};
		System.out.println("int array: ");
		read (s);
		System.out.println("char array: ");
		read (c);
	}
      
		//generic method
		//E=element
		public static <E> void read(E[] elements)
		{
			for(E elem:elements)
			{
				System.out.println(elem);
			}
			System.out.println();
			
		}

	}


