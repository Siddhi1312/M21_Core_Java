package com.cg.multithreading;

class states
{
	
	
	synchronized void capitals(int c)
	{
		for(int i=1;i<=5;i++)

		{

		System.out.println(c*i);

		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
}
class thread1 extends Thread
{
	states s;
	thread1 (states s)
	{
		this.s=s;
	}
	public void run()
	{
		s.capitals(5);
	}
}
class thread2 extends Thread
{
	states s;
	thread2 (states s)
	{
		this.s=s;
	}
	public void run()
	{
		s.capitals(20);
	}
}

public class SyncMethodExample {

	public static void main(String[] args) {
		states obj=new states();
		thread1 t1=new thread1(obj);
		thread2 t2=new thread2(obj);
		t1.start();
		t2.start();
		

	}

}
