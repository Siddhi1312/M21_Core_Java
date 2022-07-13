package com.tns.decisionMaking;
import java.util.Scanner;
public class example4 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String a= s.next();
		switch(a)
		{
		case "bcd":
		System.out.println("Srivalli");
		break;
		case "def":
			System.out.println("Hossana");
			break;
		case "ghi":
			System.out.println("Ankhiyaan");
			break;
			default:
				System.out.println("Manjha");
		}
		

	}

}
