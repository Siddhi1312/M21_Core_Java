package com.cg.annotations;
//built in
class animal
{
	animal()
	{
		System.out.println("lion");
	}
	public void sound()
	{
		System.out.println("lions");
	}
}
public class SuppressWarningAnnotation {

	public static void main(String[] args) {
		@SuppressWarnings("unused")//used before unused elements
		animal a=new animal();
	}

}
