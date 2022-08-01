package com.cg.multithreading;
class food
{
	//public synchronized void display()//o/p will be printed in random sequence
	public static synchronized void display()//same o/p sequence every time
	{
		System.out.println("Current thread" + Thread.currentThread().getName());
		for (int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"i-"+i);
			try
			{
				Thread.sleep(20);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
		
			class valueof implements Runnable
			{
				Thread t;
				food val;
				valueof(food val)
				{
					this.val=val;
					t= new Thread(this);
					t.start();
				}
				public void run()
				{
				  val.display();
				}
		
	
}

public class StaticExample {

	public static void main(String[] args) {
		food obj1= new food();
		food obj2= new food();
		valueof v1 = new valueof(obj1);
        valueof v2 = new valueof(obj2);

	}

}
