package com.cg.customexception;

import java.util.Scanner;

class NameNotFound extends Exception
{
	//constructor
	//create an own exception
	NameNotFound(String name)
	{
		super (name);
	}
}

public class CustomException {

	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		String str=s.nextLine();
		try
		{
			empname (str);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		}
	//declaring an exception
	 static void empname (String str) throws NameNotFound
		{
			if (str.isEmpty())
			{
			throw new NameNotFound("empname empty");	
			}
			else
			{
				System.out.println("hello" +str+ ",");
			}
		}

	}


