package com.cg.enum1;

public class Example5 {
	enum empType
	{
		contract,permanent,Temporary;
	}
	static void print(empType e)
	{
		if(e==empType.contract)
		{
			System.out.println("contract employee");
		}
		else if(e==empType.permanent)
		{
			System.out.println("permanent employee");
		}
		else
		{
			System.out.println("temporary employee");
		}
	}


	public static void main(String[] args) {
		empType e=empType.Temporary;
		print(e);

	}

}
