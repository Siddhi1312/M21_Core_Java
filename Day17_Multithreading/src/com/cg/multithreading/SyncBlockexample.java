package com.cg.multithreading;
class A
{
	void print(int w)
	{
		synchronized (this)//'this' is object reference
		{
			for (int i=1;i<=4;i++)
			{
				System.out.println(w*i);
				try
				{
					Thread.sleep(400);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}
}
class B extends Thread
{
	A obj;
	B(A obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.print(4);
	}
}
public class SyncBlockexample {

	public static void main(String[] args) {
		A a=new A();
		B b=new B(a);//object of A class is passed as A cls is inherited by B
		B b1= new B(a);
		b.start();
		b1.start();

	}

}
