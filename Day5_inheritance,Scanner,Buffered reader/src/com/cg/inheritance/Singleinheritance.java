package com.cg.inheritance;
import java.util.Scanner;
class Book
{
	Scanner s= new Scanner (System.in);
	public int pages = s.nextInt();
	//public int pages= 60;
	void classify()
	{
		if (pages>60)
		{
			System.out.println("literature");
		}else
			{
				System.out.println (" ordinary");
			}
		}
	}
class fiction extends Book
{
void content()
{
	System.out.println("interesting");
}
}


public class Singleinheritance {

	public static void main(String[] args) {
		fiction b= new fiction();
		//object of only child class
		b.classify();
		b.content();
		
		

	}

}
