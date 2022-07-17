package com.cg.inheritance;

import java.util.Scanner;
class schools
{ 
	Scanner s= new Scanner (System.in);
int m= s.nextInt();
int e= s.nextInt();
//marks=m;
//eco_status=e;
	void criterion(int marks,int eco_status)
	{
		marks=m;
		eco_status=e;
		System.out.println(" "+marks+" "+eco_status);
		
	}
}
class convent extends schools
{
	void name()
	{
		Scanner s1= new Scanner (System.in);
		String str= s1.nextLine();
		System.out.println(" name is : "+str);
	}
}
	class government extends schools
	{
		void ranking()
		{
			Scanner s2 = new Scanner (System.in);
			int rank= s2.nextInt();
			System.out.println(" "+rank);
		}
	}
	

public class HierarchicalInheritance {

	public static void main(String[] args) {
		convent p= new convent();
		p.criterion(10,11);
		p.name();
		government g= new government ();
		g.ranking();
		
		}

}
