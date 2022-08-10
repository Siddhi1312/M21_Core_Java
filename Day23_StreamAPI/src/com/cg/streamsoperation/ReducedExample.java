package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducedExample {

	public static void main(String[] args) {
	  List<Integer>obj1=Arrays.asList(new Integer[] {24,78,56,90,45});
	  //here the ternary operator condition will comapre all the elements and return highest
	  Optional<Integer>obj2=obj1.stream().filter((i)->i>5).reduce((a,b)->a>b?a:b);
	  if(obj2.isPresent())
	  {
		  System.out.println("Result: "+obj2.get());
	  }

	}

}
