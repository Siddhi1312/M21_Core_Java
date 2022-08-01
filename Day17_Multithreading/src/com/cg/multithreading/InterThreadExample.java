package com.cg.multithreading;
class fruit
{
	int value =1000;
	synchronized void cost(int value)
	{
		System.out.println("Spend value");
	     if(this.value<value)
    {
        System.out.println("Less value");
      try
      {
    	  wait();
    	  
      }
      catch(Exception e)
      {}
     
    }
       this.value=this.value-value;
      System.out.println("process completed");
    }

       synchronized void paid (int value)
       {
    	   System.out.println("get value");
    	   this.value =this.value+value;
    	   //notify();
    	   notifyAll();
    	   System.out.println("completed");
    	   
       }
}

public class InterThreadExample {

	public static void main(String[] args) {
	fruit f=new fruit();
	new Thread()
	{
		public void run()
		{
			f.cost(25);
		}
	}.start();
	new Thread()
	{
		public void run()
		{
			f.paid(20);
		}
	}.start();

	}

}
