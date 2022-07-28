package com.cg.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class QueueIteratorExample {

	public static void main(String[] args) {
		Queue<Object>q=new ArrayDeque<Object>();
		for (int i=11;i<15;i++)
		{
			q.add(i);
		}
		System.out.println(q);
		boolean b=q.offer(25);//add 25 in queue and boolean method will give o/p as true if added else false
		//here b is variable for boolean method
		System.out.println(b);
		System.out.println(q);//will print queue with 25
		//iterator:to return every element separately in collection bcoz it print all elements in square bracket and ierator prints on separate line
		Iterator<Object>itr=q.iterator();
		System.out.println("elements are: ");
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
		

	}

}
