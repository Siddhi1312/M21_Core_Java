package com.cg.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		//Deque d=new ArrayDeque();//here it'll show warning
		Deque<Object> d=new ArrayDeque<Object>();//it removes warning
		//as deque is interface so cant be instantiated so need to use ArrayDeque
		d.add(10);
		//adding front element
		d.addFirst(11);
		//adding rear element
		d.addLast(12);
		d.add("siddhi");
		System.out.println(d);
		//removing front element
		d.removeFirst();
		//removing rear element
		d.removeLast();
		System.out.println(d);

	}

}
