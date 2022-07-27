package com.cg.vector;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		Stack s= new Stack();
		//Stack<Object> s= new Stack<Object>();
		//push method used only in stack to add elements, add method can also be used 
		s.push(11);
		s.push(13);
		s.push(" rashmi");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		
		

	}

}
