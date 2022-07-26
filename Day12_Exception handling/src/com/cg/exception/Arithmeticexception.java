package com.cg.exception;

import java.util.Scanner;

public class Arithmeticexception {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int x = s.nextInt();
	try//contains code which may or may not contain exception
	{
	int r = 15/x;
	System.out.print(r);
	}
	//if any exception in try block that will be handled by catch block
	//i.e here if x=0,there will be exception 
	catch (Exception e)
	//e variable referring to exception
	{
		System.out.print("exception handled");
	}

}
}