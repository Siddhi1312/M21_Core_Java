package com.cg.multithreading;
class needle extends Thread
{
	public void carry()
	{
	try
	{
		Thread.sleep(100);
		System.out.println("work");
	}
	catch(InterruptedException e)
	{
		System.out.println("Exception handled "+e);
	}
	System.out.println("thread is running");
	}
}
public class InterruptingMethods {

	public static void main(String[] args) {
		needle n=new needle();
		n.start();
		n.interrupt();
	System.out.println("is thread interrupted: "+n.isInterrupted());
	//System.out.println("is thread interrupted: "+n.interrupted());

	}

}
