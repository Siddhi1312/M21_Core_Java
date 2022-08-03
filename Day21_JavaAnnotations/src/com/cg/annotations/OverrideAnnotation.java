package com.cg.annotations;
//built in annotation
//annotations are optional and will provide extra info about method
//@override annotation used before method which is overriden by method in parenr cls 
class car
{
	void speed (int a)
	{
		System.out.println("speed "+a+"km/hr");

	}
}
class bmw extends car
{
	@Override
	void speed(int a)
	{
		System.out.println("speed "+a+"km/hr");
	}
}

public class OverrideAnnotation {

	public static void main(String[] args) {
	bmw b=new bmw();
	b.speed(60);

	}

}
