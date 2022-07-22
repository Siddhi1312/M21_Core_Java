package com.cg.anonycls;
 abstract class anonymous
{
	public abstract void trial();
}

public class AnonymCls {

	public static void main(String[] args) {
	anonymous a= new anonymous()
			{
	public void trial()
	{
		System.out.println(" trial");
	}

	};
	a.trial();

}
}
