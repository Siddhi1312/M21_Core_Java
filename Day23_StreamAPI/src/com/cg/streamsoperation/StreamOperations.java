package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(10,20,30,34,34,56);
		//distinct method to print all unique elements only
		obj.stream().distinct().forEach(System.out::println);
		//limit method:to print elements upto set limit i.e here will print 1st five elements
		obj.stream().limit(5).forEach(System.out::println);
		//sorted method
		obj.stream().sorted().forEach(i->System.out.print(i+" "));//to print with space on single line
		
		

	}

}
