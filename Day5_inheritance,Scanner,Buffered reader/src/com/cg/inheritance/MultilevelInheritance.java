package com.cg.inheritance;
import java.util.Scanner;
class people
{
	public String str;
	public int a;
	
	void traits()
	{
		System.out.println("talkative,friendly or moody?   ");
		Scanner s= new Scanner (System.in);
		String str= s.nextLine();
		if (str.equals("talkative") || str.equals("friendly"))
		{
			System.out.println("extrovert");
		}
		else
		{
			System.out.println("introvert");
		}
	}
}
	class personalities extends people
	{
		void achievements (String str1)
		{
		System.out.println(" " +str1);
		}
	}
	class professionals extends personalities
	{
		void professions()
		{
			Scanner s= new Scanner (System.in);
			float a = s.nextFloat();
			
		if (a>=50)
		{
			System.out.println("doctor");
		}
		else
		{
			System.out.println("engineer");
		}
	}
	
	}	

public class MultilevelInheritance {

	public static void main(String[] args) {
		professionals p= new professionals ();
		p.traits();
		p.achievements("scholarship awardee");
		p.professions();
		

	}

}
