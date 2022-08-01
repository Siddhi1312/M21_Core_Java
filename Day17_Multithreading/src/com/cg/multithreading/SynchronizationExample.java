package com.cg.multithreading;
class counter
{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}

public class SynchronizationExample {

	public static void main(String[] args) throws InterruptedException {
		counter c=new counter();
		Thread t1=new Thread (new Runnable()
				{
			public void run()
			{
				for (int i=1;i<=1000;i++)
				{
					c.increment();
				}
			}
				});
		Thread t2 =new Thread (new Runnable()
				{
			public void run ()
			{
				for (int i=1;i<=1000;i++)
				{
					c.increment();
				}
			}
				});
		t1.start();
		t2.start();
		t1.join();//this shows error so need to throw an exception at main
		t2.join();
		
System.out.println(c.count);
	}

}

