package com.cg.para;
//parameterised constructor with user i/p
import java.util.Scanner;
class B
{
	int age;
	int age1;
	String employment_status;
	String employment_status1;
	B (int A,String E)// constructor arguments
	{
		age = A;
		age1 =A;
		employment_status= E;
		employment_status1 =E;
	}
	void display()// method to display
	{
		System.out.println(" "+age+" ,"+employment_status);
		System.out.println(" "+age1+" ,"+employment_status1);
		
	}
}
public class ParaConstructorUserInput {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int age= s.nextInt();
		String employment_status = s.nextLine();
		int age1 = s.nextInt();
		String employment_status1 = s.nextLine();
		B a= new B (age,employment_status);
		B b= new B (age1,employment_status1);
		a.display();// calling method for objects
		b.display();
		s.close();
		}

}
