package com.tns.decisionMaking;
//nested if 
import java.util.Scanner;
public class example3 {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int age= s.nextInt();
		int weight= s.nextInt();
		
		if (age>=12)
		{
			if (weight>=40)
			{
				if (weight <=110)
				{
					System.out.println ("eligible for bunjee jumping");
				}
				else
				{
					System.out.println ("extra ropes will be added");
				}
				
			}
			else
			{
				System.out.println("not eligible for bunjee jumping");
			}
			
		}
		
		}

}
