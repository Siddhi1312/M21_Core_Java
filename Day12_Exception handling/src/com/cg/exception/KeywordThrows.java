package com.cg.exception;
//throws keyword used to declare an exception
import java.io.IOException;

public class KeywordThrows {
	static void display(int x) throws IOException, ClassNotFoundException
	{
		if(x==5)
		{
			//throw keyword to throw an exception explicitly
//ioexception is subclass of exception so will execute exception block alongwith this statement
			throw new IOException("IOexception");
		}
		else
		{
//ClassNotfoundexception is subclass of exception so will execute exception block alongwith this statement			
			throw new ClassNotFoundException("class not found");
		}
	}

	public static void main(String[] args) {
		try
		{
			display(5);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
