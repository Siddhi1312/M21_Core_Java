package com.cg.abs;
abstract class sports
{
	void play()
	{
		System.out.println("good for health");
	}
}
class cricket extends sports
{
	//cricket inheriting sports so need to seperately define play method here
}
public class NonAbstractmethod {

	public static void main(String[] args) {
cricket c = new cricket();
//as object cant be created for abstract cls so created for child cls
c.play();
	}

}
