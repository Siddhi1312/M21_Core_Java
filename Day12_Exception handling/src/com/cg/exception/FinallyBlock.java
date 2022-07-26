package com.cg.exception;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x = s.nextInt();
		try//contains code which may or may not contain exception
		{
		int r = 15/x;
		System.out.println(r);
		//System.exit(0);//no further statement will excute after this
		}
		//if any exception in try block that will be handled by catch block
		//i.e here if x=0,there will be exception 
		catch (Exception e)
		//e variable referring to exception
		{
			System.out.print("exception handled");
		}
		finally
		{//when there is an exception in finally block,it wont execute
			//int r = 15/x;
			//System.out.println(r);
			System.out.println("whether or not any exception,finally block always excutes");
		}
		System.out.println("m-21 batch");

	}

}
