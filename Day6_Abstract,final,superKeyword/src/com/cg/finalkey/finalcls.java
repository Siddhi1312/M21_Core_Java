package com.cg.finalkey;
//final class cant be inherited
//final class places
class places
{
	void travel() {
		System.out.println(" natural");
	}
}
class mountain extends places
{
	void travel()
	{
		System.out.println(" beautiful");
	}
}

public class finalcls {

	public static void main(String[] args) {
		places p=new places();
		p.travel();

	}

}
