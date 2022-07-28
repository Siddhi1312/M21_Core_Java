package com.cg.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<Object>q= new PriorityQueue <Object>();
		//in priority queue output will be according to priorities of jvm irrespective of insertion order
		q.add(20);
		q.offer(15);
		q.add(11);
		q.add(20);
		System.out.println(q);
		System.out.println(q.peek());
		Queue<Object>q1= new ArrayDeque <Object>();
		//array deque will print element acc to insertion sequence
		q1.add(20);
		q1.offer(15);
		q1.add(11);
		System.out.println(q1);
		System.out.println(q1.peek());//to print first element
		System.out.println(q1.element());//it is also used to print first element
		System.out.println(q1.remove());
		System.out.println(q1);
		System.out.println(q1.remove());
		System.out.println(q1);
		System.out.println(q1.remove());
		System.out.println(q1);
		System.out.println(q1.remove());//will give exception as no more elements in queue
		System.out.println(q1.poll());//works like remove method only but wont give excetion and print null when no elements
		System.out.println(q1);
		
	}

}
