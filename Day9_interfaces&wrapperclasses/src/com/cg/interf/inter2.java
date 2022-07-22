package com.cg.interf;
//2nd method to implement interface
public interface inter2 {
	void output2();

}
class demo2 implements inter2
{// essential to make method implementation "public"
	public void output2()
	{
		System.out.println("interface");
	}
	
}
