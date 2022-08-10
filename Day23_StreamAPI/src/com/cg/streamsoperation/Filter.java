package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		List<Float>obj=Arrays.asList(12.5f,13.4f,11.8f,23.9f);
		System.out.println(obj);
		//filtering with conditions
		obj.stream().filter(i->i>15.9f).forEach(System.out::println);
		

	}

}
