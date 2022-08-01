package com.cg.multithreading;

public class ThreadClassExample extends Thread
{
	public void run()
	{
		System.out.println("multithreading");
	}

	public static void main(String[] args) {
		ThreadClassExample e=new ThreadClassExample();
		e.start();//start(): default method in thread,invokes thread to run its methods
		//e.start();//if start method called twice then it will print output along with exception
		//e.run();
		/*Thread t= Thread.currentThread();
		System.out.println("current thread:"+t);//current thread is main,5 is default value
		try
		{
			Thread.sleep(10);
		}
		catch (InterruptedException e)
		{
			System.out.println("main");
		}*/
		

	}

}
