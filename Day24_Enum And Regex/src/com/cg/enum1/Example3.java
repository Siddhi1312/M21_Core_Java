package com.cg.enum1;
enum bike
{
	pulser,KTM,R3,R15
}

public class Example3 {

	public static void main(String[] args) {
		//choice is given here not at run time
		bike b=bike.KTM;
		switch(b)
		{
		case pulser:
			System.out.println("pulser");
			break;
		case KTM:
			System.out.println("KTM");
			break;
		case R3:
			System.out.println("R3");
			break;
		case R15:
			System.out.println("R15");
			break;
			default:
				System.out.println("invalid");
				
		}

	}

}
