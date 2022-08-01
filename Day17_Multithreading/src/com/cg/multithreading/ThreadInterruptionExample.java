package com.cg.multithreading;
class Thread4 extends Thread
{
	public void run()
	{
		System.out.println("interruption");
	}
}

public class ThreadInterruptionExample {

	public static void main(String[] args) {
		Thread4 t= new Thread4();
		t.start();
		t.interrupt();//as thread is not in sleep or wait state, interupt() method wont execute and thread will give output


	}

}
