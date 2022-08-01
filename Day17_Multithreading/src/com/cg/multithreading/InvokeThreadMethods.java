package com.cg.multithreading;
class Test extends Thread//either need to extend thread cls or create object for it in main
{
	public void run()
	{
		System.out.println("main");
	}
}

public class InvokeThreadMethods {

	public static void main(String[] args) {
	Test t=new Test();
	t.start();
	//t.start();//as calling start() method twice so will give exception

	}

}
