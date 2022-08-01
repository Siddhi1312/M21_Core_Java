package com.cg.multithreading;

public class SetNameMethod {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("cnt thread;"+ t);
		t.setName("new");//to set thread name
		System.out.println("cnt thread:" +t);
		try
		{
			Thread.sleep(10);
		}
		catch (InterruptedException e)
		{
			System.out.println("main thread interrupted");
		}

	}

}
