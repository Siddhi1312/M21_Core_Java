package com.cg.concurrency;
//to run this code= 1st collapse the project then by right clicking run as application
import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

public class ConcurrencyEg implements Runnable
{
	final Main m;
	final int n;
	final String task;
	public ConcurrencyEg(Main m,int n,String task)
	{
		this.m=m;
		this.n=n;
		this.task=task;
		
	}
	public void run()
	{
		for (int i=0;i<=n;i++)
		{
			System.out.println(""+Thread.currentThread().getName());
			m.pause(Math.random());
		}
	}
}
class Main{
	public void print()
	{
		ExecutorService e=Executors.newFixedThreadPool(2);
		//simultaneously only two threads will run
		for (int i=0;i<5;i++)
		{
			e.execute(new ConcurrencyEg (this,i+1, "task"+(i+1)));
		}
			e.shutdown();
		}
	
	void pause(double seconds)
	{
		try
		{
			Thread.sleep(Math.round(1000.0*seconds));
		}
		catch(InterruptedException e)
		{
			System.out.println("exception"+e);
		}
	}

	public static void main(String[] args) {
		new Main().print();

	}

}
