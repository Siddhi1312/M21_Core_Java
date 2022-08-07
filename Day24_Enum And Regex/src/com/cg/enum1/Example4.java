package com.cg.enum1;
interface pizza
{
	void display();
}
enum size implements pizza
{
	small,medium,large,extralarge;
	public void display ()
	{
	System.out.println("size is:"+this);	
	}
}

public class Example4 {

	public static void main(String[] args) {
		size.large.display();
		

	}

}
