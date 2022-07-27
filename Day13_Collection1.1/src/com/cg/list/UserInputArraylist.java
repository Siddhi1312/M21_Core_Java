package com.cg.list;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInputArraylist {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String str=s.nextLine();
		System.out.println(str);
		Scanner token=new Scanner (str);
		//to devide string into elements and give space in between
		token.useDelimiter(" ");
		//user input array list
		ArrayList<Object>arr=new ArrayList <Object>();
		//to return the elements of the array
		while (token.hasNext()) {
			arr.add(token.next());
			//first element statrts from 0 so last will be arr.size-1
			System.out.println(arr.get(arr.size()-1));
			
		}
		System.out.println(arr);

	}

}
